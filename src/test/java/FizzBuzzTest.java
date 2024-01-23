import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @org.junit.jupiter.api.Test
    void convert() {
        // ACT  Arrange Act Assert
        // Arrange
        FizzBuzz fizzbuzz = new FizzBuzz();
        float expected = 0;

        // Act
        float result = fizzbuzz.convert(1);

        // Assert
        assertEquals(expected,result);
    }
}