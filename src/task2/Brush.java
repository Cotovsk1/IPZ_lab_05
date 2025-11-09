package task2;

/**
 * Brush tool: draws or erases with a thicker stroke than the pen.
 *
 * This implementation prints actions to the console. In a full application,
 * brush size and color would affect the rendering.
 */
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
