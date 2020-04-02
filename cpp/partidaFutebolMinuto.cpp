
#include <iostream>
#include <locale.h>
#include <string>
#include <sstream>
#include <vector>

using namespace std;

int main(){
	setlocale(LC_ALL, "");
	
	vector<string> entrada;
	string line;
	int golCasa = 0, golConvidado = 0, faltaCasa = 0, faltaConvidado = 0;

	while(getline(cin, line)){
		istringstream stream(line);
		for(string s; stream >> s; ){
			entrada.push_back(s);
		}
		if(entrada[1] == "GOL"){
			if(entrada[2] == "CASA"){
				golCasa += 1;
			}
			else{
				golConvidado += 1;
			}
		} else if(entrada[1] == "FALTA"){
			if(entrada[2] == "CASA"){
				faltaCasa += 1;
			}
			else{
				faltaConvidado += 1;
			}
		}
		entrada.clear();
	}
	cout << golCasa << " GOL CASA" << endl
	     << golConvidado << " GOL CONVIDADO" << endl
	     << faltaCasa << " FALTA CASA" << endl
	     << faltaConvidado << " FALTA CONVIDADO" << endl;

	return 0;
}	
