package week12d03;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberStat {

    private List<Integer> numbers= new ArrayList<>();

    public int minimumOnceNumber(){
        if(numbers == null || numbers.size()< 1){
            throw new IllegalArgumentException("List is empty.");
        }
        if(numbers.size() == 1){
            return numbers.get(0);
        }
        List<Integer> sortedNumbers = new ArrayList<>(numbers);
        Collections.sort(sortedNumbers);
        for(int i=1 ; i< sortedNumbers.size();i++){
            if(sortedNumbers.get(i) != sortedNumbers.get(i-1)){
                return sortedNumbers.get(i-1);
            }
        }
       throw new IllegalStateException("Is not this number.");
    }

    public String readFromFile(Path file){
        StringBuilder str = new StringBuilder();
        List<String> numbersLists = new ArrayList<>();
        try {
            List <String> numberList = Files.readAllLines(file);
            numbersLists = numberList;

        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
        for(String numbersList : numbersLists){
            str.append(numbersList).append(",");
        }
        return str.toString().substring(0, str.toString().length()-1);
    }

    private void toListFromString(String numbersString){
        String[] numbersArray = numbersString.split(",");
        for(String number :numbersArray){
            numbers.add(Integer.parseInt(number));
        }
     }
}
