import memento.Editor;
import memento.History;
import state.Brush;
import state.Canvas;

public class Main {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        canvas.setCurrentTool(new Brush());
        canvas.mouseDown();
        canvas.mouseUp();

    }
}