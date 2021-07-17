/*public class MySequence {
    double firstTerm; //store the first term

    //Constructor
    public MySequence(double a) {
        firstTerm = a;
    }

    //Method that returns the nth term
    public double nthTerm(int n) {
        return n * n; //n^2
    }

    //following method generate a sequence of n terms
    public String generateSeq(int n) {
        if (n < 1) {
            return "Invalid argument";
        }

        String rslt = "";
        for (int i = 1; i <= n; i++) {
            rslt = rslt + nthTerm(i) + "  ";
        }
        return rslt;
    }

    public static void main(String[] args) {
        MySequence m1 = new MySequence(1);
        System.out.println("First 10 terms " + m1.generateSeq(10));
    }

}
*/