package week09d03;

import java.util.Random;

public class Person {
    private String name;
    private int age;
    private Present present;

    public Person(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public void setPresent(){
        if(age >0 && age <= 14){
            Random rnd = new Random();
            int i = rnd.nextInt(4);
            present = Present.values()[i];
         }

        present = null;

    }
}
