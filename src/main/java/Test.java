interface Interf {
    public void sum(int a, int b);
}

class Test {
    /**
     * @param args
     */
    public static void main(String[] args) {


        Interf i = (a, b) -> System.out.println("sum" + (a + b));

        i.sum(5, 10);
    }
} 