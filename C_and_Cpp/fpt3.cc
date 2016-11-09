#include <iostream>

using namespace std;

int DoIt(float a, char b, char c) {
	printf("DoIt\n");
	return a+b+c;
}

void PassPtr(int (*pt2Func)(float, char, char)) {
	int result = (*pt2Func)(12, 'a', 'b');
	cout << result << endl;
}

void Pass_A_Function_Pointer() {
	cout << endl << "Executing 'Pass_A_Function_Pointer'" << endl;
	PassPtr(&DoIt);
}

int main() {
	Pass_A_Function_Pointer();
	return 0;
}
