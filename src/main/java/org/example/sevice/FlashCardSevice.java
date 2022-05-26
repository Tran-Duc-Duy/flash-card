package org.example.sevice;

import org.example.domain.FlashCard;

import java.math.BigInteger;
import java.util.List;

public interface FlashCardSevice {
    FlashCard getFlashCardById(BigInteger Id);
    List<FlashCard> getAllSortByName();
    List<FlashCard> getAllSortByMean();
    List<FlashCard> getAllSortByID();
    List<FlashCard> getAllSortByTimeWait();

}
