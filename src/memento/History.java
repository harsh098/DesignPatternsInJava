package memento;

import java.util.Stack;

public class History {
    private Stack<EditorState> editorStateStack;

    public History(){
        editorStateStack = new Stack<EditorState>();
    }
    public void push(EditorState s){
        this.editorStateStack.push(s);
    }
    public EditorState pop(){
        return this.editorStateStack.pop();
    }
}
