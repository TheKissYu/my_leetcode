package leetCode.isSameTree;

import leetCode.util.TreeNode;

public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null ) {
            return true;
        }else if (p == null || q == null) {
            return false;
        }else {
            if ( p.val == q.val){
                boolean isLeftSame = isSameTree(p.left, q.left);
                boolean isRightSame = isSameTree(p.right, q.right);
                return isLeftSame && isRightSame;
            }else {
                return false;
            }
        }
    }
}
