import org.junit.Test;

import static org.junit.Assert.*;

public class WatermelonTest {

    @Test
    public void check_watermelon() {

        int [] test = {-10,0,1,2,50,100,111};
        Watermelon w = new Watermelon();

        for (int i=0;i<7;i++){
            //Assert False when input is equal to 2 or out of range or an odd number
            if( (  test[i] < 1  ||  test[i] > 100 ) || test[i]==2 || test[i] % 2 != 0 )
                assertFalse(w.check_watermelon(test[i]));
            else
                assertTrue(w.check_watermelon(test[i]));
        }
    }
}