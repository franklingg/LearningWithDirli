
#include <iostream>
#include <locale.h>
#include <string>
#include <vector>
#include <sstream>

using namespace std;

int main(){
	setlocale(LC_ALL, "");
	
	string word;
	int i, cont=0;
	char first;

	for(i=0; i<5; i++){
		cin >> word;
		first = word.at(0);	
		if (first=='a' || first=='e' || first=='i' || first=='o' || first=='u'){
			cont += 1;
		}
	}
	cout << cont;
	return 0;
}
