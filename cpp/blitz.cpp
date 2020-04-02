
#include <iostream>
#include <locale.h>
#include <string>

using namespace std;

int main(){
	setlocale(LC_ALL, "");
	
	int licenca, carteira;
	double bafometro;

	cin >> licenca >> carteira >> bafometro;

	if(licenca >= 30 || carteira >= 30 || bafometro > 0.05){
		cout << "True";
	} else {
		cout << "False";
	}

	return 0;
}	
