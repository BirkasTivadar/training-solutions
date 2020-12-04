package week06d05;

public class Biscuit {
    private BiscuitType type;
    private int gramAmount;

    public Biscuit(BiscuitType type, int gramAmount) {
        this(type);
        if (gramAmount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero.");
        }
        this.gramAmount = gramAmount;
    }

    public Biscuit(BiscuitType type) {
        if (type == null) {
            throw new IllegalArgumentException("Invalid data.");
        }
        this.type = type;
    }

    public BiscuitType getTpye() {
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
