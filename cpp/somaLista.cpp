
#include <iostream>
#include <locale.h>
#include <string>
#include <vector>
#include <sstream>

using namespace std;

int main(){
	setlocale(LC_ALL, "");
	
	vector<int> lista;
	int i, number, id1, id2;

	for(i=0;i<5;i++){
		cin >> number;
		lista.push_back(number);		
	}
	cin >> id1 >> id2;
	cout << lista[id1] + lista[id2];
	return 0;
}
