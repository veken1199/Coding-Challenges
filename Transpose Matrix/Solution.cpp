// Example program
#include <iostream>
#include <string>
#include <vector>

using namespace std;
class Solution
{
    public:
	vector<vector<int>> transpose(vector<vector<int>> &matrix)
	{
		int numOfRows = matrix.size();
		int numOfColumns = matrix[0].size();
		vector<vector<int>> transpose(numOfColumns, vector<int>(numOfRows));

		for (int currentRow = 0; currentRow < numOfRows; currentRow++)
		{
			for (int currentColumn = 0; currentColumn < numOfColumns; currentColumn++)
			{
				transpose[currentColumn][currentRow] = matrix[currentRow][currentColumn];
			}
		}
		return transpose;
	}

	void print(vector<vector<int>> matrix)
	{
		for (vector<int> row : matrix)
		{
			for (int col : row)
			{
				cout << " " << col << " ";
			}
			cout << endl;
		}
	}
};

int main()
{
	Solution sol;
	vector<vector<int>> matrix = {{1, 5}, {3, 2}, {3, 2}};

	sol.print(matrix);
	cout << "\t----" << endl;

	vector<vector<int>> transposedMatrix = sol.transpose(matrix);
	sol.print(transposedMatrix);

	// output
	// 1 3 3
	// 5 2 2
}
