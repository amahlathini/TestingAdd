import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAddTest {

/*
    @Test
    public void mySimpleEqualsTest(){

        String expectedName = "Ayabulela";
        assertEquals(expectedName, TestAdd.getEmpNameWithHighestSalary());
    }
*/

    @Test
    public void myObjectEqualsTest(){

        TestAdd expectedEmpObj = new TestAdd(1, "Ayabulela", 15000);
        assertEquals(expectedEmpObj, TestAdd.getHighestPaidEmployee().getHighestPaidEmployee());
    }
}