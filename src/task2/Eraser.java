package task2;

public class Eraser implements ToolState{
    @Override
    public void onMouseClick() {
        System.out.println("Eraser: erasing a spot");
    }
    @Override
    public void onMouseDrag() {
        System.out.println("Eraser: erasing along the path");
    }
}
