package io.codelavida.puzzle;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountDigitTest {

    @Test
    public void testNumDigitsX(){
        assertEquals(2, CountDigit.numDigitX(3, 2, 14));
        assertEquals(35, CountDigit.numDigitX(3, 100, 250));
        assertEquals(1120, CountDigit.numDigitX(2, 10000, 12345));
        assertEquals(0, CountDigit.numDigitX(0, 20, 21));
        assertEquals(120, CountDigit.numDigitX(9, 899, 1000));
        assertEquals(398, CountDigit.numDigitX(1, 1100, 1345));
    }

}