import NombrePremier.NombrePremier;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by nsekecharles on 21/01/2016.
 */
public class NombrePremierTest {

    private NombrePremier nbrePremier;

    /**
     * Sets up the test fixture.
     * (Called before every test case method.)
     */
    @Before
    public void setUp() {
        nbrePremier = new NombrePremier();
    }

    /**
     * Tears down the test fixture.
     * (Called after every test case method.)
     */
    @After
    public void tearDown() {
        nbrePremier = null;
    }

    /**
     * Controle que 0 n'est pas premier
     */
    @Test
    public void test_0_NestPas_Premier() {

        Assert.assertFalse(nbrePremier.estPremier(0));
    }

    /**
     * Controle que 1 n'est pas premier
     */
    @Test
    public void test_1_NestPas_Premier() {

        Assert.assertFalse(nbrePremier.estPremier(1));
    }

    /**
     *
     * vérifie que 2 est divisible par 1
     */
    @Test
    public void test_1_Divise_2() {

        Assert.assertTrue(nbrePremier.sontMultiples(2, 1));
    }

    /**
     *
     * vérifie que 2 est divisible par 2
     */
    @Test
    public void test_2_Divise_2() {

        Assert.assertTrue(nbrePremier.sontMultiples(2, 2));
    }

    /**
     *
     * vérifie que 3 n'est pas divisible par 2
     */
    @Test
    public void test_2_NeDivise_3() {

        Assert.assertFalse(nbrePremier.sontMultiples(3, 2));
    }

    /**
     *
     * vérifie que 2 n'est pas divisible par 3
     */
    @Test
    public void test_3_NeDivise_2() {

        Assert.assertFalse(nbrePremier.sontMultiples(2, 3));
    }

    /**
     * Vérifie que 5 est premier
     */
    @Test
    public void test_5_est_Premier() {
        Assert.assertTrue(nbrePremier.estPremier(5));
    }

    /**
     * Vérifie que 9 n'est pas premier
     */
    @Test
    public void test_9_NestPas_Premier() {
        Assert.assertFalse(nbrePremier.estPremier(9));
    }

    @Test
    public void test_RetourneListeNombrePremier() {

        List<Integer> premier = new ArrayList<Integer>();
        premier.addAll(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29));

        Assert.assertEquals(premier, nbrePremier.getNombresPremiers(30));
    }
}
