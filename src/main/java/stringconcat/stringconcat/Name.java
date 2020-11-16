package stringconcat.stringconcat;

public class Name {
    private String familyName;
    private String middleName;
    private String givenName;
    private Title title;

    public Name(String familyName, String middleName, String givenName, Title title) {
        if (this.isEmpty(familyName) || this.isEmpty(givenName)) {
            throw new IllegalArgumentException("Family name and given name must not be blank.");
        }
        this.familyName = familyName;
        this.middleName = middleName;
        this.givenName = givenName;
        this.title = title;
    }

    public Name(String familyName, String middleName, String givenName) {
        if (this.isEmpty(familyName) || this.isEmpty(givenName)) {
            throw new IllegalArgumentException("Family name and given name must not be blank.");
        }
        this.familyName = familyName;
        this.middleName = middleName;
        this.givenName = givenName;
    }

    public String concatNameWesternStyle() {
        String name = "";
        if (title == null) {
            name = givenName;
        } else {
            name = title.getTitle() + " " + givenName;
        }
        name += " ";
        if (middleName == null || isEmpty(middleName)) {
            name += "";
        } else {
            name += middleName;
            name += " ";
        }
        name += familyName;
        return name;

    }

    public String concatNameHungarianStyle() {
        String name;
        if (title == null) {
            name = familyName;
        } else {
            name = title.getTitle();
            name = name.concat(" ");
            name = name.concat(familyName);
        }
        name = name.concat(" ");
        if (middleName == null || isEmpty(middleName)) {
            name = name.concat("");
        } else {
            name = name.concat(middleName);
            name = name.concat(" ");
        }
        name = name.concat(givenName);
        return name;

    }

    private boolean isEmpty(String string) {
        return string == null || string.isBlank();
    }
}
