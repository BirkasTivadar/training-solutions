package interview;

public class InterView {


    public String getThreePowers(int number) {

        if(number < 1 || number>10){
            throw new IllegalArgumentException("Number must be larger than 0 and less than 10 ");
        }

        StringBuilder result = new StringBuilder();

        int temp = 3;
        for (int i = 1; i <= number; i++) {
            result.append(temp);
            temp *= 3;
            result.append(temp);
        }

        return result.toString();
    }

}
