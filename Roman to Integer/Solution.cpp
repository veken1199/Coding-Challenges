// Roman to Int
#include <iostream>
#include <string>
#include <unordered_map>

using namespace std;
const unordered_map<char,int> romanToIntMap = 
{{'I', 1}, {'V', 5}, {'X',10}, {'L', 50}, {'C', 100}, {'D', 500}, {'M',1000}};

class Solution {
public:
    int romanToInt(string romanNum) {
        int sum = 0;
        int previousNum = 0;
        for(char romanLetter : romanNum) {
            int currentNum = romanToIntMap.at(romanLetter);
            if (currentNum <= previousNum) {
                sum += currentNum;
            } else {
                sum += (currentNum - (previousNum*2));
            }
            previousNum = currentNum;
            cout << "sum now :" << sum << endl;
        }
        return sum;
    }
};

int main()
{
  Solution sol;
  cout << sol.romanToInt("MCMXCIV");
  // Output: 1994
}
