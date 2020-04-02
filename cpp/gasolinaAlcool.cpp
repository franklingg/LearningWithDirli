
#include <iostream>
#include <locale.h>
#include <string>
#include <iomanip>
#include <sstream>

using namespace std;

int main(){
	setlocale(LC_ALL, "");
	
	double gasolina, alcool;
	int litros;
	
	cin >> alcool >> gasolina >> litros;
	if(alcool >= 0.7*gasolina){
		cout << fixed << setprecision(1) << litros * gasolina;
	} else {
		cout << fixed << setprecision(1) << litros * alcool;
	}
	return 0;
}

