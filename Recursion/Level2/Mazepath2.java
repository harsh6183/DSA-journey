//Solution 2 for the mazepath
public class Mazepath2 {
    public static void main(String[] args) {
        int n1 =3;
        int n2 = 3;
        mazePath(0, 0, n1-1, n2-1, "");

    }

    public static void mazePath(int row,int col,int endCol,int endRow,String path){
        if(row==endRow && col ==endCol){
            System.out.println(path);
            return;
        }
        if(col<endCol){
            mazePath(row, col+1, endCol, endRow, path+"h");
        }
        if(row<endRow){
            mazePath(row+1, col, endCol, endRow, path+"v");
        }
    }
}
