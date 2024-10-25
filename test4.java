package Question4;

import static org.junit.Assert.*;
import org.junit.Test;

public class test4 {
    @Test
    public void count1() {
        assertEquals(2, Question4.strCount("catcowcat", "cat"));  
    }

    @Test
    public void count2() { 
        assertEquals(1, Question4.strCount("catcowcat", "cow"));  
    }

    @Test
    public void count3() { 
        assertEquals(0, Question4.strCount("catcowcat", "dog"));  
    }

    @Test
    public void count4() {
        assertEquals(2, Question4.strCount("countycontinuecountry", "cou"));
    }

    @Test
    public void count5() {
        assertEquals(3, Question4.strCount("countycontinuecountry", "co"));
    }
}