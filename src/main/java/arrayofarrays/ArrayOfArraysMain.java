package arrayofarrays;

public class ArrayOfArraysMain {

    public void tombElemekKiirasa(int[][] tomb){
        for(int[] sor : tomb){
            for(int szam : sor){
                System.out.print(szam+" ");
            }
            System.out.println();
        }
    }

    public  int[][] multiplicationTable(int size) {
        int [][] szorzoTabla = new int[size][size];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                szorzoTabla[i][j] = (i+1)*(j+1);
            }
        }
        return szorzoTabla;
    }

    public int[][] triangularMatrix(int size){
        int[][] haromSzogmatrix = new int[size][];
        for(int i = 0; i < size; i++){
            haromSzogmatrix[i] = new int[i+1];
            for(int j = 0; j < haromSzogmatrix[i].length; j++){
                haromSzogmatrix[i][j] = i;
            }
        }
        return haromSzogmatrix;
    }

    public int[][] getValues(){
        int[] napokSzamaTomb = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[][] tomb = new int[12][];
        for(int i = 0; i < 12 ; i++){
            tomb[i] = new int[napokSzamaTomb[i]];
        }
        return tomb;
    }

    public static void main(String[] args) {
        ArrayOfArraysMain arrayOfArraysMain = new ArrayOfArraysMain();

        int[][] arrayOfArray = arrayOfArraysMain.multiplicationTable(3);
        arrayOfArraysMain.tombElemekKiirasa(arrayOfArray);
        System.out.println();

        arrayOfArray = arrayOfArraysMain.triangularMatrix(5);
        arrayOfArraysMain.tombElemekKiirasa(arrayOfArray);
        System.out.println();

        arrayOfArray = arrayOfArraysMain.getValues();
        arrayOfArraysMain.tombElemekKiirasa(arrayOfArray);


    }
}
