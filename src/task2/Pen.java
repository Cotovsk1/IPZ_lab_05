package task2;

/**
 * Pen tool: draws thin points and lines on the canvas.
 *
 * This simple implementation prints actions to the console. Replace with
 * rendering logic to integrate with a GUI or drawing backend.
 */
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
