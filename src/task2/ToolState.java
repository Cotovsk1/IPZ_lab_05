package task2;

/**
 * ToolState declares the behaviour for a drawing tool on the canvas.
 *
 * Implementations handle mouse actions such as click and drag.
 */
public interface ToolState {
    /** Handle a mouse click event. */
    void onMouseClick();
    /** Handle a mouse drag event. */
    void onMouseDrag();
}
