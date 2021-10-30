package builder.buildings;

import builder.components.Door;
import builder.components.Window;

public class Catalog {
    private final HouseType houseType;
    private final Window[] windows;
    private final int roomCount;
    private final Door[] doors;

    public Catalog(HouseType houseType, Window[] windows, int roomCount, Door[] doors) {
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

    public String print(){
        StringBuilder info = new StringBuilder("The type of House :" + houseType + "\n");
        info.append("=== Has ").append(windows.length).append(" windows ===");
        for (Window window:
             windows) {
            info.append(" \n").append(window.getWindowType());
        }
        info.append(" \n").append("Total Room: ").append(roomCount).append(" \n");
        info.append("Total Doors: ").append(doors.length);
        for (Door door:
                doors) {
            info.append(" \n").append(door.getDoorType());
        }

        return info.toString();
    }
}
