import memento.Editor
import memento.History

fun main(args: Array<String>) {
    val editor = Editor("", "", 12)
    val history = History()
    editor.content = "1"
    history.push(editor.createState())
    editor.content = "12"
    history.push(editor.createState())
    editor.fontName = "Arial"
    println(history.pop())
    println(history.pop())
}