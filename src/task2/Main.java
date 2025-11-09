package task2;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nHello World!");


        Canvas canvas = new Canvas();

        ToolState pen = new Pen();
        ToolState eraser = new Eraser();
        ToolState brush = new Brush();
        ToolState fill = new Fill();

        //pen
        canvas.setCurrentTool(pen);
        System.out.println("\nUsing pen:");
        canvas.mouseClick();
        canvas.mouseDrag();

        //brush (switching)
        canvas.setCurrentTool(brush);
        System.out.println("\nUsing brush:");
        canvas.mouseClick();
        canvas.mouseDrag();

        //fill (switching)
        canvas.setCurrentTool(fill);
        System.out.println("\nUsing fill:");
        canvas.mouseClick();
        canvas.mouseDrag();

        //eraser (switching)
        canvas.setCurrentTool(eraser);
        System.out.println("\nUsing eraser:");
        canvas.mouseClick();
        canvas.mouseDrag();
    }
}
