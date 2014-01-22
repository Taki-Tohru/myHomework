// How to return a Function pointer
#include <iostream>

using namespace std;


float Plus(float a, float b) {
	return a+b;
}
float Minus(float a, float b) {
	return a-b;
}

float (*GetPtr1(const char opCode))(float, float) {
	if (opCode == '+')
		return &Plus;
	else
		return &Minus;
}

typedef float(*pt2Func)(float, float);

pt2Func GetPtr2(const char opCode) {
	if (opCode == '+')
		return &Plus;
	else
		return &Minus;
}

void Return_A_Function_Pointer() {
	cout << endl << "Executing 'Return_A_Function_Pointer'" << endl;

	float (*pt2Function)(float, float) = NULL;

	pt2Function = GetPtr1('+');
	cout << (*pt2Function)(2, 4) << endl;

	pt2Function = GetPtr2('-');
	cout << (*pt2Function)(2, 4) << endl;
}

int main() {
	Return_A_Function_Pointer();
	return 0;
}
