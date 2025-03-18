import java.util.*;

public class Solution {

    // public int minCostII(int[][] costs) {
    // if (costs == null || costs.length == 0) {
    // return 0;
    // }

    // int n = costs.length;
    // int k = costs[0].length;

    // if (k == 1) {
    // return (n == 1) ? costs[0][0] : -1;
    // }

    // int prevMin = 0, prevSecondMin = 0, prevMinIndex = -1;

    // for (int i = 0; i < n; i++) {
    // int currMin = Integer.MAX_VALUE, currSecondMin = Integer.MAX_VALUE,
    // currMinIndex = -1;

    // for (int j = 0; j < k; j++) {
    // int cost = costs[i][j] + (j == prevMinIndex ? prevSecondMin : prevMin);

    // if (cost < currMin) {
    // currSecondMin = currMin;
    // currMin = cost;
    // currMinIndex = j;
    // } else if (cost < currSecondMin) {
    // currSecondMin = cost;
    // }
    // }

    // prevMin = currMin;
    // prevSecondMin = currSecondMin;
    // prevMinIndex = currMinIndex;
    // }

    // return prevMin;
    // }

    // public int lengthOfLongestSubstringTwoDistinct(String s) {
    // if (s == null || s.length() == 0) {
    // return 0;
    // }

    // int left = 0, right = 0;
    // int maxLength = 0;
    // Map<Character, Integer> charCount = new HashMap<>();

    // while (right < s.length()) {
    // char c = s.charAt(right);
    // charCount.put(c, charCount.getOrDefault(c, 0) + 1);
    // right++;

    // while (charCount.size() > 2) {
    // char leftChar = s.charAt(left);
    // charCount.put(leftChar, charCount.get(leftChar) - 1);
    // if (charCount.get(leftChar) == 0) {
    // charCount.remove(leftChar);
    // }
    // left++;
    // }

    // maxLength = Math.max(maxLength, right - left);
    // }

    // return maxLength;
    // }
    Solution(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("parameter constructor ");
        System.out.println("a:\t" + a);
        System.out.println("b:\t" + b);
    }

    int a, b;

    Solution() {
        this(10, 20);
        System.out.println("non parametrized constructor");
    }

    static int s;
    static {
        {
            System.out.println("instance block in static block");
        }
        System.out.println("static block is invoked");
        System.out.println("s:\t" + s);
    }

    public static void main(String[] args) {

        // Solution obj = new Solution();
        // System.out.println(obj.lengthOfLongestSubstringTwoDistinct("ccaabbb"));
        // System.out.println(obj.minCostII(new int[][] { { 1, 5, 3 }, { 2, 9, 4 } }));

        System.out.println("main method");
        {
            System.out.println("instance block in main method");
        }

    }
}
