public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println();
        System.out.println("Test");
        byte x=6;
        x=7;
        System.out.println("print the value of x " +x);
        short y=129;
        int z =32000;
        System.out.println(z);
        long l =5600l;
        float f = 555.5f;
        System.out.println(f);
        double d=45.7;
        System.out.println(d);
        char ch='a';
        String st = "Test test test";
        boolean bol;
        bol = true;
        int sum =x+y;
        System.out.println("The sum of x and y is : " + sum );
        int firstNumber =7;
        int secondNumber = 3;
        int sum1 =firstNumber+secondNumber;
        System.out.println("Print the value of sum: " + sum1);
        int t=10, k=3;
        System.out.println(t/k);
        System.out.println(t%k);
        double dd=10.0;
        System.out.println(dd/k);
        int i=7;
        //i++;
        System.out.println(i);
        //++i;
        System.out.println(i);
        int kk=i++ + --k;//
        System.out.println(kk);
        System.out.println(i);
        kk=++i + --k;
        System.out.println(kk);
        //boolean b= kk==12;
        //System.out.println(b);
        boolean b= kk!=12;
        System.out.println(b);
        System.out.println(kk>90);
        System.out.println(kk>=10);
        System.out.println(kk>1 && kk<=10);
        System.out.println(kk>1 && kk <=9);
        System.out.println(kk>1 || kk <=9);
        System.out.println(kk!=10);
        byte m = 12;
    }
}