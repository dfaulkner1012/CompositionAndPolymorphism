package com.company;

public class LightSwitch {
    private Boolean On;

    public LightSwitch(Boolean on) {
        On = on;
    }

    public Boolean getOn() {
        return On;
    }

    public void setOn(Boolean on) {
        On = on;
    }

    public void flipSwitch() {
        if (On == true) {
            On = false;
        }
        else {
           On = true;
        }
    }
}
