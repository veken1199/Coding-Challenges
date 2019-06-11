/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number[]}
 */
var topKFrequent = function(nums, k) {
      let numbersFrequecyMap = new Map()
      
      nums.forEach(num => numbersFrequecyMap.set(num ,(numbersFrequecyMap.get(num)) + 1 || 1));
      sortedElements = Array.from(numbersFrequecyMap.entries())
          .sort(reverseSortFunction)
      return sortedElements.slice(0, k).map(element => element[0])  
  };
  
  var reverseSortFunction = function(entryA, entryB) {
      return entryB[1]-entryA[1];
  }