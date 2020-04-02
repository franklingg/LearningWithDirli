
#include <iostream>
#include <locale.h>
#include <string>
#include <stdlib.h>

using namespace std;

int main(){
	setlocale(LC_ALL, "");

	int ideal, altura;
	cin >> ideal >> altura;
	int diff0 = abs(ideal-altura), diff1;
	
	while(diff0 != 0){
		cin >> altura;
		diff1 = abs(ideal-altura);
		if(diff1 == 0){break;}
		else if(diff1 >= diff0){
			cout << "PERIGO" << endl;
		}else{
			cout << "ADEQUADO" << endl;
		}
		diff0 = diff1;
	}
	cout << "OK" << endl;
}

