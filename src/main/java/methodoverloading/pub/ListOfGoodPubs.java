package methodoverloading.pub;

import java.util.ArrayList;
import java.util.List;

public class ListOfGoodPubs {
    private List<Pub> goodPubs;

    public ListOfGoodPubs(List<Pub> goodPubs) {
        if (goodPubs == null || goodPubs.size() == 0) {
            throw new IllegalArgumentException("Pub list is empty!");
        }
        this.goodPubs = new ArrayList<>(goodPubs);
    }

    public Pub findTheBest() {
        Pub bestpub = goodPubs.get(0);
        for (Pub pub : goodPubs) {
            if (pub.getOpenFrom().isEarlier(bestpub.getOpenFrom())) {
                bestpub = pub;
            }
        }
        return bestpub;
    }


}
