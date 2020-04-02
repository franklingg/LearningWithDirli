
#include <iostream>
#include <locale.h>
#include <string>

using namespace std;

int main(){
	setlocale(LC_ALL, "");
	int correto, tentativa;
	cin >> correto;
	while(true){
		cin >> tentativa;
		if(tentativa == correto){
			cout << "ACERTOU";
			break;
		} else if (tentativa > correto){
			cout << "MAIOR" << endl;
		} else {
			cout << "MENOR" << endl;
		}
	}
}

