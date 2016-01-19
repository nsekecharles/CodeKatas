import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by nsekecharles on 19/01/2016.
 */
public class FizzBuzzTest {

    private FizzBuzz fb;

    /**
     * Sets up the test fixture.
     * (Called before every test case method.)
     */
    @Before
    public void setUp() {
        fb = new FizzBuzz();
    }

    /**
     * Tears down the test fixture.
     * (Called after every test case method.)
     */
    @After
    public void tearDown() {
        fb = null;
    }

    /**
     * 1- premier cas de test on créé la méthode qui vérifie qu'on a affaire à un multiple de 3
     * création du cas de test KO la fonction retourne false
     */
    @Test
    public void test_MultipleDe3KO() {

        Assert.assertFalse(fb.estMultipleDe3(1));
    }

    //- création du cas de test OK la fonction retourne true
    @Test
    public void test_MultipleDe3OK() {

        Assert.assertTrue(fb.estMultipleDe3(3));
    }

    /**
     * 2- deuxieme cas de test on créé la méthode qui vérifie qu'on a affaire à un multiple de 5
     * création du cas de test KO la fonction retourne false
     */
    @Test
    public void test_MultipleDe5KO() {


        Assert.assertFalse(fb.estMultipleDe5(1));
    }

    //- création du cas de test OK la fonction retourne true
    @Test
    public void test_MultipleDe5OK() {


        Assert.assertTrue(fb.estMultipleDe5(5));
    }

    //3- on créé une méthode qui retourne un nombre entré en paramètre différent des multiples de 3 et 5
    @Test
    public void test_RetourneNombre() {

        Assert.assertEquals(fb.genererChaine(1), "1");
    }

    //4- on met à jour la méthode créée en 3- pour quelle retourne Fizz quand on a un multiple de 3
    @Test
    public void test_RetourneFizz() {

        Assert.assertEquals(fb.genererChaine(3), "Fizz");
    }

    //5- on met à la méthode créée en 3 pour qu'elle retourne Buzz quand on a un multiple de 5
    @Test
    public void test_RetourneBuzz() {

        Assert.assertEquals(fb.genererChaine(5), "Buzz");
    }

    //6- on met à jour la méthode créée en 3 pour qu'elle retourne FizzBuzz quand on a un multiple de 3 et de 5
    @Test
    public void test_RetourneFizzBuzz() {

        Assert.assertEquals(fb.genererChaine(15), "FizzBuzz");
    }

    //7- création de la fonction qui prend en paramètre un entier n et la suite des nombres
    //compris entre 1 et n en remplacant les mutiples de 3 par Fizz, de 5 par Buzz et de 3 et 5 par FizzBuzz
    @Test
    public void test_RetourneSuiteNombre() {

        String suite = "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz 16 17 Fizz 19 Buzz";

        Assert.assertEquals(fb.genererSuite(20), suite);
    }

}
