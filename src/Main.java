public class Main {
    public static void main(String[] args) {
       drawUIControl(new TextControl());
       drawUIControl(new CheckBox());
    }

    public static void drawUIControl(UIControls control){
        control.draw();
    }
}