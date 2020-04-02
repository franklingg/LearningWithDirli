
#include <iostream>
#include <locale.h>
#include <string>

using namespace std;

int main(){
	setlocale(LC_ALL, "");
	
	int number, i;
	cin >> number;

	for(i=1; i<10; i++){
		cout << i << "x" << number << " = " << number * i << endl;
	}

	return 0;
}	
