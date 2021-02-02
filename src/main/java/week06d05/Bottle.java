package week06d05;

public class Bottle {
    private BottleType type;
    private int filledUntil;

    public Bottle(BottleType type) {
        this.type = type;
        this.filledUntil = type.getMaximumAmount();
    }

    public static Bottle of(BottleType type){
        return new Bottle(type);
    }

    public BottleType getType() {
        return type;
    }

    public int getFilledUntil() {
        return filledUntil;
    }

    public void fill(int fillAmount){
        if(fillAmount > filledUntil){
            throw new IllegalArgumentException("Fillamount is too much.");
        }
        filledUntil -= fillAmount;
    }

    public static void main(String[] args) {
        Bottle bottle = Bottle.of(BottleType.PET_BOTTLE);

        System.out.println(bottle.getFilledUntil());

        bottle.fill(34);
        System.out.println(bottle.getFilledUntil());
        bottle.fill(70);
    }
}
