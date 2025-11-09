package task2;

public class Brush implements ToolState{

    @Override
    public void onMouseClick() {
        System.out.println("Brush: drawing a thick point");
    }
    @Override
    public void onMouseDrag() {
        System.out.println("Brush: erasing a thick line");
    }
}
