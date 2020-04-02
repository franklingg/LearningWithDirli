
#include <iostream>
#include <locale.h>
#include <string>
#include <vector>
#include <sstream>

using namespace std;

int main(){
	setlocale(LC_ALL, "");
	
	int maior=-1, maior2=-1;
	string line;
	getline(cin, line);
	
	istringstream stream(line);
	for(int value; stream >> value; ){
		if(value > maior){
			maior2 = maior;
			maior = value;
		} else if(value > maior2){
			maior2 = value;
		}
	}
	int soma = maior + maior2;
	cout << soma;
	return 0;
}

