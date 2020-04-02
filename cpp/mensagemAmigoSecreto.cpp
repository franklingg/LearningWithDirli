
#include <iostream>
#include <locale.h>
#include <string>
#include <vector>
#include <sstream>

using namespace std;

int main(){
	setlocale(LC_ALL, "");
	
	string pessoa = "pessoa", presente = "presente";
	char opcao1, opcao2;
	cin >> opcao1;
	
	if(opcao1 == 's'){
		cin >> pessoa;
	}
	
	cin >> opcao2;
	if(opcao2 == 's'){
		cin >> presente;
	}

	cout << "Oi " << pessoa << ", espero que goste de receber " << presente << "!" << endl;
	cout << "E Boas Festas!" << endl;

	return 0;
}
