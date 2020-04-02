
#include <iostream>
#include <locale.h>
#include <string>
#include <vector>
#include <sstream>

using namespace std;

int main(){
	setlocale(LC_ALL, "");
	
	vector<int> lista1,lista2;
	int i, toCheck, number;

	for(i=0; i<4;i++){
		cin >> number;
		lista1.push_back(number);
	}
	for(i=0; i<4;i++){
		cin >> number;
		lista2.push_back(number);
	}
	cin >> toCheck;
	cout << lista1[toCheck] + lista2[toCheck];
	return 0;
}

