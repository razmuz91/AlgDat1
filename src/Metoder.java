

import java.util.Arrays;

public class Metoder {

    public Metoder(){}

    /////////Oppgave1/////////

    //Bytter to tall i tabell
    public void bytt(int[] a, int i, int j) {

        int temp = a[i]; a[i] = a[j]; a[j] = temp;
    }

    public int maks(int[] a){

        int m = a.length-1;


        for (int i=0 ; i < m; i++){
            if (a[i] > a[i+1] ){
                bytt(a,i,i+1);
            }
        }

        return a[m];

    }

    public int ombyttinger(int[] a){

        int m = a.length-1;

        //counter
        int c = 0;

        for (int i=0 ; i < m; i++){
            if (a[i] > a[i+1] ){
                bytt(a,i,i+1);
                c++;
            }
        }

        return c;

    }

}
