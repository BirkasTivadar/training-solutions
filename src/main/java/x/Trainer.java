package x;


public class Trainer {

    private long id;
    private String name;

    public Trainer(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
