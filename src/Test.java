

import java.util.Arrays;

public class Test {

        public static void main(String[] args) {
            Metoder metoder = new Metoder();

            int[] a = {9, 7, 11, 8,4};
            int c;
            int m;

            c = metoder.ombyttinger(a);
            m = metoder.maks(a);

            System.out.println(Arrays.toString(a));
            System.out.println(c);
            System.out.println(m);

        }


    }
