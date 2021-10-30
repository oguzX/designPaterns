package builder.buildings;

import builder.components.Door;
import builder.components.Window;

public class House {
    private final HouseType houseType;
    private final Window[] windows;
    private final int roomCount;
    private final Door[] doors;

    public House(HouseType houseType, Window[] windows, int roomCount, Door[] doors) {
        this.houseType = houseType;
        this.windows = windows;
        this.roomCount = roomCount;
        this.doors = doors;
    }

    public HouseType getHouseType() {
        return houseType;
    }

    public Window[] getWindows() {
        return windows;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public Door[] getDoors() {
        return doors;
    }
}
