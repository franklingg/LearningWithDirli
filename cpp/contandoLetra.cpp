
#include <iostream>
#include <locale.h>
#include <string>

using namespace std;

int main(){
	setlocale(LC_ALL, "");

	char letter;
	string phrase, check;
	int cont=0;

	getline(cin, check);
	getline(cin, phrase);

	char toVerify = check.at(0);

	for(int i=0; i<phrase.length();i++){
		letter = phrase.at(i);
		
		if(letter == toVerify){
			cont += 1;
		}
	}
	
	cout << cont;

	return 0;
}

