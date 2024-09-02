public class Demo3 {
    public static void main(String[] args) {

        // int num;
        // System.out.println(num);

        // Array 
        // int a[] = {1,2,3};
        // System.out.println(a[1]);
        // System.out.println(a.length);

        // another method 
        int num[] = new int[3];
        num[0]=num[1]=num[2]=1;
        for(int n:num){
            System.out.println(n);
        }
        // double rand = Math.random();

        // multidimensional arrays
        int m[][] = {{1,2},{3,4}};
        // for(int i=0;i<m.length;i++){
        //     for(int j=0;j<m[0].length;j++){
        //         System.out.print(m[i][j]+" ");
        //     }
        // } 

        // Enhanced for loop

        for(int a[]:m){
            for(int b:a){
                System.out.print(b+" ");
            }
            System.out.println();
        }

        // int m3[][][] = {{{1,2,3}},{{4,5,6}}};
        // for(int i[][]:m3){
        //     for(int j[]:i){
        //         for(int k:j){
        //             System.out.println(k+" ");
        //         }
        //         System.out.println();
        //     }
        //     System.out.println();
        // }
    }
}
