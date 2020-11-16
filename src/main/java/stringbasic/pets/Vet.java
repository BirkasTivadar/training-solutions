package stringbasic.pets;

import java.util.ArrayList;
import java.util.List;

public class Vet {
    private List<Pet> pets = new ArrayList<>();

    public List<Pet> getPets() {
        return pets;
    }

    private boolean areEquals(Pet animalOne, Pet animalTwo) {
        return animalOne.getRegistrationNumber().equals(animalTwo.getRegistrationNumber());
    }

    public void add(Pet animal) {
        for (Pet pet : pets) {
            if (animal.getRegistrationNumber().equals(pet.getRegistrationNumber())) {
                return;
            }
        }
        pets.add(animal);
    }
}
