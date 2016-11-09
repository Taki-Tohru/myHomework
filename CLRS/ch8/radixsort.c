#include <stdio.h>
#include <math.h>

void radixsort(int arr[], int arr_length, int d);
void bubble_sort(int arr[], int arr_length, int d);
int element(int x, int d);

void radixsort(int arr[], int arr_length, int d)
{
	int i;
	// int idx;

	for (i = 1; i <= d; i++) {
		bubble_sort(arr, arr_length, i);
	}
}

void bubble_sort(int arr[], int arr_length, int d)
{
	int temp;
	int i, j;
	// for (i = 1; i < arr_length; i++) {
	// 	j = i;

	// 	while (j > 0 && element(arr[j-1], d) > element(arr[j], d)) {
	// 		temp = arr[j];
	// 		arr[j] = arr[j-1];
	// 		arr[j-1] = temp;
	// 	}
	// }

	for (i = 0; i < arr_length; i++) {
		for (j = arr_length-1; j > i; j--) {
			if (element(arr[j], d) < element(arr[j-1], d)) {
				temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;
			}
		}
	}
}

int element(int x, int d)
{
	if (1 == d) {
		return x % 10;
	}
	else {
		return (x % ((int)pow(10, d))) / ((int)pow(10, d-1));
	}
}

int main()
{
	int array[10] = {901, 203, 779, 998, 665, 771, 333, 546, 173, 847};
	int i;

	printf("Before radix sort: \n");
	for (i = 0; i < 10; i++) {
		printf("%d ", array[i]);
	}
	printf("\n");

	radixsort(array, 10, 3);
	printf("After radix sort: \n");
	for (i = 0; i < 10; i++) {
		printf("%d ", array[i]);
	}
	printf("\n");

	return 0;
}

