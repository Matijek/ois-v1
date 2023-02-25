import java.util.*;
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double c = 6.674 * Math.pow(10, -11);
        double m = 5.972 * Math.pow(10, 24);
        double r = 6.371 * Math.pow(10, 6);
        double v = sc.nextDouble();
        double a = c * m / ((r + v) * (r + v));
        
    }
