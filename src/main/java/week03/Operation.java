package week03;

public class Operation {
    private int left;
    private int right;

    public Operation(String numberPlusNumber){
        int indexPlus = numberPlusNumber.indexOf("+");
        this.left = (int) numberPlusNumber.substring(0, indexPlus);
        this.right = (int) numberPlusNumber.substring(indexPlus +1);
    }

    public int getResult(){
        return left + right;
    }


}
