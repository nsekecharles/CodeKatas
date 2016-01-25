package Reverse;

/**
 * Created by nsekecharles on 21/01/2016.
 */
public class Reverse {
    public String reverse(String test) {

        if(test != null) {

            StringBuilder reversed = new StringBuilder();

            for(int i = test.length() - 1; i >= 0; i-- ) {
                reversed.append(test.charAt(i));
            }

            return reversed.toString();
        }

        return null;
    }
}
