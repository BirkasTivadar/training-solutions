package ioreader.states;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class StateRegister {

    private List<State> states = new ArrayList<>();

    public List<State> getStates() {
        return new ArrayList<>(states);
    }

    public void readStatesFromFile(String stringFileName) {
        Path path = Path.of(stringFileName);
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String stateName = line.split("-")[0];
                String capital = line.split("-")[1];
                states.add(new State(stateName, capital));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can't read file!", ioe);
        }
    }

    public String findCapitalByStateName(String stateName){
        for(State state : states){
            if(state.getStateName().equals(stateName)){
                return state.getCapital();
            }
        }
        throw new IllegalArgumentException("No state with this name!");
    }
}
