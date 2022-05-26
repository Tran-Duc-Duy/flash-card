package org.example;

import org.example.domain.FlashCard;
import org.example.sevice.FlashCardSevice;
import org.example.sevice.ServiceFactory;

import java.util.List;

public class QueueFlashCard {
    public QueueFlashCard() {
    }

    public double setTime(int choose, FlashCard flashCard){
        return 0;
        /*if(choose==1){
            flashCard.setTimeWait(flashCard.getTimeWait()+10);
        }else if(choose==2){
            flashCard.setTimeWait(flashCard.getTimeWait()+20);
        }else {
            flashCard.setTimeWait(flashCard.getTimeWait()+90);
        }
        return flashCard.getTimeWait();*/
    }
    FlashCardSevice flashCardSevice=new ServiceFactory().flashCardService();
    List<FlashCard> flashCardShow= flashCardSevice.getAllSortByTimeWait();

    public List<FlashCard> learn(List<Integer> list ){
        return null;
        /*for(int i=0;i<flashCardShow.size();i++){
            setTime(list.get(i), flashCardShow.get(i));
        }
        return flashCardShow;*/
    }
}
