//Invert a binary tree.
//
//	   4
//	  / \
//	2     7
//    / \ / \
//  1   3 6   9
//to
//
//	 4
//    / \
//  7     2
//  / \ / \
//9   6 3   1
//Trivia:
//This problem was inspired by this original tweet by Max Howell :
//
//Google: 90 % of our engineers use the software you wrote(Homebrew), but you can’t invert a binary tree on a whiteboard so f*** off.

#include <iostream>

using namespace std;

struct TreeNode {
	int val;
	TreeNode *left;
	TreeNode *right;
	TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
	TreeNode(int x, TreeNode* l, TreeNode* r) : val(x), left(l), right(r) {}
};

class Solution {
public:
	TreeNode* invertTree(TreeNode* root) {
		if (root != nullptr) {
			TreeNode *temp = root->left;
			root->left = root->right;
			root->right = temp;
			invertTree(root->left);
			invertTree(root->right);
		} return root;
	}

	void printTree(TreeNode* root) {
		if (root->left != nullptr) {
			printTree(root->left);
		}
		cout << root->val << " ";
		if (root->right != nullptr) {
			printTree(root->right);
		}
	}
};




int main()
{
	TreeNode* root = new TreeNode(3);
	root->right = new TreeNode(3, new TreeNode(34), nullptr);
	root->left = new TreeNode(1);

	Solution sol;
	sol.printTree(root);

	sol.invertTree(root);
	sol.printTree(root);

	cout << "Tree Inverted !!";

	return 0;
}
