
#include <iostream>
#include <locale.h>
#include <string>
#include <vector>
#include <sstream>

using namespace std;

int main(){
	setlocale(LC_ALL, "");
	
	string word;
	cin >> word;

	if(word == "moto"){
		cout << 5;
	} else if (word == "carro"){
		cout << 10;
	} else {
		cout << 30;
	}

	return 0;
}	
