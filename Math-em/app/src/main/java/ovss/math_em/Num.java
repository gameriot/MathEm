package ovss.math_em;

import java.util.ArrayList;
import java.util.Random;

public class Num {
    int max = 10;
    int min = 2;
    int ans = 0;
    ArrayList<Integer> factors = new ArrayList<Integer>();
    int fact1 = 0;


    public Num(int x, int y) {
        max = 20;
        min = 5;
        Random r = new Random();
        ans = r.nextInt(max-min)+min;

        int xc = 1;
        //System.out.println(ans);
        while (10 >= xc) {
            int h = (ans / xc);
          //  System.out.println(h);
            if (xc*h == ans ){
                factors.add(xc);
            }
            xc++;
        }
        //System.out.println(factors);
//        factors.remove(0);
    }


    public int getRightExp() {
        Random r = new Random();
        int fact2 = 0;
        int index = 0;
        min = 1;
        max = ans;
//define fact1 and fact2 outside class to refer to in main code

        fact1 = factors.get(r.nextInt(factors.size()));
        if ((ans % fact1) == 0) {
                fact2=(ans/fact1);
                           }


        return fact2;
    }


}