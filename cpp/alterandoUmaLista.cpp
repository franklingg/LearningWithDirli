
#include <iostream>
#include <locale.h>
#include <string>
#include <vector>
#include <sstream>

using namespace std;

int main(){
	setlocale(LC_ALL, "");
	
	vector<int> lista;
	int i, number;

	for(i=0; i<5; i++){
		cin >> number;
		lista.push_back(number);
	}
	int indexChange, numberChange;
	cin >> indexChange >> numberChange;
	lista[indexChange] = numberChange;
	for(i=0; i<5;i++){
		cout << lista[i] << endl;
	}
	return 0;
}
