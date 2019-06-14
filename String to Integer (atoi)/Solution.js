/**
 * @param {string} str
 * @return {number}
 */
var myAtoi = function(str) {
      let isNegative = false;
      let base = 10;
      let parsedNumber = 0;
      let MIN_VALUE  = -Math.pow(2, 31);
      let MAX_VALUE = Math.pow(2,31) - 1
      
      // Clear the outer whitespaces 
      let strTrimed = str.trim();
      
      // Check if the first char is number or sign -/+
      let strSplitted = strTrimed.split('');
      
      if (strSplitted[0] === '+' || strSplitted[0] === '-' ) {
          if (strSplitted[0] === '-') { 
              isNegative = true;
          }
          strSplitted.shift();
      }
  
      else if (Number.isNaN(parseInt(strSplitted[0]))) return 0;
          
      // Iterate over the chars and parse them
      for (char of strSplitted) {
          let num = parseInt(char);
          if(!Number.isNaN(num)) {
              parsedNumber *= base; 
              parsedNumber += num;
              
              if(!isNegative && parsedNumber > MAX_VALUE) return MAX_VALUE;
              if(isNegative && (parsedNumber * -1) < MIN_VALUE) return MIN_VALUE;
          } else break;
      } 
      
      return isNegative ? parsedNumber * -1 : parsedNumber;
  }