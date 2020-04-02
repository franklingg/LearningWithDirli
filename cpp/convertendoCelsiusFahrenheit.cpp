
#include <iostream>
#include <locale.h>
#include <string>

using namespace std;

int main(){
	setlocale(LC_ALL, "");
	
	int celsius, fahrenheit;

	cin >> celsius;
	fahrenheit = 1.8 * celsius + 32;

	cout << fahrenheit;

	return 0;
}	
