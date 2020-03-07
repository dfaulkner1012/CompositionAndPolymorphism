package com.company;

public class Door {
    private Boolean open;

    public Door(Boolean open) {
        this.open = open;
    }

    public Boolean getOpen() {
        return open;
    }

    public void setOpen(Boolean open) {
        this.open = open;
    }

    public void OpenOrCloseDoor() {
        if (open == true) {
            open = false;
        }
        else {
            open = true;
        }
    }
}
