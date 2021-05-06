class Solution
{
    static int segregate(int arr[], int size)
	{
		int j = 0, i;
		for (i = 0; i < size; i++) {
			if (arr[i] <= 0) {
				int temp;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;

				j++;
			}
		}

		return j;
	}
	

	static int missingNumber(int arr[], int size)
	{
		
        int shift = segregate(arr, size);
		int arr2[] = new int[size - shift];
		int j = 0;
		for (int i = shift; i < size; i++) {
			arr2[j] = arr[i];
			j++;
		}

		for (int i = 0; i <arr2.length; i++) {
			int x = Math.abs(arr2[i]);
			if (x - 1 < arr2.length && arr2[x-1] > 0)
				arr2[x - 1] = -arr2[x - 1];
		}

		
		for (int i = 0; i < arr2.length; i++)
			if (arr2[i] > 0)
				return i + 1; 
		return arr2.length+1;
	}
}
