package week07d01;

import static week07d01.Trainer.getNumberOfTrainer;

public class TrainerMain {

    public static void main(String[] args) {
        System.out.println(getNumberOfTrainer());
        Trainer kungfu = new Trainer("Bruce Lee");
        Trainer box = new Trainer("Józsibá");
        System.out.println(getNumberOfTrainer());


    }
}
