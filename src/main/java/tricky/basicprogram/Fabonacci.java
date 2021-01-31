package tricky.basicprogram;



public class Fabonacci {

    public static void main(String arg []){


genrated(6);
    }

    public static void genrated(int a){

        int first=0;
        int second=1;
        int temp;

        for (int i = 0; i < a; i++) {
            temp = first + second;
            first=second;
            second=temp;
            System.out.println(temp);

        }
    }
}
