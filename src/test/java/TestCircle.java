import Figures.Circle;
import junit.framework.Assert;
import org.junit.jupiter.api.Test;

public class TestCircle {
    @Test
    public void testCircleSquare(){
        Circle square = new Circle(4.1);
        double sq = square.getSquare();
        Assert.assertEquals(52.7834, sq, 0.001);
    }
}
