package test.java;

import static org.junit.Assert.assertEquals;  
import org.junit.After;  
import org.junit.AfterClass;  
import org.junit.Before;  
import org.junit.BeforeClass;  
import org.junit.Test;  
import main.java.Main;  
  
public class MainTests {  
  
    @BeforeClass  
    public static void setUpBeforeClass() throws Exception {  
        System.out.println("before class");  
    }  
    @Before  
    public void setUp() throws Exception {  
        System.out.println("before");  
    }  
  
    @Test  
    public void testFindMax(){  
        System.out.println("test case find max");  
        assertEquals(4,Main.findMax(new int[]{1,3,4,2}));  
        assertEquals(43,Main.findMax(new int[]{12,43,4,2}));  
    }  
    @Test  
    public void testCube(){  
        System.out.println("test case cube");  
        assertEquals(27,Main.cube(3));  
    }  
   
    
    @After  
    public void tearDown() throws Exception {  
        System.out.println("after");  
    }  
  
    @AfterClass  
    public static void tearDownAfterClass() throws Exception {  
        System.out.println("after class");  
    }  
  
} 