// You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

// The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".

// Input: J = "aA", S = "aAAbbbb"
// Output: 3
#include<vector>

class Solution {
public:
    int numJewelsInStones(string J, string S) {
        int counter = 0;
        vector<int> jewelsMap(128);
        
        // put the jewels in a map
        for (char jewelLetter : J) {
            jewelsMap[int(jewelLetter)] = 1;
        }
        
        // find stones that are jewels too
        for(char stoneLetter : S) {
            if(jewelsMap[(int(stoneLetter))] == 1) {
                counter++;
            }
        }
        return counter;
    }
};

int main()
{

  Solution sol;
  cout << sol.numJewelsInStones("aA" , "aaAA") ;

}