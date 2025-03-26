package Week3;

import java.util.Arrays;

public class CorporateSponsors {
    public static void main(String[] args) {

        String[] sponsors = { "ikea", "at&t", "cvs", "3m"};

        for (int i = 0; i < sponsors.length; i++) {
            //System.out.println(sponsors[i]);
            sponsors[i] = sponsors[i].toUpperCase();
        }

        System.out.println(Arrays.toString(sponsors));


    }
}
