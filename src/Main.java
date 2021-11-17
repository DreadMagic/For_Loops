public class Main {
    public int addEvens(int n){
        int sum = 0;
        for(int i = 2; i <= n;  sum += i, i+=2){}
        return sum;
    }
    public void printSquareBack(int n){
        for(int i = n; i>0;i--)
            System.out.print(i*i + ", ");
    }
    public void sillyNumbers1(){
        for (int a = 1; a<= 3; a++){
            for (int i = 0; i <= 9; i++) {
                for (int j = 1; j<=3; j++){
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    }
    public void sillyNumbers2(){
        for (int a = 1; a<= 4; a++){
            for (int i = 9; i >= 0; i--) {
                for (int j = 1; j<=i; j++){
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    }
    public void dollarsAndStars(){
        for(int i = 7; i > 0; i--){
             for(int j = 2*(7-i); j > 0; j-- ) System.out.print("*");
             for(int j = i; j > 0; j--) System.out.print("$");
             for(int j = 2*i; j>0; j--) System.out.print("*");
             for(int j = i; j > 0; j--) System.out.print("$");
             for(int j = 2*(7-i); j > 0; j-- ) System.out.print("*");
             System.out.println();
        }
    }
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.addEvens(6));
        System.out.println(m.addEvens(7));
        System.out.println(m.addEvens(8));

        System.out.println();

        m.printSquareBack(8);

        System.out.println();

        m.sillyNumbers1();

        System.out.println();

        m.sillyNumbers2();

        System.out.println();

        m.dollarsAndStars();
    }
}
