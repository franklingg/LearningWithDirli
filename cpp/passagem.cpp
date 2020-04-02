
#include <iostream>
#include <locale.h>

using namespace std;

int main(){
	setlocale(LC_ALL, "");
	
	int passagem;
	cin >> passagem;

	if(passagem > 10){
		cout << "Passagem cara" << endl;
		cout << "Valor: " << passagem << endl;	
	} else if (passagem == 10){
		cout << "Passagem ok" << endl;
	} else {
		cout << "Passagem barata" << endl;
		cout << "Valor: " << passagem << endl;
	}
	cout << "Obrigado!";

	return 0;
}
