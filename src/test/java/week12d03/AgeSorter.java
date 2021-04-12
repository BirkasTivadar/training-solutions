package week12d03;

public class AgeSorter {

    public int[] sortAges(int[] ages) {
        if(ages == null){
            throw new IllegalArgumentException("Ages must not be null.");
        }
        int[] result = ages;
        boolean unSorted;
        do {
            unSorted = sort(result);
        } while (unSorted);
        return result;
    }

    private boolean sort(int[] result) {
        boolean unSorted = false;
        for (int i = 1; i < result.length; i++) {
            if (result[i] < result[i - 1]) {
                int temp = result[i];
                result[i] = result[i - 1];
                result[i - 1] = temp;
                unSorted = true;
            }
        }
        return unSorted;
    }
}
