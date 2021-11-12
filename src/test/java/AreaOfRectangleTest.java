import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AreaOfRectangleTest {
    @Test
    void shouldReturnAreaOfRectangle(){
        assertEquals(7,AreaOfRectangle.calculateArea(12,6));
    }


}
