package statemachine.elevator;

import java.util.ArrayList;
import java.util.List;

public class Elevator {
    private ElevatorState state;
    private boolean calledOnGroundFloor;
    private boolean calledOnFirstFloor;
    private DirectionType direction;
    private List<String> history = new ArrayList<>();

    public Elevator(){
        setState(new GroundFloorOpen(this));
        setCalledOnGroundFloor(false);
        setCalledOnFirstFloor(false);
        setDirection(DirectionType.NONE);
    }

    public Elevator(ElevatorState state){
        setDirection(DirectionType.NONE);
        setCalledOnFirstFloor(false);
        setCalledOnGroundFloor(false);
        setState(state);
    }

    public void pushCallButtonOnFirstFloor(){
        calledOnFirstFloor = true;
        if(direction == DirectionType.NONE){
            direction = DirectionType.UP;
        }
    }

    public void pushCallButtonOnGroundFloor(){
        calledOnGroundFloor = true;
        if(direction == DirectionType.NONE){
            direction = DirectionType.DOWN;
        }
    }

    public void pushButtonToGoToFirstFloor(){
        if(state.getStateInfo().equals("Ground Floor Open")){
            direction = DirectionType.UP;
        }
    }

    public void pushButtonToGoToGroundFloor(){
        if(state.getStateInfo().equals("First Floor Open")){
            direction = DirectionType.DOWN;
        }
    }
/*
    public String getStateInfo() {
        return state.getStateInfo();
    }*/

    public void work(){
        while(direction != DirectionType.NONE){
            state.changeState(this);
        }
    }

    public boolean isCalledOnGroundFloor() {
        return calledOnGroundFloor;
    }

    public boolean isCalledOnFirstFloor() {
        return calledOnFirstFloor;
    }

    public DirectionType getDirection() {
        return direction;
    }

    public String getHistory() {
        return history.toString();
    }

    public void setState(ElevatorState state) {
        history.add(state.getStateInfo());
        this.state = state;
    }

    public void setCalledOnGroundFloor(boolean calledOnGroundFloor) {
        this.calledOnGroundFloor = calledOnGroundFloor;
    }

    public void setCalledOnFirstFloor(boolean calledOnFirstFloor) {
        this.calledOnFirstFloor = calledOnFirstFloor;
    }

    public void setDirection(DirectionType direction) {
        this.direction = direction;
    }

}
