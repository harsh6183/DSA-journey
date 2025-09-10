//find element in 2d array

public class FindElement {
    public static void main(String[] args) {
        int[][] arr2d = {
                { 2, 4, 5, 6, 7, 6 },
                { 9, 3, 4, 2 },
                { 1, 0, 6, 5, 2, 7 }
        };
        boolean findLast = false;
        linearSearch2d(arr2d, 5, false);
        linearSearch2d(arr2d, 5, true);
    }

    public static void linearSearch2d(int[][] arr2d, int target, boolean findLast) {
        int OuterIndex = -1;
        int InnerIndex = -1;

        for (int i = 0; i < arr2d.length; i++) {
            boolean found = false;
            for (int j = 0; j < arr2d[i].length; j++) {
                if (target == arr2d[i][j]) {
                    OuterIndex = i;
                    InnerIndex = j;

                    if (findLast == false) {
                        found = true;
                        break;
                    }
                }
            }
            if(found==true){
                break;
            }
        }

        if (OuterIndex == -1) {
            System.out.println("Not found the Element");
        } else {
            System.out.println("Found element :" + OuterIndex + "," + InnerIndex);
        }
    }
}
