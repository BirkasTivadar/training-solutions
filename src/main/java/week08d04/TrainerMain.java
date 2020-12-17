package week08d04;

public class TrainerMain {

    public static void main(String[] args) {
        GoodMood good = new GoodMood();

        Trainer trainerGood = new Trainer(good);
        Trainer trainerBad = new Trainer(new BadMood());

        System.out.println(trainerGood.giveMark());
        System.out.println(trainerBad.giveMark());

        trainerGood = new Trainer(new BadMood());
        System.out.println(trainerGood.giveMark());
    }
}
