import memento.Editor;
import memento.History;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        History history = new History();

        editor.setContent("A");
        history.push(editor.createState());
        editor.setContent("B");
        history.push(editor.createState());
        editor.setContent("C");
        editor.restore(history.pop());
        editor.restore(history.pop());
        System.out.println(editor.getContent());

    }
}