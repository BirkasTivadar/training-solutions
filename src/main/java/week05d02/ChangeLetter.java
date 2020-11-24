package week05d02;

public class ChangeLetter {

    public String chargeVowels(String text){
        String newString = "";
        String vowels = "aeiou";
        String textLower = text.toLowerCase();
        for(int i=0; i < vowels.length(); i++){
            if(vowels.indexOf(textLower.charAt(i)) > -1){
                newString += "*";
            }
            else {
                newString += textLower.charAt(i);
            }
        }
        return newString;

    }
}
