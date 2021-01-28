package colletionsset.collectionshashset;

import java.util.*;

public class StringsHandler {

    public Set<String> filterUniqueStrings(Collection<String> stringCollection) {
        if (stringCollection == null || stringCollection.isEmpty()) {
            throw new IllegalArgumentException("Invalid collection");
        }
        if (stringCollection.size() == 1) {
            return new HashSet<>(stringCollection);
        }

        List<String> list = new ArrayList<>(stringCollection);
        Collections.sort(list);
        Set<String> result = new HashSet<>();

        String firstItem = list.get(0);

        if (!firstItem.equals(list.get(1))) {
            result.add(list.get(0));
        }

        String lastItem = list.get(list.size() - 1);

        for (int i = 1; i < list.size() - 1; i++) {
            if (!list.get(i).equals(list.get(i - 1)) && !list.get(i).equals(list.get(i + 1))) {
                result.add(list.get(i));
            }
        }
        if (!lastItem.equals(list.get(list.size() - 2))) {
            result.add(lastItem);
        }

        return result;
    }

    public Set<String> selectIdenticalStrings(Set<String> setA, Set<String> setB) {
        Set<String> result = new HashSet<>();
        for (String str : setA) {
            if (setB.contains(str)) {
                result.add(str);
            }
        }
        return result;
    }
}
