/*WAP to arrange a set of integer numbers in ascending order 
where input will be taken through command argument*/

class sort_bubble{
    public static void main(String args[]) {
        String temp;
        for(int i=0 ; i<args.length ; ++i){
            for(int j=0 ; j<(args.length-i-1) ; ++j){
                if(Integer.parseInt(args[j]) > Integer.parseInt(args[j+1])){
                    temp = args[j];
                    args[j] = args[j+1];
                    args[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted Array:");
        for(int i=0 ; i < args.length ; ++i){
            System.out.print(args[i] + " ");
        }
    }
}