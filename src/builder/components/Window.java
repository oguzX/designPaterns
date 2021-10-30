package builder.components;

public class Window {

    private final WindowType windowType;
    private boolean open;

    public Window(WindowType windowType, boolean open) {
        this.windowType = windowType;
        this.open = open;
    }

    public WindowType getWindowType() {
        return windowType;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }
}
