package stringbasic.pets;

import java.util.ArrayList;
import java.util.List;

public class Vet {

    private List<Pet> pets = new ArrayList<>();

    public List<Pet> getPets() {
        return new ArrayList<>(pets);
    }

    private boolean areEquals(Pet animalOne, Pet animalTwo) {
        return animalOne.getRegistrationNumber().equals(animalTwo.getRegistrationNumber());
    }

    public void add(Pet animal) {
        if (pets.stream().noneMatch(pet -> areEquals(pet, animal))) {
            pets.add(animal);
        }
    }
}
