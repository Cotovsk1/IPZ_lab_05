package task2;

/**
 * Canvas holds the currently selected ToolState and forwards user events to it.
 *
 * It acts as the context object in the State/Strategy pattern: different tools
 * implement `ToolState` and alter how mouse events are handled.
 */
public class Canvas {
    private ToolState currentTool;

    /**
     * Set the active tool for the canvas.
     *
     * @param tool a ToolState implementation (may be null)
     */
    public void setCurrentTool(ToolState tool){
        this.currentTool = tool;
    }

    /**
     * Simulate a mouse click event on the canvas; delegated to the active tool.
     */
    public void mouseClick(){
        if (currentTool != null) {
            currentTool.onMouseClick();
        }else {
            System.out.println("No tool selected");
        }
    }

    /**
     * Simulate a mouse drag event on the canvas; delegated to the active tool.
     */
    public void mouseDrag(){
        if (currentTool != null) {
            currentTool.onMouseDrag();
        }else {
            System.out.println("No tool selected");
        }
    }

}
