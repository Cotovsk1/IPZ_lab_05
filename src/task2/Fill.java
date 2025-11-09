package task2;

/**
 * Fill tool: fills a contiguous area with a chosen color.
 *
 * In this example the tool prints actions to the console. A real fill would
 * implement a flood-fill algorithm on the canvas bitmap or call a renderer API.
 */
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
