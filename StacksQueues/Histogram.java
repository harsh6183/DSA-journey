
import java.util.Stack;
public class Histogram{
    public static void main(String[] args) {
        int[] heights = {2,3,5,6,4,3};
        Histogram h = new Histogram();
        int output= h.largestRectangleArea(heights);
        System.out.println(("Area of Histogram is => "+output));
    }

    public int largestRectangleArea(int[] heights){
        Stack <Integer> stack= new Stack<>();
        int n = heights.length;
        int max= Integer.MIN_VALUE;
        for(int i =0 ; i<=n;i++){
            int element = (i==n)?0:heights[i];
            while(!stack.isEmpty()&& heights[stack.peek()]>element){
                int h = heights[stack.pop()]; //height
                int ps = (stack.isEmpty()?-1:stack.peek()); //previous smaller
                int w = i-ps-1;  //width
                max = Math.max(max, h*w);
            }
            stack.push(i);
        }
         return (max==Integer.MIN_VALUE)?0:max;
    }
 
}

//Time complexity = O(n)