package memento

class Editor(
    var content: String,
    var fontName: String,
    var fontSize: Int,
) {
    fun createState(): EditorState {
        return EditorState(content, fontName, fontSize)
    }

    fun restore(state: EditorState) {
        content = state.content
    }


}