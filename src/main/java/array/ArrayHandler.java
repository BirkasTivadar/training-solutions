package array;

public class ArrayHandler {

    public static boolean contains(int[] source, int itemTofind) {
        boolean benneVan = false;
        for(int i : source) {
            if(i == itemTofind){
                benneVan = true;
            }
        }
        return benneVan;
    }

    public static int find(int[] source, int itemToFind){
        for(int i = 0; i < source.length; i++) {
            if(source[i] == itemToFind){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] probaTombContains = {1,2,3,4,5,6,7,8,9,10};
        int probaSzamContains = (int)(Math.random()*20);
        System.out.println(probaSzamContains);
        System.out.println(contains(probaTombContains, probaSzamContains));
        System.out.println();

        int[] probaTombFind = {1,2,3,4,5,6,7,8,9,10};
        int probaSzamFind = (int)(Math.random()*15);
        System.out.println(probaSzamFind);
        System.out.println(find(probaTombFind, probaSzamFind));


    }
}

