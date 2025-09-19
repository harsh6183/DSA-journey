//Leetcode 429 N-ary Tree Level Order Traversal
/*Given an n-ary tree, return the level order traversal of its nodes' values.

Nary-Tree input serialization is represented in their level order traversal, each group of children is separated by the null value */

package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NorderTraversal {
   
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};


class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root==null){
            return res;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            ArrayList<Integer> levelList = new ArrayList<>();
            while(size>0){
                Node node = queue.poll();
                levelList.add(node.val);
                for(Node child:node.children){
                    if(child!=null){
                        queue.offer(child);
                    }
                }
                size--;
            }
            res.add(levelList);
        }
        return res;
    }
}
}
