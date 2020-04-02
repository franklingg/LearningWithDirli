
#include <iostream>
#include <locale.h>
#include <string>
#include <iomanip>

using namespace std;

int main(){
	setlocale(LC_ALL, "");
	
	double valor;
	string opcao;

	cin >> valor >> opcao;

	if(opcao == "debito"){
		cout << fixed << setprecision(1) << valor << " REAIS NO DEBITO";
	} else {
		char parcelamento;
		cin >> parcelamento;
		if (parcelamento == 's'){
			int n;
			cin >> n;
			double parcela = valor / n;
			cout << n << " PARCELAS DE " << fixed << setprecision(1) << parcela << " REAIS";
		}
		else {
			cout << fixed << setprecision(1) << valor << " REAIS NO CREDITO (DIRETO)";
		}
	}
	return 0;
}	
