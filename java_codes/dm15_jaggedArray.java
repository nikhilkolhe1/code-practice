public class dm15_jaggedArray {
    public static void main(String[] args) {
        
    //  int[] nums = new int[4];
    //  int [] nums1={1,3,4,54,6,778,89,};
    //  int cnt = nums1.length;
     
    //  System.out.println(cnt);

    
            
            int[][] num = new int[3][];
           num [0]  = new int[3];
           num [1]  = new int[4];
           num[2] = new int[2];

            for(int i =0; i <= 2; i++){
                for (int j=0; j<=num.length; j++){
                    num[i][j]=(int) (Math.random()*100);
                }
            }
    
    
            for(int i =0; i <= 2; i++){
                for (int j=0; j<=num.length; j++){
                    System.out.print(num[i][j]+"|");
                }
                System.out.println();
            }
    
            for(int n[]:num){
                for(int m:n){
                    System.out.print(m +" ");
                }
                System.out.println();
            }
        



            // int [][][] num1= new int[5][4][4];  // 3d array
        
    

    }
}
