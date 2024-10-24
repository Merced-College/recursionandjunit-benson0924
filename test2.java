package Question2;
import static org.junit.Assert.*;
import org.junit.Test;


public class test2 {
    @Test
    public void count1() {
        assertEquals(1, Question2.countHi("xxhixx"));  
    }

    @Test
    public void count2() { 
        assertEquals(2, Question2.countHi("xhixhix"));  
    }

    @Test
    public void count3() { 
        assertEquals(1, Question2.countHi("hi"));  
    }

    @Test
    public void count4() {
        assertEquals(2, Question2.countHi("hixxxhxhixh"));
    }

    @Test
    public void count5() {
        assertEquals(7, Question2.countHi("hxihixhxxixhxihhihixxixhxixhixhixhixhxihxihxixhixhxihxix"));
    }
}
