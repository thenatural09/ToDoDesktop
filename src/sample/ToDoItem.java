package sample;

/**
 * Created by Troy on 9/27/16.
 */
public class ToDoItem {
    String text;
    boolean isDone;

    public ToDoItem(String text, boolean isDone) {
        this.text = text;
        this.isDone = isDone;
    }

    @Override
    public String toString() {
        String checkbox = "[ ]";
        if (isDone) {
            checkbox = "[x]";
        }
        return String.format("%s %s",checkbox,text);
    }
}
