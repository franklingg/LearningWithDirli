
#include <iostream>
#include <locale.h>
#include <string>
#include <vector>
#include <sstream>

using namespace std;

int main(){
	setlocale(LC_ALL, "");
	
	string line;
	int soma=0;

	getline(cin, line);
	istringstream stream(line);
	for(int value; stream >> value; ){
		if(value % 2 == 0){
			soma += value;
		}
	}
	cout << soma;

	return 0;
}

