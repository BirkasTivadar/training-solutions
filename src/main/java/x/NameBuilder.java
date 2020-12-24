package x;

public class NameBuilder {

    public String concatNameWesternStyle(String familyName, String middleName, String givenName, Title title) {
        if (isEmpty(familyName) || isEmpty(givenName)) {
            throw new IllegalArgumentException("Family name and given name must not be empty!");
        }
        StringBuilder name = new StringBuilder();
        if (title != null) {
            name.append(title.getTitle()).append(" ");
        }
        name.append(givenName).append(" ");
        if (!isEmpty(middleName)) {
            name.append(middleName).append(" ");
        }
        name.append(familyName);
        return name.toString();
    }

    public String concatNameHungarianStyle(String familyName, String middleName, String givenName, Title title) {
        if (isEmpty(familyName) || isEmpty(givenName)) {
            throw new IllegalArgumentException("Family name and given name must not be empty!");
        }
        StringBuilder name = new StringBuilder();
        if (title != null) {
            name.append(title.getTitle()).append(" ");
        }
        name.append(familyName).append(" ");
        if (!isEmpty(middleName)) {
            name.append(middleName).append(" ");
        }
        name.append(givenName);
        return name.toString();

    }

    public String insertTitle(String name, Title title, String where) {
        StringBuilder newName = new StringBuilder(name);
        newName.insert(newName.indexOf(where), " " + title.getTitle());
        return newName.toString();

    }

    public String deleteNamePart(String name, String delete) {
        StringBuilder newName = new StringBuilder(name);
        newName.delete(newName.indexOf(delete), newName.indexOf(delete) + delete.length());
        return newName.toString();
    }

    private boolean isEmpty(String str) {
        return str == null || str.isBlank();
    }

}
