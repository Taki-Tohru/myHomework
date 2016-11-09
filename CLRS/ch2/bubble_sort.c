#include <stdio.h>

void bubble_sort(int array[], int arraySize);

void bubble_sort(int array[], int arraySize)
{
	int i, j;
	int temp;

	for (i = 0; i < arraySize; i++) {
		for (j = arraySize-1; j > i; j--) {
			if (array[j] < array[j-1]) {
				temp = array[j];
				array[j] = array[j-1];
				array[j-1] = temp;
			}
		}
	}
}

int main()
{
	int i;
	int arr[10] = {13, 0, 3, 1, 24, 7, 6, 9, 32, 4};

	printf("Before sort: \n");
	for (i = 0; i < 10; i++) {
		printf("%d, ", arr[i]);
	}
	printf("\n");
	printf("After sort: \n");
	bubble_sort(arr, 10);
	for (i = 0; i < 10; i++) {
		printf("%d, ", arr[i]);
	}
	printf("\n");

	return 0;
}

