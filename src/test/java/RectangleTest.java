package test.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {
    @Test
    public void testCalculateArea() {
        Rectangle rectangle = new Rectangle(3, 4);
        assertEquals(12, rectangle.calculateArea());
    }
    @Test
    public void testGetSetHeight() {}

    @Test
    public void testGetSetWidth() {
}

