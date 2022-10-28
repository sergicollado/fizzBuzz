import static org.junit.jupiter.api.Assertions.*;

class PotterBookCalculatorTest {

    @org.junit.jupiter.api.Test
    void calculate() {
        // ACT  Arrange Act Assert
        // Arrange
        PotterBookCalculator potterBookCalculator = new PotterBookCalculator();
        float expectedPrice = 0;

        // Act
        float price = potterBookCalculator.calculate();

        // Assert
        assertEquals(expectedPrice,price);
    }
}