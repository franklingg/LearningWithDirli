
#include <iostream>
#include <locale.h>
#include <string>
#include <vector>
#include <sstream>

using namespace std;

int main(){
	setlocale(LC_ALL, "");
	
	vector<int> lista;
	int i, number, id, toAdd;

	for(i=0; i<3;i++){
		cin >> number;
		lista.push_back(number);
	}
	cin >> id >> toAdd;
	lista[id] += toAdd;

	for(i=0; i<3;i++){
		cout << lista[i] << endl;
	}
	return 0;
}
