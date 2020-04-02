
#include <iostream>
#include <locale.h>
#include <string>

using namespace std;

int main(){
	setlocale(LC_ALL, "");
	
	int number;
	cin >> number;

	cout << number * 2;

	return 0;
}	
