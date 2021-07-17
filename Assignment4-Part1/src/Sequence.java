
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

