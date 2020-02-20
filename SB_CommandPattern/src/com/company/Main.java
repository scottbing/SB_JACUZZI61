package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ElectronicDevice sonyTV = DeviceFactory.getDevice(DeviceFactory.DeviceEnum.TV);
        ElectronicDevice geFan = DeviceFactory.getDevice(DeviceFactory.DeviceEnum.FAN);
        ElectronicDevice hotTub = DeviceFactory.getDevice(DeviceFactory.DeviceEnum.JACUZZI);

        int numOfEnums = DeviceFactory.DeviceEnum.values().length;
        RemoteControl remote = new RemoteControl((numOfEnums));

        TurnDeviceOn onCommand = new TurnDeviceOn(sonyTV);
        TurnDeviceOff offCommand = new TurnDeviceOff(sonyTV);
        remote.setCommand(0, onCommand, offCommand);
        remote.pressonButton(0);
        remote.pressoffButton(0);

        TurnDeviceOn onHotTubCommand = new TurnDeviceOn(hotTub);
        TurnDeviceOff offHotTubHCommand = new TurnDeviceOff(hotTub);
        remote.setCommand(0, onHotTubCommand, offHotTubHCommand);
        remote.pressonButton(0);
        remote.pressoffButton(0);

        JacuzziMediumCommand JacuzziMedium = new JacuzziMediumCommand(hotTub);
        JacuzziHighCommand JacuzziHigh = new JacuzziHighCommand(hotTub);
        remote.setCommand(0, JacuzziMedium, offHotTubHCommand);
        remote.pressonButton(0);
        remote.pressoffButton(0);
        //remote.pressUndo();

        remote.setCommand(0, JacuzziMedium, offHotTubHCommand);
        remote.setCommand(1, JacuzziHigh, offHotTubHCommand);
        remote.pressonButton(1);
        remote.pressoffButton(0);
        //remote.pressUndo();

    }
}
