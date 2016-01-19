package Palindrome;

/**
 * Created by nsekecharles on 19/01/2016.
 */
public class PalindromeControlleur {

    public boolean estUnPalindrome(String chaine) {

        if("".equals(chaine) || chaine == null) {

            return true;

        } else {

            String reversed = new StringBuilder(chaine).reverse().toString();

            return reversed.equals(chaine);
        }

    }

    public boolean estUnPalindrome2(String chaine) {

        if("".equals(chaine) || chaine == null) {

            return true;

        } else {

            int fin = chaine.length() - 1;

            int milieu = chaine.length() / 2;

            for(int i= 0; i < milieu; i++, fin--) {

                if(chaine.charAt(i) != chaine.charAt(fin)) {

                    return false;

                }
            }

            return true;
        }
    }
}
