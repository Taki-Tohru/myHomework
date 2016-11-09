#include <stdio.h>

#define iParent(i) (((i) - 1) / 2)
#define iLeftChild(i) (2 * (i) + 1)
#define iRightChild(i)  (2 * (i) + 2)

void siftDown(int a[], int start, int end);
void heapify(int a[], int count);
void heapsort(int a[], int count);

void heapsort(int a[], int count)
{
	int end;
	int temp;

	heapify(a, count);

	end = count - 1;
	while (end > 0) {
		temp = a[end];
		a[end] = a[0];
		a[0] = temp;

		end = end - 1;

		siftDown(a, 0, end);
	}
}

void heapify(int a[], int count)
{
	int start = iParent(count - 1);

	while (start >= 0) {
		siftDown(a, start, count - 1);
		start = start - 1;
	}
}

void siftDown(int a[], int start, int end)
{
	int root = start;
	int child;
	int swap;
	int temp;

	while (iLeftChild(root) <= end) {
		child = iLeftChild(root);
		swap = root;

		if (a[swap] < a[child]) {
			swap = child;
		}

		if ((child + 1) <= end && a[swap] < a[child + 1]) {
			swap = child + 1;
		}

		if (swap == root) {
			return;
		}
		else {
			temp = a[root];
			a[root] = a[swap];
			a[swap] = temp;

			root = swap;
		}
	}
}

int main()
{
	int arr[13] = {17, 2, 1, 0, 6, 13, 5, 3, 21, 19, 7, 14, 12};
	int i;

	printf("Before heapsort: \n");
	for (i = 0; i < 13; i++) {
		printf("%d ", arr[i]);
	}
	printf("\n");

	printf("After heapsort: \n");
	heapsort(arr, 13);
	for (i = 0; i < 13; i++) {
		printf("%d ", arr[i]);
	}
	printf("\n");

	return 0;
}

