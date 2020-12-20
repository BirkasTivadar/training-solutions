package catalog;

import java.util.ArrayList;
import java.util.List;

public class AudioFeatures implements Feature {
    private List<String> composer;
    private int length;
    private List<String> performers;
    private String title;

    public AudioFeatures(String title, int length, List<String> performers) {
        if(isBlank(title)|| length < 1 || performers.size() < 1){
            throw new IllegalArgumentException("Invalid data");
        }
        this.title = title;
        this.length = length;
        this.performers = new ArrayList<>(List.copyOf(performers));
    }

    public AudioFeatures(String title, int length, List<String> performers, List<String> composer) {
        this(title, length, performers);
        this.composer = new ArrayList<>(List.copyOf(composer));
    }

    @Override
    public List<String> getContributors() {
        List<String> contributors = new ArrayList<>();
        if(composer != null){
            contributors.addAll(List.copyOf(composer));
        }
        contributors.addAll(List.copyOf(performers));
        return List.copyOf(contributors);
    }

    @Override
    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    private boolean isBlank(String str){
        return str == null || str.isBlank();
    }
}
