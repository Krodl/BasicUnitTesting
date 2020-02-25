import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelephoneTest {

    @Test
    void x(){
        //Testing to make sure format works for proper 10-digit input.
        String number = "(717)250-7461";
        boolean expected = true;
        assertEquals(expected, Telephone.isFormatted(number));
    }

    @Test
    void x2(){
        //Testing to make sure it returns false for an incorrect input
        String number = "7172507461";
        boolean expected = false;
        assertEquals(expected, Telephone.isFormatted(number));
    }

    @Test
    void x3(){
        //Testing to see if non-numeric characters work
        String nonNumeric = "(abc)def-ghij";
        boolean expected = false;
        assertEquals(expected, Telephone.isFormatted(nonNumeric));
    }
}