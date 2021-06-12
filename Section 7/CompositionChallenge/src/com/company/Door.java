package com.company;

public class Door {

    private String doorType;
    private boolean doorStatus;

    public Door(String doorType, boolean doorStatus) {
        this.doorType = doorType;
        this.doorStatus = doorStatus;
    }

    private void toggleDoor() {
        doorStatus = !doorStatus;
    }

    public void closeDoor(){
        System.out.println("Closing the door");
        if (doorStatus){
            toggleDoor();
        }

        getDoorStatus();
    }

    public void openDoor(){
        System.out.println("Opening the door");
        if (!doorStatus){
            toggleDoor();
        }

        getDoorStatus();
    }

    private void getDoorStatus(){
        if (doorStatus){
            System.out.println("The door is open");
        }
        else{
            System.out.println("The door is closed");
        }
    }

    public String getDoorType() {
        return doorType;
    }
}
