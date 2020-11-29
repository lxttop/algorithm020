package leetcode.practice;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class BinaryTreeInorderTraveral_94 {

    // method 1: recurison
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        inorder(root, res);
        return res;
    }

    public static void inorder(TreeNode root, List<Integer> res){
        if (root == null) {
            return ;
        }
        inorder(root.left, res);
        res.add(root.val);
        inorder(root.right, res);
    }

    // method2: iteration
    public List<Integer> inorderTraversalI(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        Deque<TreeNode> stk = new LinkedList<TreeNode>();
        while (root != null || !stk.isEmpty()) {
            while (root != null) {
                stk.push(root);
                root = root.left;
            }
            root = stk.pop();
            res.add(root.val);
            root = root.right;
        }
        return res;
    }

    // method3:

    public static void main(String[] args){
        TreeNode thirdNode = new TreeNode(3);
        TreeNode secondNode = new TreeNode(2,thirdNode,null);
        TreeNode rootNode = new TreeNode(1, null, secondNode);
        BinaryTreeInorderTraveral_94 ha = new BinaryTreeInorderTraveral_94();
        List<Integer> result = ha.inorderTraversalI(rootNode);
        for (int i = 0; i < result.size(); i++){
            System.out.println(result.get(i));
        }

    }

}


