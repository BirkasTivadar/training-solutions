package week03;

public class Operation {
    private int left;
    private int right;

    public Operation(String numberPlusNumber){
        int indexPlus = numberPlusNumber.indexOf("+");
        this.left = Integer.parseInt(numberPlusNumber.substring(0, indexPlus));
        this.right = Integer.parseInt(numberPlusNumber.substring(indexPlus +1));
    }

    public int getResult(){
        return left + right;
    }


}
