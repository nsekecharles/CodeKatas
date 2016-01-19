import Palindrome.PalindromeControlleur;
import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;

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

    /**
     * Test qu'une chaine vide retourne true quand on vérifie s'il s'agit d'un palindrome
     */
    @Test
    public void test_UneChaineVide_Retourne_True() {

        Assert.assertTrue(palindrome.estUnPalindrome(""));
    }

    /**
     * Test qu'une chaine nulle retourne true
     */

    @Test
    public void test_UneChaineNulle_Retourne_True() {


        Assert.assertTrue(palindrome.estUnPalindrome(null));


    }

    @Test
    public void test_LaChaine_aba_Retourne_True() {

        long debut = Calendar.getInstance().getTimeInMillis();

        Assert.assertTrue(palindrome.estUnPalindrome2("aba"));

        long fin = Calendar.getInstance().getTimeInMillis();

      //  System.out.println("Executé en : " + (fin - debut) + " milis") ;
    }

    @Test
    public void test_LaChaine_abba_Retourne_True() {

        long debut = Calendar.getInstance().getTimeInMillis();

        Assert.assertTrue(palindrome.estUnPalindrome2("abba"));

        long fin = Calendar.getInstance().getTimeInMillis();

        System.out.println("Executé en : " + (fin - debut) + " milis") ;

    }

    @Test
    public void test_LaChaine_test_Retourne_False() {

        long debut = Calendar.getInstance().getTimeInMillis();

        Assert.assertFalse(palindrome.estUnPalindrome2("test"));

        long fin = Calendar.getInstance().getTimeInMillis();

        System.out.println("Executé en : " + (fin - debut) + " milis") ;
    }
}
