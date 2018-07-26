import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeFactorTest {

    @Test
    public void input2() {
        PrimeFactor p = new PrimeFactor();
        String result = p.of(2);
        assertEquals("2", result);
    }
    
    @Test
    public void input3() {
        PrimeFactor p = new PrimeFactor();
        String result = p.of(3);
        assertEquals("3", result);
    }
    
    @Test
    public void input4() {
        PrimeFactor p = new PrimeFactor();
        String result = p.of(4);
        assertEquals("2,2", result);
    }
    
    @Test
    public void input6() {
        PrimeFactor p = new PrimeFactor();
        String result = p.of(6);
        assertEquals("2,3", result);
    }
    
    @Test
    public void input8() {
        PrimeFactor p = new PrimeFactor();
        String result = p.of(8);
        assertEquals("2,2,2", result);
    }
    
    @Test
    public void input9() {
        PrimeFactor p = new PrimeFactor();
        String result = p.of(9);
        assertEquals("3,3", result);
    }
    
    @Test
    public void input10() {
        PrimeFactor p = new PrimeFactor();
        String result = p.of(10);
        assertEquals("2,5", result);
    }
    
    @Test
    public void input12() {
        PrimeFactor p = new PrimeFactor();
        String result = p.of(12);
        assertEquals("2,2,3", result);
    }

}
