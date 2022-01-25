package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void oneSetBracketToBeTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void twoSetBracketToBeTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
    }

    @Test
    public void twoBracketsWithinToBeTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

    @Test
    public void twoBracketsWithinTwoBracketsToBeTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]][]"));
    }

    @Test
    public void bracketAroundTextToBeTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void bracketWithInTextToBeTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void bracketBeginningOfTextToBeTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void emptyToBeTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void unbalancedBracketsToBeFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void unbalanceTextBalanceToBeFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode[]"));
    }

    @Test
    public void backwardBracketsToBeFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }


}
