package task2;

public class Pen implements ToolState {

    @Override
    public void onMouseClick() {
        System.out.println("Pen: drawing a point");
    }
    @Override
    public void onMouseDrag() {
        System.out.println("Pen: drawing a line");
    }

}
