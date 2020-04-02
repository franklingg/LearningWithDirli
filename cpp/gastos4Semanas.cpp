
#include <iostream>
#include <locale.h>
#include <string>
#include <vector>
#include <sstream>

using namespace std;

int main(){
	setlocale(LC_ALL, "");
	
	int total=0, maior=-1, menor = 1000;

	string semana;

	while(getline(cin, semana)){
		istringstream stream(semana);
		for(int dia; stream >> dia; ){
			total += dia;
			if(dia > maior){
				maior = dia;
				if(dia < menor){ menor = dia; }
			} else if (dia < menor){ menor = dia; }
		}
		cout << total << " " << menor << " " << maior << endl;
		total = 0;
		maior = -1;
		menor = 1000;
	
	}
	return 0;
}

