import java.util.Scanner;

class ScannerClassDemo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        System.out.println(n);
        int arr[] = {0,0,0};
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(arr[2]);
    }
}