
#include <iostream>
#include <locale.h>
#include <string>
#include <iomanip>

using namespace std;

int main(){
	setlocale(LC_ALL, "");
	cout << setprecision(1) << fixed;

	string opcao;
	double n1, n2, resultado;

	cin >> opcao;
	if(opcao == "+" || opcao == "-" || opcao == "*" || opcao == "/"){
		cin >> n1 >> n2;
		if(opcao == "/" && n2 == 0){
			cout << "ERRO";
		}else{
			if(opcao == "+"){resultado = n1 + n2;}
			else if(opcao == "-"){resultado = n1 - n2;}
			else if(opcao == "*"){resultado = n1 * n2;}
			else{resultado = n1 / n2;}
			cout << "RESULTADO: " << resultado;
		}
	}else{
		cout << "ENTRADA INVALIDA";
	}
}

