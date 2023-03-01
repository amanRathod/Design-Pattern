package memento;

import java.util.Stack;

// Caretaker
public class History {
    Stack<EditorState> undoStack = new Stack<>();

    public void push(EditorState state) {
        undoStack.push(state);
    }

    public EditorState pop() {
        return undoStack.pop();
    }
}
