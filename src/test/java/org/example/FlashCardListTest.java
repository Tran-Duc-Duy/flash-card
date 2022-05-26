package org.example;

import org.example.domain.FlashCard;
import org.example.sevice.FlashCardSevice;
import org.example.sevice.ServiceFactory;
import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FlashCardListTest {
    private FlashCardSevice flashCardSevice;

    @Before
    public void setUp()  {
        flashCardSevice = new ServiceFactory().flashCardService();
    }

    @Test
    public void testCaseAllSortByID(){
        final List<FlashCard> actual = flashCardSevice.getAllSortByID();
        final List<FlashCard> expected = new ArrayList<>();
        expected.add(new FlashCard(BigInteger.valueOf(1), "A","AA","AAA", "AAAA",50));
        expected.add(new FlashCard(BigInteger.valueOf(2), "C","CC","CCC", "CCCC",30));
        expected.add(new FlashCard(BigInteger.valueOf(3), "B","BB","BBB", "BBBB",10));
        assertEquals(expected,actual);
    }
    @Test
    public void testCaseAllSortByName(){
        final List<FlashCard> actual = flashCardSevice.getAllSortByName();
        final List<FlashCard> expected = new ArrayList<>();
        expected.add(new FlashCard(BigInteger.valueOf(1), "A","AA","AAA", "AAAA",50));
        expected.add(new FlashCard(BigInteger.valueOf(3), "B","BB","BBB", "BBBB",10));
        expected.add(new FlashCard(BigInteger.valueOf(2), "C","CC","CCC", "CCCC",30));
        assertEquals(expected,actual);
    }
    @Test
    public void testCaseAllSortByMean(){
        final List<FlashCard> actual = flashCardSevice.getAllSortByMean();
        final List<FlashCard> expected = new ArrayList<>();
        expected.add(new FlashCard(BigInteger.valueOf(1), "A","AA","AAA", "AAAA",50));
        expected.add(new FlashCard(BigInteger.valueOf(3), "B","BB","BBB", "BBBB",10));
        expected.add(new FlashCard(BigInteger.valueOf(2), "C","CC","CCC", "CCCC",30));
        assertEquals(expected,actual);
    }
    @Test
    public void testCaseAllSortByTimeWait(){
        final List<FlashCard> actual = flashCardSevice.getAllSortByTimeWait();
        final List<FlashCard> expected = new ArrayList<>();
        expected.add(new FlashCard(BigInteger.valueOf(3), "B","BB","BBB", "BBBB",10));
        expected.add(new FlashCard(BigInteger.valueOf(2), "C","CC","CCC", "CCCC",30));
        expected.add(new FlashCard(BigInteger.valueOf(1), "A","AA","AAA", "AAAA",50));
        assertEquals(expected,actual);
    }
    private QueueFlashCard q = new QueueFlashCard();
    @Test
    public void testLearn(){
        final List<FlashCard> expected = new ArrayList<>();
        expected.add(new FlashCard(BigInteger.valueOf(3), "B","BB","BBB", "BBBB",20));
        expected.add(new FlashCard(BigInteger.valueOf(2), "C","CC","CCC", "CCCC",50));
        expected.add(new FlashCard(BigInteger.valueOf(1), "A","AA","AAA", "AAAA",140));
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(expected,q.learn(list));
    }
    @Test
    public void testSetTime(){
        FlashCard fl = flashCardSevice.getFlashCardById(BigInteger.valueOf(1));
        double beforeSet = fl.getTimeWait();
        double afterSet = q.setTime(1,fl);
        assertEquals(String.valueOf(beforeSet),String.valueOf(afterSet-10));
    }
}
