package memento

class EditorState(
    val content: String,
    val fontName: String,
    val fontSize: Int
) {

    override fun toString(): String {
        return "EditorState(content='$content', fontName='$fontName', fontSize=$fontSize)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as EditorState

        if (content != other.content) return false
        if (fontName != other.fontName) return false
        if (fontSize != other.fontSize) return false

        return true
    }

    override fun hashCode(): Int {
        var result = content.hashCode()
        result = 31 * result + fontName.hashCode()
        result = 31 * result + fontSize
        return result
    }


}