package task2;

public class Fill implements ToolState{

    @Override
    public void onMouseClick() {
        System.out.println("Fill: filling the area with a color");
    }

    @Override
    public void onMouseDrag() {
        System.out.println("Fill: no action on drag");
    }
}
