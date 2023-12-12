package state;

public class Canvas {
    private Tooltype currentTool;
    public void mouseDown(){
        if(currentTool==Tooltype.SELECTION)
            System.out.println("Selection Icon");
        else if(currentTool==Tooltype.BRUSH)
            System.out.println("Brush Icon");
        else if(currentTool==Tooltype.ERASER)
            System.out.println("Eraser Icon");
    }
    public void mouseUp(){
        if(currentTool==Tooltype.SELECTION)
            System.out.println("Draw Dashed Rectangle");
        else if(currentTool==Tooltype.BRUSH)
            System.out.println("Draw a Line");
        else if(currentTool==Tooltype.ERASER)
            System.out.println("Eraser Smth");
    }

    public Tooltype setCurrentTool() {
        return this.currentTool;
    }
    public void setCurrentTool(Tooltype currentTool) {
        this.currentTool = currentTool;
    }
}
