package builder.builders;

import builder.buildings.HouseType;
import builder.components.Door;
import builder.components.Window;

public interface IBuilder {
    void setHouseType(HouseType houseType);
    void setWindow(Window[] window);
    void setRoomCount(int roomCount);
    void setDoor(Door[] door);
}
