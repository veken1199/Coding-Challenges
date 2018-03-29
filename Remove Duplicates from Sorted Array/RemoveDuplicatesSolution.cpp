
//Given a sorted array, remove the duplicates in - place such that each element appear only once and return the new length.
//
//Do not allocate extra space for another array, you must do this by modifying the input array in - place with O(1) extra memory.
//
//Example:
//
//Given nums = [1, 1, 2],
//
//Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
//It doesn't matter what you leave beyond the new length.

#include "stdafx.h"
#include <vector>
#include <iostream>

using namespace std;
class Solution {
public:
	int removeDuplicates(vector<int>& nums) {
		int i = 0;
		for (int j = 1; j < (nums.size()); j++) {
			if (nums[i] != nums[j]) {
				nums[++i] = nums[j];
			}
		}

		return nums.size() == 0 ? 0 : i + 1;
	}
};


int main()
{
	Solution sol;
	vector<int> nums = { 1,1,2,2 };
	cout<< "Array Size: " << sol.removeDuplicates(nums);
	
	int stop;
	cin >> stop;
    return 0;
}

