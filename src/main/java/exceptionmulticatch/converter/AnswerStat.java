package exceptionmulticatch.converter;


public class AnswerStat {

    private BinaryStringConverter binaryStringConverter;

    public AnswerStat(BinaryStringConverter binaryStringConverter) {
        this.binaryStringConverter = binaryStringConverter;
    }

    public boolean[] convert(String string) {
        try {
            return binaryStringConverter.binaryStringToBooleanArray(string);
        } catch (NullPointerException | IllegalArgumentException ex) {
            throw new InvalidBinaryStringException(ex);
        }
    }

    public int answerTruePercent(String answers) {
        boolean[] arr = convert(answers);
        int numberOfTrue = 0;
        for (boolean b : arr) {
            if (b == true) {
                numberOfTrue++;
            }
        }
        return numberOfTrue / arr.length * 100;
    }
}
