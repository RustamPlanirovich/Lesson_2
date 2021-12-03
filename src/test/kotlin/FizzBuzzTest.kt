import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FizzBuzzTest {

    @Test
    fun testFizzBuzz() {
        assertEquals("4: ", fizzBuzz(4))
        assertEquals("3: Fizz", fizzBuzz(3))
        assertEquals("5: Buzz", fizzBuzz(5))
        assertEquals("15: FizzBuzz", fizzBuzz(15))
    }
}