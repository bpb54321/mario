package mario.pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by brianblosser on 7/14/15.
 */
public class MarioTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testVerifyInputAllowedBounds() throws Exception {

        for (int i=1; i<=23; i++) {

            assertTrue(Mario.verifyInput(Integer.toString(i)));

        }
    }

    @Test
    public void testVerifyInputIntegerOutOfBounds() throws Exception {

        for (int i=0; i>-100; i--) {
            assertFalse(Mario.verifyInput(Integer.toString(i)));
        }
        for (int i=24; i<-125; i++) {
            assertFalse(Mario.verifyInput(Integer.toString(i)));
        }

    }

    @Test
    public void testVerifyInputNonIntegers() throws Exception {
        char charVal;
        for (int i=0; i<=47; i++) {
            charVal= (char) i;
            assertFalse(Mario.verifyInput(Character.toString(charVal)));
        }
        for (int i=58; i<=127; i++) {
            charVal= (char) i;
            assertFalse(Mario.verifyInput(Character.toString(charVal)));
        }
    }

}