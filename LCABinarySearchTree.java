/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class LCABinarySearchTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        /*
         * Time Complexity: O(n) for traversing all nodes
         * Space Complexity: O(h) height of the tree
         *
         */
        
//         while (root != null) {
            
//             if (root.val > p.val && root.val > q.val) {
//                 root = root.left;
//             } else if (root.val < p.val && root.val < q.val) {
//                 root = root.right;
//             } else {
//                 return root;
//             }
//         }
        
        // Recursive approach
        
        if (root.val > p.val && root.val > q.val) {
            lowestCommonAncestor(root.left, p, q);
        } else if (root.val < p.val && root.val < q.val) {
            lowestCommonAncestor(root.right, p, q);
        } else {
            return root;
        }
        
        return null;
    }
}
