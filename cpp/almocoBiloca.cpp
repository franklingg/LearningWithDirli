
#include <iostream>
#include <locale.h>

using namespace std;

int main(){
	setlocale(LC_ALL, "");
	
	double total, saldo; 
	int cafes;

	cin >> total >> cafes;
	
	saldo = total - cafes * 0.5;
	
	if(saldo >= 10){
		cout << "PODE COMER!";
	} else {
		cout << "SEM COMIDA HOJE!";
	}
	return 0;
}
