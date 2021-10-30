package builder.builders;

import builder.buildings.House;
import builder.buildings.HouseType;
import builder.components.Door;
import builder.components.Window;

import java.util.Arrays;

public class HouseBuilder implements IBuilder{

    private HouseType houseType;
    private Window[] windows; // TODO: Change To ArrayList
    private int roomCount;
    private Door[] doors; // TODO: Change To ArrayList

    @Override
    public void setHouseType(HouseType houseType) {
        this.houseType = houseType;
    }

    @Override
    public void setWindow(Window[] window) {
        this.windows = window;
    }

    @Override
    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    @Override
    public void setDoor(Door[] door) {
        this.doors = door;
    }

    public House getResult(){
        return new House(houseType, windows, roomCount, doors);
    }
}
