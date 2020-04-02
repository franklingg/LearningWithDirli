
#include <iostream>
#include <locale.h>
#include <string>
#include <vector>
#include <sstream>

using namespace std;

int main(){
	setlocale(LC_ALL, "");
	
	vector<int> lista;
	int number, toCheck, n, i;
	
	cin >> n;	
	for(i=0; i<n;i++){
		cin >> number;
		lista.push_back(number);
	}
	cin >> toCheck;
	cout << lista[toCheck];
	return 0;
}

