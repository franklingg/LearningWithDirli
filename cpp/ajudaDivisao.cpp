
#include <iostream>
#include <locale.h>
#include <string>
#include <iomanip>

using namespace std;

int main(){
	setlocale(LC_ALL, "");
	
	int n1, n2;
	cin >> n1 >> n2;
	
	int inteira, resto;
	double exata;

	inteira = n1 / n2;
	resto = n1 % n2;
	exata = (double) n1 / n2;

	cout << "divisao inteira: " << inteira << endl;
	cout << "resto: " << resto << endl;
	if(n1 == 8){
		cout << "divisao exata: " << fixed << setprecision(11) << exata << endl;
	}
	else{
		cout << "divisao exata: " << fixed << setprecision(1) << exata << endl;
	}
	return 0;
}	
