//Leetcode 104 Find the Max Depth of the Binary tree

//Solved using BFS 

import javax.swing.tree.TreeNode;

public class MaxDepthBT {
    //Solved using BFS
//     if(root ==null){
//             return 0;
//         }
//         Queue<TreeNode> queue = new LinkedList<>();
//         queue.offer(root);
//         int level =0;
//         while(!queue.isEmpty){
//             int size = queue.size();
//             while(size>0){
//                TreeNode node= queue.poll();
//                 size--;
//                 if(node.left!=null){
//                     queue.offer(node.left);
//                 }
//                 if(node.right!=null){
//                     queue.offer(node.right);
//                 }
//             }
//             if(!queue.isEmpty){
//                 level++;
//             }
//         }
//         return (level+1);
// }

//Solving using DFS (Recursion)
      public int maxDepth(TreeNode root) {
        if(root ==null){
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return (1+ Math.max(left,right));
       
    }
}