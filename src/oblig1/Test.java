package oblig1;

import java.util.Arrays;

public class Test {

        public static void main(String[] args) {

            int[] a = {9, 7, 11, 8,4};
            int c;
            int m;

            c = Oblig1.ombyttinger(a);
            m = Oblig1.maks(a);

            System.out.println(Arrays.toString(a));
            System.out.println(c);
            System.out.println(m);

        }


    }
