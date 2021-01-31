package tricky.basicprogram;

public class PrimeNo {

    public static void main(String[] arg) {

        final boolean b = primeNo(5);

        System.out.println(b);



    }

    private static boolean primeNo(int s) {

        System.out.println("vipin " +Math.sqrt(s));

        for (int i = 2; i < Math.sqrt(s); i++) {


            if (s % i == 0) {

                return false;

            }
        }

        return true;
    }
}
