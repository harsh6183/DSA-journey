
import java.util.Stack;

public class Histogram {
    public static void main(String[] args) {
        int[] heights = { 2, 3, 5, 6, 4, 3 };
        Histogram h = new Histogram();
        int output = h.largestRectangleArea(heights);
        System.out.println(("Area of Histogram is => " + output));
    }

    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;

        for (int i = 0; i <= n; i++) {
            int currHeight = (i == n) ? 0 : heights[i];

            while (!stack.isEmpty() && currHeight < heights[stack.peek()]) {
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : (i - stack.peek() - 1);
                maxArea = Math.max(maxArea, height * width);
            }

            stack.push(i);
        }

        return maxArea;

    }

}

// Time complexity = O(n)