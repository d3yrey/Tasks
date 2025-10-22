import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1
//        int n= sc.nextInt();
//        int sum=0;
//        int[] arr= new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        for (int num:arr){
//            sum += num;
//        }
//        System.out.println(sum);
        //2
//        int n= sc.nextInt();
//        int[] arr= new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        int max =arr[0], min =arr[0];
//        for (int j : arr) {
//            if (j > max) {
//                max = j;
//            }
//            if (j < min) {
//                min = j;
//            }
//        }
//        System.out.println(max + " " + min);
        //3
//        int n= sc.nextInt();
//        int odd=0;
//        int even=0;
//        int[] arr= new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        for (int a : arr) {
//            if (a%2==0){
//                odd++;
//            }
//            else {
//                even++;
//            }
//        }
//        System.out.println(odd+" "+even);
        //4
//        int n= sc.nextInt();
//        int[] arr= new int[n];
//        int[] reverse=new int[n];
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        for (int i = 0; i < n; i++) {
//            reverse[i]=arr[n-1-i];
//        }
//        System.out.println(java.util.Arrays.toString(reverse));
        //5
        int[] arr = {1, 2, 4, 5};
        int search = sc.nextInt();
        boolean found= false; ///found yaratmagi ai dan meslehet aldim

        for (int i = 0; i < arr.length; i++) {
            if (search == arr[i]){
                found=true;
                break;
            }
        }
        if (found){
            System.out.println(search);
        }
        else {
            System.out.println("This number isn't in array");
        }
        //6
//        int[] ar={1,23,5,6};
//        int[] newArr= new int[ar.length];
//        for (int i = 0; i < ar.length; i++) {
//            newArr[i]=ar[i];
//        }
//        System.out.println(java.util.Arrays.toString(newArr));
    }

}
