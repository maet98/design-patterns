package memento

import java.util.*

class History {
    val states: Stack<EditorState> = Stack<EditorState>()

    fun push(state: EditorState) {
        states.push(state)
    }

    fun pop() : EditorState {
        return states.pop()
    }
}