package builder.director;

import builder.builders.IBuilder;
import builder.buildings.HouseType;
import builder.components.Door;
import builder.components.DoorType;
import builder.components.Window;
import builder.components.WindowType;

public class Director {
    public void buildCastle(IBuilder builder){
        builder.setHouseType(HouseType.CASTLE);
        Door[] doors = {new Door(DoorType.ENTRY_DOOR, false), new Door(DoorType.FLUSH_DOOR, false)};
        builder.setDoor(doors);
        builder.setRoomCount(30);
        Window[] windows = {new Window(WindowType.HOPPER, false), new Window(WindowType.DOUBLE_HUNG, false)};
        builder.setWindow(windows);
    }

    public void buildHouse(IBuilder builder){
        builder.setHouseType(HouseType.HOUSE);
        Door[] doors = {new Door(DoorType.PANEL_DOOR, false), new Door(DoorType.ENTRY_DOOR, false)};
        builder.setDoor(doors);
        builder.setRoomCount(5);
        Window[] windows = {new Window(WindowType.HOPPER, false), new Window(WindowType.DOUBLE_HUNG, false)};
        builder.setWindow(windows);
    }

    public void buildApartment(IBuilder builder){
        builder.setHouseType(HouseType.APARTMENT);
        Door[] doors = {new Door(DoorType.PANEL_DOOR, false), new Door(DoorType.ENTRY_DOOR, false)};
        builder.setDoor(doors);
        builder.setRoomCount(3);
        Window[] windows = {new Window(WindowType.HOPPER, false), new Window(WindowType.DOUBLE_HUNG, false)};
        builder.setWindow(windows);
    }
}
