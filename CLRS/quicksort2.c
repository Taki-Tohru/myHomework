#include <stdio.h>

void quicksort(int arr[], int p, int r);
int hoare_partition(int arr[], int p, int r);

void quicksort(int arr[], int p, int r)
{
	int q;
	if (p < r) {
		q = hoare_partition(arr, p, r);
		quicksort(arr, p, q);
		quicksort(arr, q+1, r);
	}
}

int hoare_partition(int arr[], int p, int r)
{
	int x = arr[p];
	int i = p - 1;
	int j = r + 1;
	int temp;

	while (1) {
		do {
			j = j - 1;
		} while (arr[j] > x);

		do {
			i = i + 1;
		} while (arr[i] < x);

		if (i < j) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		else
			return j;
	}
}

int main()
{
	int array[12] = {13, 19, 9, 5, 12, 8, 7, 4, 11, 2, 6, 21};
	int i;

	printf("Before sort: \n");
	for (i = 0; i < 12; i++) {
		printf("%i ", array[i]);
	}
	printf("\n");

	printf("After sort: \n");
	quicksort(array, 0, 11);
	for (i = 0; i < 12; i++) {
		printf("%i ", array[i]);
	}
	printf("\n");

	return 0;
}

