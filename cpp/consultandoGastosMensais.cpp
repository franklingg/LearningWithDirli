
#include <iostream>
#include <locale.h>
#include <string>
#include <vector>
#include <sstream>

using namespace std;

int main(){
	setlocale(LC_ALL, "");
	
	vector<string> meses;
	vector<int> gastos;
	string consulta, line;

	getline(cin, line);
	istringstream stream(line);
	for(string mes; stream >> mes; ){
		meses.push_back(mes);
	}
	getline(cin, line);
	istringstream stream2(line);
	for(int gasto; stream2 >> gasto; ){
		gastos.push_back(gasto);
	}
	
	getline(cin, consulta);
	for(int i=0; i<meses.size();i++){
		if(meses[i] == consulta){
			cout << gastos[i];
		}
	}

	return 0;
}

