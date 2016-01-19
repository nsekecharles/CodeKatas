package FizzBuzz;

/**
 * Created by nsekecharles on 19/01/2016.
 */
public class FizzBuzz {

    private static String FIZZ = "Fizz";
    private static String BUZZ = "Buzz";
    private static String FIZZBUZZ = "FizzBuzz";

    public boolean estMultipleDe3(int i) {
        return i % 3 == 0;
    }

    public boolean estMultipleDe5(int i) {
        return i % 5 == 0;
    }

    public String genererChaine(Integer i) {

        if(estMultipleDe3(i) && estMultipleDe5(i)) {
            return FIZZBUZZ;
        }

        if(estMultipleDe3(i)) {
            return FIZZ;
        }

        if(estMultipleDe5(i)) {
            return BUZZ;
        }

        return i.toString();
    }

    public String genererSuite(int i) {

        StringBuilder sb = new StringBuilder();

        for(int compteur = 1; compteur <= i; compteur++) {

            sb.append(genererChaine(compteur));

            if(compteur != i) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}
