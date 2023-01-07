package memento

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Memento {
    @Test
    fun `memento pattern create`() {
        val editor = Editor("", "Arial", 12)
        val history = History()
        editor.content = "1"
        history.push(editor.createState())
        editor.fontName = "Helvetica"
        history.push(editor.createState())
        editor.fontSize = 14
        history.push(editor.createState())
        history.pop()
        assertEquals( EditorState("1", "Helvetica", 12), history.pop())
    }
}