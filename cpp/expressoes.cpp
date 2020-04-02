
#include <iostream>
#include <locale.h>
#include <string>

using namespace std;

int main(){
	setlocale(LC_ALL, "");
	
	int number;
	cin >> number;

	cout << "dobro: " << number*2 << ", triplo: " << number*3;
	return 0;
}	
