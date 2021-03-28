package lambdacomparator.cloud;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Clouds {

    public CloudStorage alphabeticallyFirst(List<CloudStorage> cloudStorages) {
        List<CloudStorage> result = new ArrayList<>(cloudStorages);
        result.sort(Comparator.comparing(CloudStorage::getProvider, Comparator.comparing(String::toLowerCase)));
        return result.get(0);
    }

    public CloudStorage bestPriceForShortestPeriod(List<CloudStorage> cloudStorages) {
        List<CloudStorage> result = new ArrayList<>(cloudStorages);
        result.sort(Comparator.comparing(CloudStorage::getPeriod, Comparator.nullsFirst(Comparator.naturalOrder())).thenComparing(CloudStorage::getPrice));
        return result.get(0);
    }

    public List<CloudStorage> worstOffers(List<CloudStorage> cloudStorages) {
        List<CloudStorage> result = new ArrayList<>(cloudStorages);
        result.sort(Comparator.reverseOrder());
        return result.subList(0, Math.min(result.size(), 3));
    }


}
