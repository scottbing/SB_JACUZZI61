package com.company;

public class JacuzziHighCommand  implements Command {

    int prevSpeed;

    ElectronicDevice theDevice;
    public JacuzziHighCommand (ElectronicDevice newDevice) {
        theDevice = newDevice;
    }

    @Override
    public void execute() {
        theDevice.high();
    }

    @Override
    public void undo() {
    }
}