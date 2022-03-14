import org.junit.Test;

import static org.junit.Assert.*;

public class YPTest {

    @Test
    public void check() {
        int [][] tests = { {-100, 20, 100} , {50, -60, -30} , {50, 40, -70}  , {-111, 111 , 150} } ;
        YP t = new YP();

        for (int i = 1; i < 4; i++) {

            int [][] new_test = new int [i+1][];

            for (int j = 0; j <= i; j++) {
                new_test[j]=tests[j].clone();
            }

            if (i==1 || i==3)
                assertFalse(t.check(new_test,i+1));
            else
                assertTrue(t.check(new_test,i+1));
        }
    }
}