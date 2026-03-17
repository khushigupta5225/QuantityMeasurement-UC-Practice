package UC1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import UC1.FeetMeasurementEquality.Feet;

public class FeetMeasurementEqualityTest {

    @Test
    public void testFeetEquality_SameValue(){
        Feet f1 = new Feet(1.0);
        Feet f2 = new Feet(1.0);

        assertEquals(f1,f2);
    }

    @Test
    public void testFeetEquality_DifferentValue(){
        Feet f1 = new Feet(1.0);
        Feet f2 = new Feet(2.0);

        assertNotEquals(f1,f2);
    }

    @Test
    public void testFeetEquality_NullComparison(){
        Feet f1 = new Feet(1.0);
        assertNotEquals(null,f1);
    }

    @Test
    public void testFeetEquality_DifferentClass(){
        Feet f1 = new Feet(1.0);
        Object obj = new Object();
        assertNotEquals(f1,obj);
    }

    @Test
    public void testFeetEquality_SameReference(){
        Feet f1 = new Feet(1.0);
        assertTrue(f1.equals(f1));
    }
}