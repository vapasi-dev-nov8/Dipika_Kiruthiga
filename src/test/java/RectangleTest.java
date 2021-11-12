import com.shapes.rectangle.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {


    @Test
    void calculateAreaOfRectangle() {
        Rectangle rectangle = new Rectangle();

        assertEquals(24, rectangle.calculateArea(12, 2));
        assertEquals(40, rectangle.calculateArea(10, 4));
        assertEquals(0, rectangle.calculateArea(0, 2));
    }

    @Test
    void calculatePerimeterOfRectangle() {
        Rectangle rectangle = new Rectangle();

        assertEquals(28, rectangle.calculatePerimeter(12, 2));
        assertEquals(25, rectangle.calculatePerimeter(10.5, 2.0));
        assertEquals(4, rectangle.calculatePerimeter(0, 2));
    }
}