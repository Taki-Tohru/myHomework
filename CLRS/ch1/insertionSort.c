#include <stdio.h>

void insertion_sort(int [], int);

void insertion_sort(int array[], int arraySize)
{
	int i, j;
	int key;
	for (j = 1; j < arraySize; j++) {
		key = array[j];

		i = j - 1;
		while (i >= 0 && array[i] > key) {
			array[i+1] = array[i];
			i = i - 1;
		}
		array[i+1] = key;
	}
}

int main() {
	int i;
	int arr[10] = {10, 2, 1, 0, 13, 7, 12, 24, 6, 4};

	printf("Before insertion sort: \n");
	for (i = 0; i < 10; i++) {
		if (i != 9)
			printf("%i, ", arr[i]);
		else
			printf("%i", arr[i]);
	}
	// printf("\b\b");
	printf("\n");

	printf("After insertion sort: \n");
	insertion_sort(arr, 10);
	for (i = 0; i < 10; i++) {
		if (i != 9)
			printf("%i, ", arr[i]);
		else
			printf("%i", arr[i]);
	}
	// printf("\b\b");
	printf("\n");

	return 0;
}

