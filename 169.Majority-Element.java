// https://leetcode.com/submissions/detail/1253021049/
// Daily Coding Problem: Problem #1431 [Medium]

class Solution {
  public int majorityElement(int[] nums) {
    // moore voting algorithm
    int sz = nums.length;
    int cnt = 1;
    int maj = nums[0];
    for (int i = 1; i < sz; i++) {
      if (cnt == 0) {
        maj = nums[i];
      }
      if (nums[i] == maj) {
        cnt++;
      } else {
        cnt--;
      }

    }

    return maj;

  }
}
