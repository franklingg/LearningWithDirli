
#include <iostream>
#include <locale.h>
#include <math.h>

using namespace std;

int main(){
	setlocale(LC_ALL, "");
	
	int prof;
	cin >> prof;

	cout << ceil(prof/3.0);
	return 0;
}	
