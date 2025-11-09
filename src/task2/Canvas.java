package task2;

public class Canvas {
    private ToolState currentTool;

    public void setCurrentTool(ToolState tool){
        this.currentTool = tool;
    }

    public void mouseClick(){
        if (currentTool != null) {
            currentTool.onMouseClick();
        }else {
            System.out.println("No tool selected");
        }
    }

    public void mouseDrag(){
        if (currentTool != null) {
            currentTool.onMouseDrag();
        }else {
            System.out.println("No tool selected");
        }
    }

}
