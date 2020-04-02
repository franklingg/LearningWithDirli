
#include <iostream>
#include <locale.h>
#include <string>

using namespace std;

int main(){
	setlocale(LC_ALL, "");
	
	int caixa, sanduiches;
	cin >> caixa >> sanduiches;

	int sucos = caixa - sanduiches * 4;

	cout << sucos;
	return 0;
}	
