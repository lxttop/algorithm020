package leetcode.practice;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreePreorderTraversal_144 {
    // method 1: recurison
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        preorder(root, res);
        return res;
    }

    public static void preorder(TreeNode root, List<Integer> res){
        if (root == null) {
            return ;
        }
        res.add(root.val);
        preorder(root.left, res);
        preorder(root.right, res);
    }

    // method2: iteration
    public static List<Integer> preorderTraversalI(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
//        if (root == null) {
//            return res;
//        }
        Deque<TreeNode> stk = new LinkedList<TreeNode>();
        while (root != null || !stk.isEmpty()) {
            while (root != null) {
                res.add(root.val);
                stk.push(root);
                root = root.left;
            }
            root = stk.pop();
            root = root.right;

        }
        return res;
    }

    // method3:

    public static void main(String[] args){
        TreeNode thirdNode = new TreeNode(3);
        TreeNode secondNode = new TreeNode(2,thirdNode,null);
        TreeNode rootNode = new TreeNode(1, null, secondNode);
        TreeNode haha = new TreeNode();
        List<Integer> result = preorderTraversalI(haha);
        for (int i = 0; i < result.size(); i++){
            System.out.println(result.get(i));
        }

    }
}
