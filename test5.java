package Question5;

import static org.junit.Assert.*;
import org.junit.Test;

public class test5 {
    @Test
    public void count1() {
        assertEquals("yza", Question5.stringClean("yyzzza"));  
    }

    @Test
    public void count2() { 
        assertEquals("abcd", Question5.stringClean("abbbcdd"));  
    }

    @Test
    public void count3() { 
        assertEquals("Helo", Question5.stringClean("Hello"));  
    }

    @Test
    public void count4() {
        assertEquals("Ping", Question5.stringClean("Piiinggg"));
    }

    @Test
    public void count5() {
        assertEquals("merced", Question5.stringClean("Mmerrrcedd"));
    }
}
