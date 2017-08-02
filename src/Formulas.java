public class Formulas {

    public int sumThree(int a, int b, int c) {
        int sum;
        sum = a + b + c;
        return sum;
    }

    public static int sumFour(int a, int b, int c, int d) {
        int sum;
        sum = a + b + c + d;
        return sum;
    }


    public static void main(String[] args) {
        int printMe = sumFour(1, 2, 3, 4 );
        System.out.println(printMe);
    }

    public double magicNumber(int a, int b, int c){
        double remainder = a%b;
        double answer = remainder/c;
        return answer;
    }




}
