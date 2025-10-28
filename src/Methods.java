import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        System.out.println(sumArray(new int[]{1, 2, 3, 4, 5}));
    }
    //1
    public static void printGreeting(){
        System.out.println("Hello, welcome to Java!");
    }
    //2
    public static void add(int a,int b){
        int sum=a+b;
        System.out.println(sum);
    }
    //3
    public static void isEven(int number){
        if (number%2==0){
            System.out.println(number);
        }
    }
    //4
    public static void printTable(int n){
        for (int i = 1; i <= 10; i++) {
            int mul=n*i;
            System.out.println(n+"*"+i+"="+mul);
        }
    }
    //5
    public static void max(int a, int b){
        System.out.println(Math.max(a, b));
    }
    //6
    public static boolean isPrime(int number){
        if (number<=1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number) ; i++) {
            if (number%i== 0){
                return false;
            }
        }
        return true;
    }
    //7
    public static int factorial(int number){
        int fac = 1;
        for (int i = 1; i <=number; i++) {
           fac=fac*i;
        }
        return fac;
    }
    //8
    public static int sumArray(int [] arr){
        int sum=0;
        for (int j : arr) {
            sum = j + sum;
        }
        return sum;
    }
    //9
//    public static String reverseString(String str){
//
//    }
    //10
    //11
    //12
    public static void area(int side){
        System.out.println(side*side);
    }
    public static void area(int length,int width){
        System.out.println(length*width );
    }
    //13
    public static double average(int... numbers){
     return  Arrays.stream(numbers).average().orElse(0);

    }
    //14
    public static double celsiusToFahrenheit(double celsius){
        return (celsius * 9 / 5) + 32;
    }
}
