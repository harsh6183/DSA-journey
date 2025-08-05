//Take the n , k  array and print the wavetraversal array


public class WaveTraversal {
    public static void main(String[] args) throws Exception {
       
        int [][]arr = {{1,2},{4,3}};
            for (int j = 0; j < arr[0].length; j++) {
                if(j%2==0){
                    for(int i=0;i<arr.length;i++){
                        System.out.println(arr[i][j]);
                    }
                }else{
                    for(int i=arr.length-1;i>=0;i--){
                        System.out.println(arr[i][j]);
                    }
                }
            }
    }
}