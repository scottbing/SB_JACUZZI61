package com.company;

public class JacuzziMediumCommand  implements Command {

    ElectronicDevice theDevice;
    public JacuzziMediumCommand (ElectronicDevice newDevice) {
        theDevice = newDevice;
    }

    @Override
    public void execute() {
        theDevice.medium();
    }

    @Override
    public void undo() {
        theDevice.on();
    }
}