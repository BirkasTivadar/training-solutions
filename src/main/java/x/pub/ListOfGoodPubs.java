package x.pub;

import java.util.ArrayList;
import java.util.List;

public class ListOfGoodPubs {
    private List<Pub> goodPubs = new ArrayList<>();

    public ListOfGoodPubs(List<Pub> goodPubs) {
        if (null == goodPubs || goodPubs.size() < 1) {
            throw new IllegalArgumentException("Pub list is empty!");
        }
        this.goodPubs = goodPubs;
    }

    public List<Pub> getGoodPubs() {
        return goodPubs;
    }

    public Pub findTheBest() {
        Pub best = goodPubs.get(0);
        for (Pub pub : goodPubs) {
            if (pub.getOpenFrom().isEarlier(best.getOpenFrom())) {
                best = pub;
            }
        }
        return best;
    }
}
