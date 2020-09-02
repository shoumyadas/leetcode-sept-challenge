class Solution {
      public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
	boolean found = false;
	for (int i = 0; i < nums.length; i++) {
	    for (int x = 1; x <= k; x++) {
		if ((i + x) < nums.length) {
		    long diff = Math.abs(Long.valueOf(nums[i]) - Long.valueOf(nums[i + x]));
		    if ((diff <= t)) {
			found = true;
			break;
		    }
		}
	    }
	    if (found)
		break;
	}
	return found;
    }
}
