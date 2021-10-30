package builder.components;

public class Door {

    private final DoorType doorType;
    private boolean isOpen;

    public Door(DoorType doorType, boolean isOpen) {
        this.doorType = doorType;
        this.isOpen = isOpen;
    }

    public DoorType getDoorType() {
        return doorType;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }
}
