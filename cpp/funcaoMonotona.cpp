
#include <iostream>
#include <locale.h>
#include <vector>

using namespace std;

int main(){
	setlocale(LC_ALL, "");
	
	vector<int> lista;
	int i, number;
	
	for(i=0; i<4;i++){
		cin >> number;
		lista.push_back(number);
	}

	if(lista[0] > lista[1] && lista[1] > lista[2] && lista[2] > lista[3]){
		cout << "POSSIVELMENTE ESTRITAMENTE DECRESCENTE";
	}
	else if(lista[0] < lista[1] && lista[1] < lista[2] && lista[2] < lista[3]){
		cout << "POSSIVELMENTE ESTRITAMENTE CRESCENTE";
	}
	else {cout << "FUNCAO NAO ESTRITAMENTE CRES/DECR";}

	return 0;
}
