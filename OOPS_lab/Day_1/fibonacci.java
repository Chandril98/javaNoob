/*WAP in Java to display the Fibonacci series of nth terms where
the 'n' value will be taken through command arguments*/

class fibonacciTerm{
    public static void main(String args[]) {
        int a=0,b=1,c;
        System.out.println();
        System.out.print(a + " " + b + " ");
        for(int i=2 ; i <= Integer.parseInt(args[0]) ; ++i){
            c = a + b;
            System.out.print(c + " ");
            a=b;
            b=c;
        }
    }
}