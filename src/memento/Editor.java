package memento;

public class Editor {
    private String content;

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public EditorState createState(){
        return new EditorState(this.content);
    }
    public void restore(EditorState s){
        this.content = s.getContent();
    }
}
