import org.junit.Test;

import static org.junit.Assert.*;

public class TestAddTest {
    @Test
    public void test(){
        TestAdd test = new TestAdd();
        int answer = test.add(10, 5);
        assertEquals(15, answer);
    }



}