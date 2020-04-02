
#include <iostream>
#include <locale.h>
#include <string>

using namespace std;

int main(){
	setlocale(LC_ALL, "");
	
	int entrada, a , b;

	cin >> entrada;
	a = (1 + (3 * entrada));
	b = 2 * a;
	cout << b;

	return 0;
}	
