package array;

public class ArrayHandler {

    public boolean contains(int[] source, int itemTofind) {
        for (int i : source) {
            if (i == itemTofind) {
                return true;
            }
        }
        return false;
    }

    public int find(int[] source, int itemToFind) {
        for (int i = 0; i < source.length; i++) {
            if (source[i] == itemToFind) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        ArrayHandler arrayHandler = new ArrayHandler();

        int[] testArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int testNumber = (int) (Math.random() * 20);

        System.out.println(testNumber);

        System.out.println(arrayHandler.contains(testArray, testNumber));

        System.out.println();

        int[] testArrayToFindIndex = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int testNumberToFindIndex = (int) (Math.random() * 15);

        System.out.println(testNumberToFindIndex);

        System.out.println(arrayHandler.find(testArrayToFindIndex, testNumberToFindIndex));
    }
}

