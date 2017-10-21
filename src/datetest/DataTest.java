package datetest;

import java.util.Date;

public class DataTest {
    public static void main (String [] args){
        //isPrime(2);
        System.out.println(NOD(20,10));





    }
    //наибольший Общий делитель, алгоритм Евклида
    public static int NOD(int a,int b) {
        while (b !=0) {
            int tmp = a%b;
            a = b;
            b = tmp;
        }
        return a;
    }

    private static void isPrime(int f) {
        int a = f;
        boolean isPrime = false;
        for (int i = 2; i < a; i++) {
            if (a%i==0) {
                isPrime= false;
                break;// выход из цикла т.к. число уже не простое
            }
            else { isPrime = true;
            }

        }
        if (isPrime) {
            System.out.println("Чиcло простое");
        }
        else {
            System.out.println("Число составное");
        }
    }
}
