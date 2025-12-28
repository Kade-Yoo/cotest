package leetcode

import kr.leetcode.ValidateBinarySearchTree
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class ValidateBinarySearchTreeTest {

    private val validateBinarySearchTree = ValidateBinarySearchTree()

    @Test
    fun isValidBST() {
        val root = ValidateBinarySearchTree.TreeNode(2)
        root.left = ValidateBinarySearchTree.TreeNode(1)
        root.right = ValidateBinarySearchTree.TreeNode(3)

        val result = validateBinarySearchTree.isValidBST(root)
        assertTrue(result)
    }

    @Test
    fun isValidBST2() {
        val root = ValidateBinarySearchTree.TreeNode(5)
        root.left = ValidateBinarySearchTree.TreeNode(1)
        root.right = ValidateBinarySearchTree.TreeNode(4)
        root.right!!.left = ValidateBinarySearchTree.TreeNode(3)
        root.right!!.right = ValidateBinarySearchTree.TreeNode(6)

        val result = validateBinarySearchTree.isValidBST(root)
        assertFalse(result)
    }

    @Test
    fun isValidBST3() {
        val root = ValidateBinarySearchTree.TreeNode(5)
        root.left = ValidateBinarySearchTree.TreeNode(4)
        root.right = ValidateBinarySearchTree.TreeNode(6)
        root.right!!.left = ValidateBinarySearchTree.TreeNode(3)
        root.right!!.right = ValidateBinarySearchTree.TreeNode(7)

        val result = validateBinarySearchTree.isValidBST(root)
        assertFalse(result)
    }

    @Test
    fun isValidBST4() {
        val root = ValidateBinarySearchTree.TreeNode(1)
        root.left = ValidateBinarySearchTree.TreeNode(-1)

        val result = validateBinarySearchTree.isValidBST(root)
        assertTrue(result)
    }

    @Test
    fun isValidBST5() {
        val root = ValidateBinarySearchTree.TreeNode(2)
        root.left = ValidateBinarySearchTree.TreeNode(2)
        root.right = ValidateBinarySearchTree.TreeNode(2)

        val result = validateBinarySearchTree.isValidBST(root)
        assertFalse(result)
    }

    @Test
    fun isValidBST6() {
        val root = ValidateBinarySearchTree.TreeNode(3)
        root.left = ValidateBinarySearchTree.TreeNode(1)
        root.right = ValidateBinarySearchTree.TreeNode(5)
        root.left!!.left = ValidateBinarySearchTree.TreeNode(0)
        root.left!!.right = ValidateBinarySearchTree.TreeNode(2)
        root.right!!.left = ValidateBinarySearchTree.TreeNode(4)
        root.right!!.right = ValidateBinarySearchTree.TreeNode(6)

        val result = validateBinarySearchTree.isValidBST(root)
        assertTrue(result)
    }

    @Test
    fun isValidBST7() {
        val root = ValidateBinarySearchTree.TreeNode(0)
        root.left = ValidateBinarySearchTree.TreeNode(-1)

        val result = validateBinarySearchTree.isValidBST(root)
        assertTrue(result)
    }

    // [3,1,5,0,2,4,6]
    // 실패 케이스
    @Test
    fun isValidBST8() {
        val root = ValidateBinarySearchTree.TreeNode(3)
        root.left = ValidateBinarySearchTree.TreeNode(1)
        root.right = ValidateBinarySearchTree.TreeNode(5)
        root.left!!.left = ValidateBinarySearchTree.TreeNode(0)
        root.left!!.right = ValidateBinarySearchTree.TreeNode(2)
        root.right!!.left = ValidateBinarySearchTree.TreeNode(4)
        root.right!!.right = ValidateBinarySearchTree.TreeNode(6)

        val result = validateBinarySearchTree.isValidBST(root)
        assertTrue(result)
    }

    // [32,26,47,19,null,null,56,null,27]
    // 실패 케이스
    @Test
    fun isValidBST9() {
        val root = ValidateBinarySearchTree.TreeNode(32)
        root.left = ValidateBinarySearchTree.TreeNode(26)
        root.right = ValidateBinarySearchTree.TreeNode(47)
        root.left!!.left = ValidateBinarySearchTree.TreeNode(19)
        root.right!!.right = ValidateBinarySearchTree.TreeNode(56)
        root.left!!.left!!.right = ValidateBinarySearchTree.TreeNode(27)

        val result = validateBinarySearchTree.isValidBST(root)
        assertFalse(result)
    }

}