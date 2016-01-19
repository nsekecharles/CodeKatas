import Palindrome.PalindromeControlleur;
import org.junit.After;
import org.junit.Before;

/**
 * Created by nsekecharles on 19/01/2016.
 */
public class PalindromeControlleurTest {

    private PalindromeControlleur palindrome;

    /**
     * Sets up the test fixture.
     * (Called before every test case method.)
     */
    @Before
    public void setUp() {
        palindrome = new PalindromeControlleur();
    }

    /**
     * Tears down the test fixture.
     * (Called after every test case method.)
     */
    @After
    public void tearDown() {
        palindrome = null;
    }
}
