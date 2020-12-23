package stringconcat.stringconcat;


public class Name {
    private String familyName;
    private String middleName = "";
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

    private boolean isEmpty(String str) {
        return str == null || str.isBlank();
    }

    public String concatNameWesternStyle() {
        String result = "";
        if (title != null) {
            result += title.getTitle() + " ";
        }
        result += givenName + " ";
        if (!isEmpty(middleName)) {
            result += middleName + " ";
        }
        result += familyName;
        return result;
    }

    public String concatNameHungarianStyle() {
        String result = "";
        if (title != null) {
            result = result.concat(title.getTitle()).concat(" ");
        }
        result = result.concat(familyName).concat(" ");
        if (!isEmpty(middleName)) {
            result = result.concat(middleName).concat(" ");
        }
        result = result.concat(givenName);
        return result;
    }


}
