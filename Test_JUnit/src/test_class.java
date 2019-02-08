import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class test_class {

    @Test
    public void test_multiplication() {

        temp test1 = new temp();
        assertEquals(12,((temp) test1).multiply(3,4),"Test Failed");
        assertEquals(0, ((temp) test1).multiply(3,0),"Test Wrong");

    }


}
