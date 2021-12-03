import org.junit.jupiter.api.Assertions.assertIterableEquals
import org.junit.jupiter.api.Test
import strings.allMatchesOf

class ExtensonsTest {
    @Test
    fun testExtensionsFunctions() {
        assertIterableEquals(listOf("<html>", "<head>"), "<html><head>hello".allMatchesOf("""<[^>/]+>"""))
    }
}