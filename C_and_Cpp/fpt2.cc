#include <iostream>

using namespace std;


// C
int DoIt(float a, char b, char c) {
	printf("DoIt\n");
	return a+b+c;
}

int DoMore(float a, char b, char c) { // 这句不能像下面的成员函数那样加const
	printf("DoMore\n");
	return a-b+c;
}


// C++
class TMyClass {
	public:
		int DoIt(float a, char b, char c) {
			cout << "TMyClass::DoIt" << endl;
			return a+b+c;
		};
		int DoMore(float a, char b, char c)const {
			cout << "TMyClass::DoMore" << endl;
			return a-b+c;
		};
};

void Syntax_Of_Function_Pointers() {

	int (*pt2Function)(float, char, char) = NULL;
	int (TMyClass::*pt2Member)(float, char, char) = NULL;
	int (TMyClass::*pt2ConstMember)(float, char, char) const = NULL;

	pt2Function = DoIt; // short form
	pt2Function = &DoMore; // correct assignment using address operator

	pt2ConstMember = &TMyClass::DoMore; // correct assignment using address operator
	pt2Member = &TMyClass::DoIt; // note: <pt2Member> may also legally point to &DoMore



	// comparing function pointers
	// C
	if (pt2Function > 0) {
		if (pt2Function == &DoIt)
			printf("Pointer points to DoIt\n");
	} else {
		printf("Pointer not initialized!!\n");
	}

	// C++
	if (pt2ConstMember == &TMyClass::DoMore)
		cout << "Pointer points to TMyClass::DoMore" << endl;

	// calling a function using a function pointer
	int result1 = pt2Function(12, 'a', 'b'); // C short way
	int result2 = (*pt2Function)(12, 'a', 'b'); // C

	TMyClass instance1;
	int result3 = (instance1.*pt2Member)(12, 'a', 'b'); // C++
	// 这句也会出现编译错误
	// fpt2.cc:64: 错误：在非成员函数中使用 ‘this’ 无效
	// int result4 = (*this.*pt2Member)(12, 'a', 'b'); // C++ if this-pointer can be used

	TMyClass* instance2 = new TMyClass;
	int result5 = (instance2->*pt2Member)(12, 'a', 'b'); // C++, instance2 is a pointer
	delete instance2;

	cout << result1 << " " << result2 << " " << result3 << " " 
		<< result5 << endl;
}
int main() {
	Syntax_Of_Function_Pointers();
	return 0;
}
