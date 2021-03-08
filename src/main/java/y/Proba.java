package y;


import java.util.List;

public class Proba {

    public String findPerfectMatch(int number) {
        List<String> words = List.of("ninetyeight", "five", "eight", "ten", "thirteen");
        String perfect = null;

        for(String word: words) {
            System.out.println(word);
            if(Math.abs(word.length() - number) > number) {
                continue;
            }
            if(word.length() == number) {
                perfect = word;
                System.out.println(word);
                break;
            }
            int newLength = word.length() > number ? number : word.length();
            perfect = word.substring(0, newLength);
            System.out.println(perfect);
        }

        return perfect;
    }


    public static void main(String[] args) {
        System.out.println(new Proba().findPerfectMatch(5));

    }



}
