/*
The idea is to traverse recursively and swap the right and left subtrees after traversing the subtrees.

Follow the steps below to solve the problem:

1.Call Mirror for left-subtree i.e., Mirror(left-subtree)
2.Call Mirror for right-subtree i.e., Mirror(right-subtree)
3.Swap left and right subtrees.
     temp = left-subtree
     left-subtree = right-subtree
     right-subtree = temp

Below is the implementation of the above approach:
*/
class Solution 
{
    public TreeNode invertTree(TreeNode root) 
    {
        // base case
        //if trees empty,
        if(root == null)
            return null;
        
        // swap left child with right child
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        
       // left and right children
        root.left = invertTree(root.left);
        root.right = invertTree(root.right);
   
        return root;
    }
}

// TC : O(N) and SC : O(H) where h is height of tree. (Recursive space)