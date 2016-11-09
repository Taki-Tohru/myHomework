#include <stdio.h>

void quicksort(int arr[], int p, int r);
int partition(int arr[], int p, int r);

void quicksort(int arr[], int p, int r)
{
	int q;
	while (p < r) {
		q = partition(arr, p, r);
		quicksort(arr, p, q-1);
		p = q + 1;
	}
}

int partition(int arr[], int p, int r)
{
	int x = arr[r];
	int i = p - 1;
	int j;
	int temp;

	for (j = p; j <= r-1; j++) {
		if (arr[j] <= x) {
			i = i + 1;
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}

	temp = arr[i+1];
	arr[i+1] = arr[r];
	arr[r] = temp;

	return i+1;
}

int main()
{
	int array[13] = {13, 4, 3, 2, 17, 1, 16, 8, 0, 7, 9, 22, 15};
	int i;

	printf("Before sort: \n");
	for (i = 0; i < 13; i++) {
		printf("%i ", array[i]);
	}
	printf("\n");

	printf("After sort: \n");
	quicksort(array, 0, 12);
	for (i = 0; i < 13; i++) {
		printf("%i ", array[i]);
	}
	printf("\n");

	return 0;
}

