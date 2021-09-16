import Figures.Rectangle;
import Figures.Square;
import junit.framework.Assert;
import org.junit.jupiter.api.Test;

public class TestRectangle {
    @Test
    public void testRectangleSquare(){
        Rectangle square = new Rectangle(3.1, 11.9);
        double sq = square.getSquare();
        Assert.assertEquals(36.89, sq);
    }
}

