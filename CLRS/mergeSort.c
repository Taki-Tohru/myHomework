#include<stdio.h>

#define NUM 19
#define MAX 20000

void merge(int A[], int p, int q, int r);
void merge_sort(int A[], int p, int r);

int main()
{
  int a[NUM] = {13,
                8, 3, 19, 17, 22, 5,
                9, 4, 2, 12, 7, 10,
                27, 34, 24, 11, 6, 6};
  int i = 0;
  for (i = 0; i < NUM; ++i)
    printf( "%d ", a[i]);
  printf("\n");

  merge_sort(a, 0, 18);
  for (i = 0; i < NUM; ++i)
    printf( "%d ", a[i]);
  printf("\n");

  return 0;
}

void merge(int A[], int p, int q, int r)
{
  int n1 = q - p + 1;
  int n2 = r - q;
  int L[11] = {0};
  int R[10] = {0};

  int i, j;
  for (i = 0; i < n1; i++)
  {
    L[i] = A[p + i];
  }
  for (j = 0; j < n2; j++)
  {
    R[j] = A[q + j + 1];
  }
  L[n1] = MAX;
  R[n2] = MAX;

  i = 0;
  j = 0;
  int k;
  for (k = p; k <= r; k++)
  {
    if (L[i] <= R[j])
    {
      A[k] = L[i];
      i = i + 1;
    }
    else
    {
      A[k] = R[j];
      j = j + 1;
    }
  }
}

void merge_sort(int A[], int p, int r)
{
  if (p < r)
  {
    int q = (p + r) / 2;
    merge_sort(A, p, q);
    merge_sort(A, q + 1, r);
    merge(A, p, q, r);
  }
}
