package kr.leetcode

/**
 * 98. Validate Binary Search Tree
 *
 * https://leetcode.com/problems/validate-binary-search-tree/description/
 */
class ValidateBinarySearchTree {

    fun isValidBST(root: TreeNode?): Boolean {
        if (root == null) {
            return false
        }

        return recursiveValidBST(root, null, Int.MIN_VALUE, Int.MAX_VALUE)
    }

    private fun recursiveValidBST(root: TreeNode?, preRootValue: Int?, preLeftValue: Int, preRightValue: Int): Boolean {
        if (root == null) {
            return true
        }

        val left = root.left
        val right = root.right
        if (left != null && (
                    left.`val` >= root.`val` ||
                    left.`val` <= preLeftValue ||
                    (preRootValue != null && left.`val` >= preRootValue))) {
            return false
        }

        if (right != null && (
                    right.`val` <= root.`val` ||
                    right.`val` >= preRightValue ||
                    (preRootValue != null && right.`val` <= preRootValue))) {
            return false
        }

        if (left == null && right == null) {
            return true
        }

        val rightValue = right?.`val` ?: Int.MAX_VALUE
        val leftValue = left?.`val` ?: Int.MIN_VALUE
        val isValidLeft = recursiveValidBST(left, root.`val`, Int.MIN_VALUE, rightValue)
        val isValidRight = recursiveValidBST(right, root.`val`, leftValue, Int.MAX_VALUE)
        return isValidLeft && isValidRight
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}