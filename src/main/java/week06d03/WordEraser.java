package week06d03;

public class WordEraser {

    public String eraseWord(String words, String word){
        String result = words.substring(0, words.indexOf(word));
        while(words.indexOf(word) > -1){
            int index = words.indexOf(word);
            if(words.
            result = words.substring(0, index);
            words = words.substring(index + word.length());
        }
        return result;
    }
}


