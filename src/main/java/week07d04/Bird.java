package week07d04;

public abstract class Bird extends Animal {
    private int eggs;

    public int getEggs() {
        return eggs;
    }

    public Bird(String name, int eggs) {
        super(name);
        this.eggs = eggs;
    }


    public void layEggs(int numberOfEggs) {
        eggs += numberOfEggs;
    }
}
