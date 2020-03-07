package com.company;

public class Main {

    public static void main(String[] args) {
	    /*
            CHALLENGE:
            Step 1:
            Create a class called LightSwitch with one field to represent whether the
            light is on.
            Create a constructor, getter, setter. Add additional method to turn the
            light on or off.
            Step 2:
            Create another class called Door with one field to represent whether the
            door is open.
            Create a constructor, getter, setter. Add additional method to close or
            open the door.
            Step 3:
            Create another class called Alexa. Use composition to give it a
            LightSwitch and Door.
            Create a constructor, getter, setter.
            Add methods in the Alexa class to turn on/off a light and open/close
            a door. Have it also print the status of the light and door.
            Step 4:
            In Main class, create objects to represent each class.
            Invoke the methods on your Alexa object that turn the light on/off and
            open/close the door.
        */
	    Door aDoor = new Door(true);
	    LightSwitch aLightSwitch = new LightSwitch(true);
	    Alexa alexaApp = new Alexa(aDoor,aLightSwitch);
		alexaApp.OpenOrCloseDoor();
	    alexaApp.flipSwitch();
		alexaApp.printStatus();
    }
}
