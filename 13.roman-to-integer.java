/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

// @lc code=start
class Solution {
    public int romanToInt(String s) {
        int correspondingNaturalNumber = 0;
        int answer = 0;
        int previous =0;

        for (int i = s.length()-1; i >=0 ; i--) {
            switch (s.charAt(i)){
                case 'I':
                    correspondingNaturalNumber=1;
                    break;
                case 'V':
                    correspondingNaturalNumber=5;
                    break;
                case 'X':
                    correspondingNaturalNumber=10;
                    break;
                case 'L':
                    correspondingNaturalNumber=50;
                    break;
                case 'C':
                    correspondingNaturalNumber=100;
                    break;
                case 'D':
                    correspondingNaturalNumber=500;
                    break;
                case 'M':
                    correspondingNaturalNumber=1000;
                    break;
                default:
                    correspondingNaturalNumber=0;
                    break;
            }
            if(correspondingNaturalNumber<previous){
                answer=answer-correspondingNaturalNumber;
            }
            else {
                answer=answer+correspondingNaturalNumber;
            }
            previous=correspondingNaturalNumber;
        }
        return answer;
    }
}
// @lc code=end

