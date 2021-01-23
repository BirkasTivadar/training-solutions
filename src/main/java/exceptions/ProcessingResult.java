package exceptions;

public enum ProcessingResult {
    NO_ERROR(0),
    WORD_COUNT_ERROR(2),
    VALUE_ERROR(4),
    DATE_ERROR(8),
    VALUE_AND_DATE_ERROR(12);

    private int codeNumber;

    ProcessingResult(int codeNumber) {
        this.codeNumber = codeNumber;
    }

    public int getCodeNumber() {
        return codeNumber;
    }
}
