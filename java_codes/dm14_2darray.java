public class dm14_2darray {
    public static void main(String[] args) {
        
        int[][] num = new int[3][4];
        for(int i =0; i <= 2; i++){
            for (int j=0; j<=3; j++){
                num[i][j]=(int) (Math.random()*100);
            }
        }


        for(int i =0; i <= 2; i++){
            for (int j=0; j<=3; j++){
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
    }
    
}



// int[] nums = new int[4];
// int [] nums1={1,3,4,54,6,778,89,};
// int cnt = nums1.length;
