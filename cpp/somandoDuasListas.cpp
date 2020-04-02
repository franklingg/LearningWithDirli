
#include <iostream>
#include <locale.h>
#include <string>
#include <vector>
#include <sstream>

using namespace std;

int main(){
	setlocale(LC_ALL, "");
	
	vector<int> lista1, lista2;
	int number, n, i;

	cin >> n;
	for(i=0; i<n;i++){
		cin >> number;
		lista1.push_back(number);
	}
	for(i=0; i<n; i++){
		cin >> number;
		lista2.push_back(number);
		cout << lista1[i] + lista2[i] << endl;
	}
	return 0;
}

