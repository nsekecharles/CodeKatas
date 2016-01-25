import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import Reverse.Reverse;
import org.junit.Test;

/**
 * Created by nsekecharles on 21/01/2016.
 */
public class ReverseTest {

    private Reverse reverse;

    /**
     * Sets up the test fixture.
     * (Called before every test case method.)
     */
    @Before
    public void setUp() {
        reverse = new Reverse();
    }

    /**
     * Tears down the test fixture.
     * (Called after every test case method.)
     */
    @After
    public void tearDown() {
        reverse = null;
    }


    /**
     * Controlle qu'une chaine vide retourne une chaine vide
     */
    @Test
    public void test_ChaineVide_RetourneVide() {
        Assert.assertEquals(reverse.reverse(""), "");
    }

    /**
     * Controle qu'une chaine nulle retourne nulle
     */

    @Test
    public void test_ChaineNulle_RetourneNull() {
        Assert.assertNull(reverse.reverse(null));
    }

    /**
     * controlle que la chaine test retourne tset
     */
    @Test
    public void test_Chaine_test_Retourne_Tset() {

        Assert.assertEquals(reverse.reverse("test"), "tset");
    }
}
