public class Series<sum> extends Sequence {

    // finding sum of first n terms

    public double sum(int n) {
        double sum = 0;

        System.out.print("" + a);

        boolean printed = false;
        for (int i = 2; i <= n; i++) {
            if (i <= 3 || i == n)
                System.out.print(" + " + t(i));
            else if (!printed) {
                System.out.print(" + ...  ");
                printed = true;
            }
            sum += t(i);
        }
        System.out.println(" = " + sum);
        return sum;
    }

    public static void main(String[] args) {
        Series s1 = new Series();
        s1.sum(5);
    }

}