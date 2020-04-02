
#include <iostream>
#include <locale.h>
#include <string>

using namespace std;

int main(){
	setlocale(LC_ALL, "");
	
	int lucro, funcionarios, sobras, balinhas;
	double preco;

	cin >> lucro >> funcionarios >> preco;
	sobras = lucro % funcionarios;
	balinhas = sobras / preco;

	cout << balinhas;
	return 0;
}	
