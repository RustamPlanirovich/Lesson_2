import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class RegexpTest {

    @Test
    fun RegexpDateFunctionTest() {

        assertTrue(date("12 JAN 2020"))

        assertFalse(date("12 jan 2020"))
    }
}