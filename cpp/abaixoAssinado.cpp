
#include <iostream>
#include <locale.h>
#include <string>

using namespace std;

int main(){
	setlocale(LC_ALL, "");
	
	string nome;
	int interesse, n = 0, sum = 0;
	while(true){
		cin >> nome;
		if(nome == "fim"){break;}
		cin >> interesse;
		sum += interesse;
		n += 1;
	}
	
	cout << n << endl;
	int media = sum / n;
	cout << media;

	return 0;
}

