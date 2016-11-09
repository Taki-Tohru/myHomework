#include <iostream>

using namespace std;

float Plus(float a, float b) { return a+b; }
float Minus(float a, float b) { return a-b; }
float Multiply(float a, float b) { return a*b; }
float Divide(float a, float b) { return a/b; }

void Switch(float a, float b, char opCode) {
	float result;

	switch(opCode) {
		case '+': result = Plus(a, b); break;
		case '-': result = Minus(a, b); break;
		case '*': result = Multiply(a, b); break;
		case '/': result = Divide(a, b); break;
	}
	cout << "Switch: 2+5=" << result << endl;
}

void Switch_With_Function_Pointer(float a, float b, float (*pt2Func)(float, float)) {
	float result = pt2Func(a, b);
	cout << "Switch replaced by function pointer: 2-5=";
	cout << result << endl;
}

void Replace_A_Switch() {
	cout << endl << "Executing function 'Replace_A_Switch'" << endl;
	Switch(2, 5, '+');
	Switch_With_Function_Pointer(2, 5, &Minus);
}

int main() {
	Replace_A_Switch();
	return 0;
}
