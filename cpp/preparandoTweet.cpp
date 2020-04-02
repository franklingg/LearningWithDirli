
#include <iostream>
#include <locale.h>
#include <string>

using namespace std;

int main(){
	setlocale(LC_ALL, "");
	
	string phrase;
	int restante = 140;

	getline(cin, phrase);
	restante -= phrase.length();
	cout << restante;

	return 0;
}	
