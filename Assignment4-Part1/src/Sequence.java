
    public class Sequence
    {
        double a;
        public Sequence() {a = 0;}
        public Sequence(double t1) {a = t1;}
        public void setT1(double t1) {a = t1;}
        public double t(int n) {return ((n - 1) + a)* n;}
        public String toString() {return ""+a+", "+t(2)+", "+t(3)+", ...";}


    public static void main(String[] args) {
        Sequence s1 = new Sequence(4); //this will make the first term be 4

        //print the first three terms
        System.out.println("first three terms: " + s1.t(1) + " " + s1.t(2) + " " + s1.t(3));

        // Print the sum of the first 5 terms in the sequence
        double sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum = sum + s1.t(i);
        }
        System.out.println("Sum of the first 5 terms in the sequence: " + sum);
    }



    }
    class MySequence
    {
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
class Series extends Sequence {
    public double sum(int n) {
        double sum = 0;
        double a = 4;
        Sequence s1 = new Sequence(4);
        for (int i = 1; i <= n; i++) {
            if (i <= 4 || i == n)
                System.out.print(" + " + s1.t(i));

            sum += s1.t(i) ;
        }
        System.out.println(" = " + sum );  //Print sum
        return sum ;
    }

    public static void main(String[] args) {
        Series s1 = new Series();
        s1.sum(5);
    }
}
