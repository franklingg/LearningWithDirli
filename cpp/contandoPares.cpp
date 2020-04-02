
#include <iostream>
#include <locale.h>
#include <string>
#include <vector>
#include <sstream>

using namespace std;

int main(){
	setlocale(LC_ALL, "");
	
	string line;
	int cont = 0;

	getline(cin, line);
	istringstream stream(line);
	int r;
	for(long long int number; stream >> number; ){
		
		if(number % 2 == 0){
			cont += 1;
		}
	}
	cout << cont;
	return 0;
}

