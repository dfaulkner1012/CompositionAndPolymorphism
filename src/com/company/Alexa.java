package com.company;

public class Alexa {
    private Door aDoor;
    private LightSwitch aLightSwitch;

    public Alexa(Door aDoor, LightSwitch aLightSwitch) {
        this.aDoor = aDoor;
        this.aLightSwitch = aLightSwitch;
    }

    public Door getaDoor() {
        return aDoor;
    }

    public void setaDoor(Door aDoor) {
        this.aDoor = aDoor;
    }

    public LightSwitch getaLightSwitch() {
        return aLightSwitch;
    }

    public void setaLightSwitch(LightSwitch aLightSwitch) {
        this.aLightSwitch = aLightSwitch;
    }

    public void OpenOrCloseDoor() {
        aDoor.OpenOrCloseDoor();
    }

    public void flipSwitch() {
        aLightSwitch.flipSwitch();
    }

    public void printStatus() {
        System.out.println("The light is on = " + aLightSwitch.getOn() + " The door is open = " + aDoor.getOpen());
    }
}
