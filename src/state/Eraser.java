package state;

public class Eraser implements Tool{
    @Override
    public void mouseUp() {
        System.out.println("Erase Something");
    }

    @Override
    public void mouseDown() {
        System.out.println("Eraser Tool");
    }
}
