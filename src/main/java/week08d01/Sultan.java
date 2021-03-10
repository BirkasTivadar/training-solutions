package week08d01;

import java.util.ArrayList;
import java.util.List;

public class Sultan {
    /*
        public List<String> openDoors(){
            List<String> openedDoors = new ArrayList<>();
            boolean[] stateOfDoors = new boolean[100];
            for(int day= 1; day<=100; day++){
                for(int lock = 1; lock<=100; lock++){
                    if(lock>=day && lock%day == 0){
                        stateOfDoors[lock-1] = change(stateOfDoors[lock-1]);
                    }
                }
            }
            for(int i =0; i<100; i++){
                if(stateOfDoors[i] == true){
                    String door = (i+1)+". ajtó";
                    openedDoors.add(door);
                }
            }
            return openedDoors;
        }

        private boolean change(boolean boole){
            return !boole;
        }
    */
    public List<String> openDoors() {
        List<String> openedDoors = new ArrayList<>();
        int[] stateOfDoors = new int[100];
        for (int day = 1; day <= 100; day++) {
            for (int lock = 1; lock <= 100; lock++) {
                if (lock >= day && lock % day == 0) {
                    stateOfDoors[lock - 1]++;
                }
            }
        }
        for (int i = 0; i < 100; i++) {
            if (stateOfDoors[i] % 2 != 0) {
                String door = (i + 1) + ". ajtó";
                openedDoors.add(door);
            }
        }
        return openedDoors;
    }

  /*  Szarka Endre megoldása
    for (int i = 1; i <=100 ; i++) {
        for (int j = i; j <= 100; j = j + i) {
            door[j] = !door[j];
        }
    }
     */

    public static void main(String[] args) {
        Sultan sultan = new Sultan();
        System.out.println(sultan.openDoors());

    }

}
