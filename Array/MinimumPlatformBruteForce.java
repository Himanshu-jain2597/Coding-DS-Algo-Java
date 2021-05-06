

class GFG {
	
	public static int findPlatform(int arr[], int dep[],
								int n)
	{

		// plat_needed indicates number of platforms
		// needed at a time
		int plat_needed = 1, result = 1;
		int i = 1, j = 0;

		// run a nested loop to find overlap
		for (i = 0; i < n; i++) {
			// minimum platform
			plat_needed = 1;

			for (j = i + 1; j < n; j++) {
				// check for overlap
				if ((arr[i] >= arr[j] && arr[i] <= dep[j])
					|| (arr[j] >= arr[i]
						&& arr[j] <= dep[i]))
					plat_needed++;
			}

			// update result
			result = Math.max(result, plat_needed);
		}

		return result;
	}
}
