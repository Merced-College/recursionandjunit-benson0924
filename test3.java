package Question3;


import static org.junit.Assert.*;
import org.junit.Test;


public class test3 {
    @Test
    public void count1() {
        assertEquals(0, Question3.countHi2("xxhixx"));  
    }

    @Test
    public void count2() { 
        assertEquals(0, Question3.countHi2("xhixhix"));  
    }

    @Test
    public void count3() { 
        assertEquals(0, Question3.countHi2("hi"));  
    }

    @Test
    public void count4() {
        assertEquals(0, Question3.countHi2("xixhii"));
    }

    @Test
    public void count5() {
        assertEquals(3, Question3.countHi2("hxihixhxxixhxihhihixxixhxixhixhixhixhxihxihxixhixhxihxix"));
    }
}
