package week04;

public class NameChanger {

    private String fullName;

    public NameChanger(String fullName) {
        if(fullName == null || fullName.isBlank()){
            throw new IllegalArgumentException("Invalid Name: " + fullName);
        }
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public String changeFirstName(String otherFirstName){
        int index = fullName.indexOf(" ");
        String name = fullName.substring(0, index);
        return name + " " + otherFirstName;
    }
}
