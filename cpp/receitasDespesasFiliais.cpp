
#include <iostream>
#include <locale.h>
#include <string>
#include <vector>
#include <sstream>

using namespace std;

int main(){
	setlocale(LC_ALL, "");
	
	vector<int> receitas, despesas;
	string line;
	int lucro_positivo = 0, lucro_negativo = 0;

	getline(cin, line);

	istringstream stream(line);
	for(int value; stream >> value; ){
		receitas.push_back(value);
	}
	getline(cin, line);
	istringstream stream2(line);
	int i=0, lucro;
	for(int value; stream2 >> value; ){
		despesas.push_back(value);
		lucro = receitas[i] - value;
		if(lucro > 0){lucro_positivo += lucro;}
		else{lucro_negativo += lucro;}
		i += 1;
	}
	cout << lucro_positivo << endl << lucro_negativo;

	return 0;
}

