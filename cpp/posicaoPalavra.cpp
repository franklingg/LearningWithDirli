
#include <iostream>
#include <locale.h>
#include <string>
#include <vector>
#include <sstream>

using namespace std;

int main(){
	setlocale(LC_ALL, "");

	string phrase, line;
	char toCheck, letter;
	int pos = -1;
	
	getline(cin, line);
	getline(cin, phrase);
	toCheck = line.at(0);

	for(int i=0; i<phrase.length();i++){
		letter = phrase.at(i);
		if(letter == toCheck){pos = i;}
	}
	cout << pos;
	return 0;
}

