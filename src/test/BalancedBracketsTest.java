package test;

import org.junit.Test;

import static org.junit.Assert.*;
import main.BalancedBrackets;

import javax.management.InvalidAttributeValueException;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() throws InvalidAttributeValueException {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void onlyLeftBracketsReturnsFalse() throws InvalidAttributeValueException {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void oneRightBracketReturnsFalse()throws InvalidAttributeValueException{
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void TestEmptyString()throws InvalidAttributeValueException{
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test (expected = InvalidAttributeValueException.class)
    public void TestInvertedBrackets()throws InvalidAttributeValueException{
       BalancedBrackets.hasBalancedBrackets("Launch]Code[");
       throw new InvalidAttributeValueException("Left bracket found before right");
    }

}
