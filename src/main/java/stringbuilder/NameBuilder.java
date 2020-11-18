package stringbuilder;

public class NameBuilder {

    private boolean isBlank(String string) {
        return string == null || string.isBlank();
    }

    public String concatNameWesternStyle(String familyName, String middleName, String givenName, Title title) {
        if (isBlank(familyName) || isBlank(givenName)) {
            throw new IllegalArgumentException("Family name and given name must not be empty!");
        }

        StringBuilder name = new StringBuilder();

        if (title != null) {
            name.append(title.getTitle()).append(" ").append(givenName);
        } else {
            name.append(givenName);
        }
        if (!isBlank(middleName)) {
            name.append(" ").append(middleName);
        }
        name.append(" ").append(familyName);

        return name.toString();
    }

    public String concatNameHungarianStyle(String familyName, String middleName, String givenName, Title title) {
        if (isBlank(familyName) || isBlank(givenName)) {
            throw new IllegalArgumentException("Family name and given name must not be empty!");
        }

        StringBuilder name = new StringBuilder();

        if (title != null) {
            name.append(title.getTitle()).append(" ").append(familyName);
        } else {
            name.append(familyName);
        }
        if (!isBlank(middleName)) {
            name.append(" ").append(middleName);
        }
        name.append(" ").append(givenName);

        return name.toString();
    }
/*
    public String insertTitle(String name, Title title, String where){

    }

    public String deleteNamePart(String name, String delete){

    }*/
}
