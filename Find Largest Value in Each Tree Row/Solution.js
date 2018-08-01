/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number[]}
 */

var largestValues = function (root) {
  var max = [], row = [];
  row.push(root);
  while (row.length) {
    var children = [], maxValue = -Infinity;
    row.forEach((element) => {
      if (element) {
        children.unshift(element.left);
        children.unshift(element.right);
        if (element.val > maxValue) {
          maxValue = element.val;
        }
      }
    });
    row = children;
    if (maxValue > -Infinity) {
      max.push(maxValue);
    }
  }
  return max;
}

function TreeNode(val) {
  this.val = val;
  this.left = null;
  this.right = null;
}

var leftNode = new TreeNode(5);
var rightNode = new TreeNode(7);

var root = new TreeNode(3);
root.right = rightNode;
root.left = leftNode;

console.log(largestValues(root))
//Output 
//[3,7]

