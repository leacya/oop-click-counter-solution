package oop;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for Count class.
 */
public class AppTest 
{
    /**
     * Test the click() method
     * It should increment the counter by one.
     */
    @Test
    public void click() {
        Counter counter = new Counter();
        counter.click();    // should increment by 1
        int expected = 1;
        int actual = counter.getCount();
        assertEquals(expected, actual);
    }


//DONE add a test for Counter undo()

    /**
     * Test the undo method
     */
    @Test
    public void undoTest1()
    {
        Counter counter = new Counter();
        counter.click();
        counter.click();
        counter.undo();
        int expected = 1;
        int actual = counter.getCount();
        assertEquals(expected, actual);
    }
    @Test
    public void undoTest2()
    {
        Counter counter = new Counter();
        counter.click();
        counter.undo();
        counter.undo();
        int expected = 0;
        int actual = counter.getCount();
        assertEquals(expected, actual);
    }

}




//
//
//
