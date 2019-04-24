public class RecursionLab
{
/**
  * Write a recursive method named countToBy that accepts integer 
  * parameters n and m and that produces output indicating how to count
  * to n in increments of m separated by commas. For example, to count 
  * to 10 by 1 you'd say countToBy(10, 1); The following table shows 
  * several other calls and their expected output:
  * Call Meaning Output
  * countToBy(10,1); count to 10 by 1s 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
  * countToBy(25,4); count to 25 by 4s 1, 5, 9, 13, 17, 21, 25
  * countToBy(30,4); count to 30 by 4s 2, 6, 10, 14, 18, 22, 26, 30
  * countToBy(34,5); count to 34 by 5s 4, 9, 14, 19, 24, 29, 34
  * countToBy(3,6); count to 3 by 6s 3
  * countToBy(17,3); count to 17 by 3s 2, 5, 8, 11, 14, 17
  * Notice that the increment does not have to be 1, such as when 
  * counting to 25 by 4s. The count must always end at n, but notice 
  * that it will not always be possible to start counting at 1, 
  * as shown in the output when n is 30 and m is 4. But the first 
  * number should always be in the range of 1 to m inclusive. 
  * It is possible that only one number will be printed, as shown in 
  * the output when n is 3 and m is 6.
  */
 
  public String countToBy(int countTo, int by) {
    return null;
  }
 
 /**
  * Given an array of integer, compute recursively the number of times that the value 
  * 11 appears in the array. We'll use the convention of considering only 
  * the part of the array that begins at the given index. 
  * In this way, a recursive call can pass index+1 to move down the array. 
  * The initial call will pass in index as 0.
  array11(11, 4, 6], 0) -> 1
  array11([11, 11], 0) -> 2
  array11([1, 2, 3, 4], 0) -> 0
  */
 
  public int array11(int[] chars, int index) {
    return 0;    
  }
 
 /**
  *Write a recursive method zigzag that accepts an integer parameter n 
  *and retuns a String as follows. The middle character of the
  *output should always be an asterisk ("*"). If you are asked to write 
  *out an even number of characters, then there will be two asterisks in
  *the middle ("**"). Before the asterisk(s) you should write out 
  *less-than characters ("<"). After the asterisk(s) you should write 
  *out greater-than characters (">"). For example, the following calls 
  *produce the following String output:
  *zigzag(1); *
  *zigzag(2); **
  *zigzag(3); <*>
  *zigzag(4); <**>
  *zigzag(5); <<*>>
  */
 
  public String zigzag(int n) {
    return null;
  }
  
 
 /**
  * Write a recursive method named nonMatching that accepts two strings 
  * as parameters, and returns an integer representing the number of 
  * character indexes between the two strings that do not match. 
  * For this problem, two strings are defined as having a "match" at 
  * a given index if they contain exactly the same ASCII character 
  * value at that index. For example, consider the following 
  * two strings:
  * // index     0123456789
  * String s1 = "I love USF";
  * String s2 = "U Love School";
  * In the above example, eight indexes do not match:
  *  indexes 0, 2, 7, 8, 9. So the call of 
  *  nonMatching(s1, s2) would return 5. Any character could match 
  *  or fail to match, including letters, numbers, spacing, punctuation,
  *  etc. Your method is case-sensitive; notice that the 'l' and 'L' 
  *  at index 2 do not match.
  */
  public int nonMatching(String s1, String s2) {
    return 0;
  }

  /**
  * Write a recursive method named evenNumeros that accepts an integer 
  * parameter n and returns a new integer containing only the even digits
  * from n, in the same order. If n does not contain any even digits, 
  * return 0.
  * For example, the call of evenNumeros(8342116) should return 8426 
  * and the call of evenNumeros(35179) should return 0.*/
 
  public int evenNumeros(int n) {
    return 0;
  }
} 