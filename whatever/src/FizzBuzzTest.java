import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void input1() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(1);
        
        assertEquals("1", result);
    }
    
    @Test
    public void input2() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(2);
        
        assertEquals("2", result);
    }
    
    @Test
    public void input3() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(3);
        
        assertEquals("Fizz", result);
    }
    
    @Test
    public void input4() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(4);
        
        assertEquals("4", result);
    }
    
    @Test
    public void input5() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(5);
        
        assertEquals("Buzz", result);
    }
    
    @Test
    public void input6() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(6);
        
        assertEquals("Fizz", result);
    }
    
    @Test
    public void input7() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(7);
        
        assertEquals("7", result);
    }
    
    @Test
    public void input8() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(8);
        
        assertEquals("8", result);
    }
    
    @Test
    public void input9() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(9);
        
        assertEquals("Fizz", result);
    }
    
    @Test
    public void input10() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(10);
        
        assertEquals("Buzz", result);
    }
    
    @Test
    public void input11() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(11);
        
        assertEquals("11", result);
    }
    
    @Test
    public void input12() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(12);
        
        assertEquals("Fizz", result);
    }
    
    @Test
    public void input13() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(13);
        
        assertEquals("13", result);
    }
    
    @Test
    public void input14() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(14);
        
        assertEquals("14", result);
    }
    
    @Test
    public void input15() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(15);
        
        assertEquals("FizzBuzz", result);
    }
    
    @Test
    public void input16() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(16);
        
        assertEquals("16", result);
    }

}
