import Figures.Square;
import junit.framework.Assert;
import org.junit.jupiter.api.Test;

public class TestSquare {
    @Test
    public void testSquareSquare(){
        Square square = new Square(3.0);
        double sq = square.getSquare();
        Assert.assertEquals(9.0,sq);
    }
}
