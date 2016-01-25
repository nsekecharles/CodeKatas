package HashTag;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nsekecharles on 20/01/2016.
 */
public class HashTag {

    public List<String> getHashTags(String chaine) {

        ArrayList<String> hashTags = new ArrayList<String>();

        if(chaine == null || "".equals(chaine)) {

            return hashTags;

        } else {

            boolean copy = false;
            StringBuilder mot = new StringBuilder();

            for(int i = 0; i < chaine.length(); i++) {

                if('#' == (chaine.charAt(i)) && !copy) {

                    copy = true;

                }

                if(copy && ' ' != chaine.charAt(i)) {

                    mot.append(chaine.charAt(i));

                }

                 if((' ' == (chaine.charAt(i)) || i == chaine.length() - 1) && copy) {

                    copy = false;

                    hashTags.add(mot.toString());

                    mot.setLength(0);
                }
            }
        }

        return hashTags;
    }

    public List<String> getHashTags2(String chaine) {

        ArrayList<String> hashTags = new ArrayList<String>();

        if(chaine == null || "".equals(chaine)) {

            return hashTags;

        } else {
           String elements[] = chaine.split(" ");

            for(int i = 0; i < elements.length; i++) {

                if(elements[i].startsWith("#")) {
                    hashTags.add(elements[i]);
                }
            }
        }

        return  hashTags;
    }
}
