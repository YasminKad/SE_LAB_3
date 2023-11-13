package test.java;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {
    @Test
    public void testCalculateArea() {
        Square square = new Square(5);
        assertEquals(25, square.calculateArea());
    }

    @Test
    public void testGetSetSide() {
        Square square = new Square(5);
        square.setSide(7);
        assertEquals(7, square.getSide());
    }
}
