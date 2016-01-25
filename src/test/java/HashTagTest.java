import HashTag.HashTag;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nsekecharles on 20/01/2016.
 */
public class HashTagTest {

    private HashTag ht = new HashTag();
    private List<String> results;
   /**
            * Sets up the test fixture.
    * (Called before every test case method.)
            */
    @Before
    public void setUp() {
        ht = new HashTag();
        results = new ArrayList<String>();
    }

    /**
     * Tears down the test fixture.
     * (Called after every test case method.)
     */
    @After
    public void tearDown() {
        ht = null;
    }


    //1- controle qu'une chaine vide retourne une liste vide
    @Test
    public void test_ChaineVide_RetourneListeVide() {



        Assert.assertEquals(ht.getHashTags2(""), results);
    }

    //2- controle qu'une chaine null retourne une liste vide
    @Test
    public void test_ChaineNull_RetourneListeVide() {

        Assert.assertEquals(ht.getHashTags2(null), results);
    }

    //3- la chaine "#test" retourne la liste ["test"]
    @Test
    public void test_ChaineAvec_Un_HashTag_RetourneListeAvecLeMot() {

        // initialisation de liste des resultats
        results.add("#test");
        results.add("#essai");
        results.add("#tresse");
        results.add("#voile");

        Assert.assertEquals(ht.getHashTags("boncjour #test tout c'est qui #essai de me tester je #tresse surtout les #voile"), results);
    }
}
