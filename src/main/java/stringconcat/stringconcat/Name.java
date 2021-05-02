package stringconcat.stringconcat;


public class Name {

    private static final String WHITESPACE = " ";

    private String familyName;

    private String middleName;

    private String givenName;

    private Title title;

    public Name(String familyName, String middleName, String givenName) {
        if (isEmpty(familyName) || isEmpty(givenName)) {
            throw new IllegalArgumentException("Family name and given name must not be empty!");
        }
        this.familyName = familyName;
        this.middleName = middleName;
        this.givenName = givenName;
    }

    public Name(String familyName, String middleName, String givenName, Title title) {
        this(familyName, middleName, givenName);
        this.title = title;
    }


    public String concatNameWesternStyle() {

        StringBuilder result = new StringBuilder();

        if (title != null) {
            result.append(title.getTitle()).append(WHITESPACE);
        }

        result.append(givenName).append(WHITESPACE);

        if (!isEmpty(middleName)) {
            result.append(middleName).append(WHITESPACE);
        }

        result.append(familyName);

        return result.toString();
    }


    public String concatNameHungarianStyle() {

        StringBuilder result = new StringBuilder();

        if (title != null) {
            result.append(title.getTitle()).append(WHITESPACE);
        }

        result.append(familyName).append(WHITESPACE);

        if (!isEmpty(middleName)) {
            result.append(middleName).append(WHITESPACE);
        }

        result.append(givenName);

        return result.toString();
    }


    private boolean isEmpty(String str) {
        return str == null || str.isBlank();
    }

}
