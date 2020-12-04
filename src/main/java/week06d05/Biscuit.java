package week06d05;

public class Biscuit {
    private BiscuitType type;
    private int gramAmount;

    public Biscuit(BiscuitType type, int gramAmount) {
        if(gramAmount<1){
            throw new IllegalArgumentException();
        }
        this.type = type;
        this.gramAmount = gramAmount;
    }

    public Biscuit(BiscuitType type) {
        if(type == null){
            throw new IllegalArgumentException();
        }
        this.type = type;
    }

    public BiscuitType getType() {
        return type;
    }

    public int getGramAmount() {
        return gramAmount;
    }

    public static Biscuit of(BiscuitType type, int gramAmount) {
        return new Biscuit(type, gramAmount);
    }

    public String toString() {
        return "Type: " + type + ", amount: " + gramAmount + " gr";
    }

}
