
#include <iostream>
#include <locale.h>
#include <string>

using namespace std;

int main(){
	setlocale(LC_ALL, "");
	
	int creditos, faltas, porcentagem;
	cin >> creditos >> faltas;

	porcentagem = ((creditos * 18 - faltas)*100) / (creditos * 18);

	cout << porcentagem << "%"; 

	return 0;
}	
