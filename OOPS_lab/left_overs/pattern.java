/* WAP to print a pattern using 2D Array
 1
 1 0 
 1 0 1 
 1 0 1 0
*/ 
class pattern{
    public static void main(String args[]){
        int A[][] = new int[4][];
        for(int i = 0 ; i < 4 ; i++){
            A[i] = new int[i+1];
            for(int j = 0 ; j <= i ; j++){
                A[i][j] = (j+1)%2;
            }
        }
        for(int i = 0 ; i < 4 ; i++){
            for(int j = 0 ; j <= i ; j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }
}

// OUTPUT:
// 1 
// 1 0 
// 1 0 1 
// 1 0 1 0 