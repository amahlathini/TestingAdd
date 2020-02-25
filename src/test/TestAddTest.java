import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;
import static org.junit.Assert.assertSame;

import java.util.HashMap;
import java.util.Map;


public class TestAddTest {

    /*
        @Test
        public void mySimpleEqualsTest(){

            String expectedName = "Ayabulela";
            assertEquals(expectedName, TestAdd.getEmpNameWithHighestSalary());
        }
    */
//Object Equality
    @Test
    public void myObjectEqualsTest(){

        TestAdd expectedEmpObj = new TestAdd(1, "Ayabulela", 15000);
        assertEquals(expectedEmpObj, TestAdd.getHighestPaidEmployee().getHighestPaidEmployee());
    }


    //Object Identity
    @Test
    public void idtest1(){
        TestAdd employee = new TestAdd(1,"Ayabulela", 15000);
        Assert.assertSame(new TestAdd(1,"Ayabulela", 15000), employee);
        Assert.assertNotSame(new TestAdd(1,"Ayabulela", 15000), employee);
    }


}
