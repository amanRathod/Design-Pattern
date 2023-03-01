package memento;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        History history = new History();

        editor.setContent("aman");
        history.push(editor.createState());

        editor.setContent("Kumar");
        history.push(editor.createState());

        editor.setContent("singh");
        history.push(editor.createState());

        editor.setContent("Rathod");
        editor.restore(history.pop());

        System.out.println(editor.getContent()); // singh
    }
}