#include <stdio.h>

#define HEAP_SIZE 11
/* the length about array */
#define LENGTH 11

static int heap_size = HEAP_SIZE;

int parent(int);
int left(int);
int right(int);

void max_heapify(int array[], int i);
void build_max_heap(int array[]);
void heapsort(int array[]);

int parent(int i)
{
	return (i - 1) / 2;
}

int left(int i)
{
	return 2 * i + 1;
}

int right(int i)
{
	return 2 * i + 2;
}

void max_heapify(int array[], int i)
{
	int l, r;
	int largest;
	int temp;
	l = left(i);
	r = right(i);

	if (l <= heap_size - 1 && array[l] > array[i]) {
		largest = l;
	}
	else
		largest = i;

	if (r <= heap_size - 1 && array[r] > array[largest])
		largest = r;

	if (largest != i) {
		temp = array[i];
		array[i] = array[largest];
		array[largest] = temp;

		max_heapify(array, largest);
	}
}

void build_max_heap(int array[])
{
	int i;

	for (i = LENGTH/2; i >= 0; i--) {
		max_heapify(array, i);
	} 
}

void heapsort(int array[])
{
	int i;
	int temp;

	build_max_heap(array);

	for (i = HEAP_SIZE - 1; i >= 1; i--) {
		temp = array[0];
		array[0] = array[i];
		array[i] = temp;

		heap_size = heap_size - 1;
		max_heapify(array, 0);
	}
}

int main()
{
	int i;
	int arr[11] = {21, 12, 1, 3, 5, 2, 13, 7, 6, 20, 11};

	printf("Before heap sort: \n");
	for (i = 0; i < 11; i++) {
		printf("%i ", arr[i]);
	}
	printf("\n");

	printf("After heap sort: \n");
	heapsort(arr);
	for (i = 0; i < 11; i++) {
		printf("%i ", arr[i]);
	}
	printf("\n");

	return 0;
}

