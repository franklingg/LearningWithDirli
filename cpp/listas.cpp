
#include <iostream>
#include <locale.h>
#include <string>
#include <vector>
#include <sstream>

using namespace std;

int main(){
	setlocale(LC_ALL, "");
	
	vector<int> lista;
	int i, number, toRead;

	for(i=0; i<5; i++){
		cin >> number;
		lista.push_back(number);
	}
	cin >> toRead;
	cout << lista[toRead];
	return 0;
}
