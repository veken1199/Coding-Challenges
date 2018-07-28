// Example program
#include <iostream>
#include <string>
#include <vector>

using namespace std;
class Solution
{
      vector<int> rowMaxValues;
      vector<int> columnMaxValues;

    public:
      int maxIncreaseKeepingSkyline(vector<vector<int>> &grid)
      {
            int sum = 0;
            vector<int> rowMaxValues(grid.size(), 0);
            vector<int> columnMaxValues(grid.size(), 0);
            int numOfRows = grid.size(), numOfColumns = grid[0].size();

            for (int row = 0; row < numOfRows; row++)
            {
                  for (int column = 0; column < numOfColumns; column++)
                  {
                        int rowMax = getRowMax(row, grid, rowMaxValues);
                        int colMax = getColumnMax(column, grid, columnMaxValues);
                        sum += (rowMax > colMax ? colMax : rowMax) - grid[row][column];
                  }
            }
            return sum;
      }

      int getRowMax(int rowIndex, const vector<vector<int>> &grid, vector<int> &rowMaxValues)
      {
            if (rowMaxValues[rowIndex])
            {
                  return rowMaxValues[rowIndex];
            }
            else
            {
                  // Get the max in that row
                  int max = grid[rowIndex][0];
                  for (int index = 1; index < grid.size(); index++)
                  {
                        if (max < grid[rowIndex][index])
                        {
                              max = grid[rowIndex][index];
                        }
                  }
                  rowMaxValues[rowIndex] = max;
                  return max;
            }
      }

      int getColumnMax(int columnIndex, const vector<vector<int>> &grid, vector<int> &columnMaxValues)
      {
            if (columnMaxValues[columnIndex])
            {
                  return columnMaxValues[columnIndex];
            }
            else
            {
                  // Get the max in that column
                  int max = grid[0][columnIndex];
                  for (int index = 1; index < grid.size(); index++)
                  {
                        if (max < grid[index][columnIndex])
                        {
                              max = grid[index][columnIndex];
                        }
                  }
                  columnMaxValues[columnIndex] = max;
                  return max;
            }
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
      vector<vector<int>> matrix = {{3, 0, 8, 4},
                                    {2, 4, 5, 7},
                                    {9, 2, 6, 3},
                                    {0, 3, 1, 0}};

      sol.print(matrix);
      cout << "\t----" << endl;

      int total = sol.maxIncreaseKeepingSkyline(matrix);
      cout << total;
      // output
      // 35
}
