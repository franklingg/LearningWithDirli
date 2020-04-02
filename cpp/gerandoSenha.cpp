
#include <iostream>
#include <locale.h>
#include <string>
#include <vector>
#include <sstream>

using namespace std;

int main(){
	setlocale(LC_ALL, "");
	
	string word;
	char letter;
	
	for(int i=0; i<4;i++){
		cin >> word;
		letter = word.at(i);
		cout << letter;
	}	
	return 0;
}
