
public class Basic{
    public static void main(String[] args) {
        printBits(39);
        OddEven(39);
    }

    //Printing Bits of the numbers
    public static void printBits(int num){
        for(int i=7; i>=0;i--){
            System.out.print((num>>i) & 1);
        }
        System.out.println();
    }

    //Finding the number is even or odd
     public static void OddEven(int num){
        if(isBitSet(num,0)){
            System.out.println("Number is odd");
        }
        else{
            System.out.println("Number is even");
        }
     }

     public static boolean isBitSet(int num,int bit){
        int res = num & (1<<bit);
        return (res==0)?false:true;
     }
}