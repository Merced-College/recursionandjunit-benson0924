package Question1;
import static org.junit.Assert.*;
import org.junit.Test;

public class test1 {
    @Test
    public void count1() {
        assertEquals(1, Question1.count8(8));  
    }

    @Test
    public void count2() { 
        assertEquals(2, Question1.count8(818));  
    }

    @Test
    public void count3() { 
        assertEquals(4, Question1.count8(8818));  
    }

    @Test
    public void count4() {
        assertEquals(0, Question1.count8(123456));
    }

    @Test
    public void count5() {
        assertEquals(9, Question1.count8(88888));
    }

    @Test
    public void count6() {
        assertEquals(3, Question1.count8(80808));
    }
}