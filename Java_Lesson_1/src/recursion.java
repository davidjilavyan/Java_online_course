public class recursion {
    public static void main(String[] args) {
        //Exercise 3
        System.out.println(fact(6));
        //Exercise 2
        System.out.println(fib(8));
        //Exercise 4
        System.out.println(flan(5, 6));
        //Exercise 8
        System.out.println(sum(11));
       //Exercise 5
        int[] arr = new int[]{1,4,2,6,3};
        System.out.println(array(arr, 0));
    }
    //Exercise 2
    public static int fib(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else return fib(n - 1) + fib(n - 2);
    }
    //Exercise 3
    public static int fact(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * fact(n - 1);
    }
    //Exercise 4
    public static int flan(int n, int k) {
        if (k == 0)
            return 1;
        else return n * flan(n, k - 1);
    }

    //Exercise 8
    public static int sum (int n) {
        if (n == 0)
            return n;
        else return (n % 10+sum(n/10));
    }

    //Exercise 5
    public static int array(int[] arrayDigits, int n) {
        if (n == 0)
            return array(arrayDigits, ++n);
        else if (n < arrayDigits.length) {
            if(arrayDigits[n] < arrayDigits[0])
                arrayDigits[0] = arrayDigits[n];
            return array(arrayDigits, ++n);
        }
        else return arrayDigits[0];
    }
}
