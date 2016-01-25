package NombrePremier;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nsekecharles on 21/01/2016.
 */
public class NombrePremier {

    public boolean estPremier(int nbre) {

        if(nbre == 0 || nbre == 1) {

            return false;

        }else {

            for(int i = nbre / 2; i >= 2; i--) {

                if(sontMultiples(nbre, i)) {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean sontMultiples(int nbre ,int i) {

        return nbre % i == 0;

    }

    public List<Integer> getNombresPremiers(int nbre) {

        List<Integer> nbrePremier = new ArrayList<Integer>();

        for(int i = 0; i <= nbre; i++) {

            if(estPremier(i))
                nbrePremier.add(i);
        }

        return nbrePremier;
    }
}
