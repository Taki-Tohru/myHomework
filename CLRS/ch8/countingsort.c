#include <stdio.h>

void countingsort(int a[], int b[], int k);

void countingsort(int a[], int b[], int k) {
	int i, j;
	int c[23];
	for (i = 0; i <= k; i++) {
		c[i] = 0;
	}

	for (j = 0; j < 20; j++) {
		c[a[j]] = c[a[j]] + 1;
	}

	for (i = 1; i <= k; i++) {
		c[i] = c[i] + c[i-1];
	}

	for (j = 19; j >= 0; j--) {
		b[c[a[j]] - 1] = a[j];
		c[a[j]] = c[a[j]] - 1;
	}
}

int main() {
	int i;
	int a[20] = {
		22, 0, 17, 18, 9, 20, 7, 6, 11, 13, 
		21, 3, 14, 16, 15, 8, 4, 2, 1, 5
	};
	int b[20];

	printf("Begin counting sort: \n");
	for (i = 0; i < 20; i++) {
		printf("%d ", a[i]);
	}
	printf("\n");

	countingsort(a, b, 22);
	printf("After counting sort: \n");
	for (i = 0; i < 20; i++) {
		printf("%d ", b[i]);
	}
	printf("\n");

	return 0;
}

