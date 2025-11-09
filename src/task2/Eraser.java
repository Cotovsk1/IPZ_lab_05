package task2;

/**
 * Eraser tool: removes content from the canvas.
 *
 * This simple implementation prints actions to the console; a real eraser would
 * modify the drawing buffer or call a renderer to remove pixels in the path.
 */
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
