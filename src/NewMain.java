public class NewMain {
    public static void eights(){
        for(int i=8; i > 0; i-=2){
            for(int j = (8-i);j>0;j-=2) System.out.print(" ");
            for(int j = i; j>0;j--) System.out.print(i);
            System.out.println();
        }
    }
    public static void alternate(int n){
        for(int i=1; i<=n; i++){
            if (i%2 == 1) for(int j=1;j<=i;j++) System.out.print(j);
            else for(int j=i;j>=1;j--) System.out.print(j);
            System.out.println();
        }
    }
    public static void isosceles(int n){
        for(int i=1;i<=n;i++){
            for(int j=n-i; j>0;j--) System.out.print(" ");
            for(int j=1; j<=i;j++) System.out.print(j);
            for(int j=i; j>1;j--) System.out.print(j);
            System.out.println();
        }
    }
    public static void upSideDown(int max, int min){
        int range = max-min;
        for(int i = 0 ; i<=range;i++){
            for(int j = i ; j>0; j--) System.out.print(" ");
            for(int j = 0; j<=min && max-i-j>=min; j++) System.out.print(max-i-j);
            for(int j = 1; j<=range-i; j++) System.out.print(min+j);
            System.out.println();
        }
    }


    public static void main(String[] args) {
        eights();
        System.out.println();
        alternate(6);
        System.out.println();
        alternate(5);
        System.out.println();
        isosceles(5);
        System.out.println();
        upSideDown(9,5);
    }
}
//88888888
// 666666
//  4444
//   22
//
//1
//21
//123
//4321
//12345
//654321
//
//1
//21
//123
//4321
//12345
//
//    1
//   122
//  12332
// 1234432
//123455432
//
//987656789
// 8765678
//  76567
//   656
//    5