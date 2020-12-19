package x;

public class Operators {

    public boolean isEven(int n) {
        return n % 2 == 0;
    }

  public int multiplyByPowerOfTwo(int number, int multTwo){
        return Integer.parseInt(Integer.toBinaryString(number<<multTwo),2);
  }
}
