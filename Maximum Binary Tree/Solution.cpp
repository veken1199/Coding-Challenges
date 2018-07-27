// Example program
#include <iostream>
#include <string>
#include <vector>

using namespace std;

// Definition for a binary tree node.
struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode(int x) : val(x), left(NULL), right(NULL) {}
};

class Solution {
public:
    TreeNode* constructMaximumBinaryTree(vector<int>& nums) {
        return constructMaximumBinaryTree(nums, 0, nums.size()-1);
    }
    
    // Overloaded
    TreeNode* constructMaximumBinaryTree(vector<int>& nums, int start, int end) {
        // Get the index of the max
        if(start > end) {
            return nullptr;
        }
        int maxIndexVal = maxIndex(nums, start, end);
        // Create the tree
        TreeNode* headNode = new TreeNode(nums[maxIndexVal]);
        // Setting the left subtree
        headNode->left = constructMaximumBinaryTree(nums, start, maxIndexVal-1);
        // Setting the right subtree
        headNode->right = constructMaximumBinaryTree(nums, maxIndexVal+1, end);
        return headNode;
    }
    
    int maxIndex(const vector<int>& nums, int start, int end) {
        int maxIndex = start;
        for(int index = ++start; index <= end; index++) {
            if(nums[index] > nums[maxIndex]) {
                maxIndex = index;
            }
        }
        
        return maxIndex;
    }
    
    void print(TreeNode* node) {
        if(node != nullptr) {
            print(node->left);
            cout << node->val;
            print(node->right);
        }
    }
};

int main()
{
  Solution sol;
  vector<int> nums = {3,2,1,6,0,5};
  TreeNode* head = sol.constructMaximumBinaryTree(nums);
  sol.print(head);
  cout << sol.maxIndex({1,6,3},0,2);
    // Output
    // 3216051
    //       6
    //     /   \
    //   3     5
    //    \    / 
    //     2  0   
    //      \
    //       1
}
