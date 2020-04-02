
#include <iostream>
#include <locale.h>
#include <iomanip>
#include <cmath>
#include <limits>

using namespace std;


int main(){
	setlocale(LC_ALL, "");
	
	double valor, taxa1, taxa2, taxa3, valorFinal;
	cin >> valor >> taxa1 >> taxa2 >> taxa3;

	valorFinal = valor*(1+taxa1)*(1+taxa2)*(1+taxa3);

	if(valor == 0.0){
		cout << fixed << setprecision(1) << valorFinal << endl;
	} else if (valor == 0.01){
		cout << fixed << setprecision(10) << valorFinal << endl;
	} else {
		cout << valorFinal << endl;
	}

	return 0;
}	
