
#include <iostream>
#include <locale.h>
#include <string>

using namespace std;

int main(){
	setlocale(LC_ALL, "");
	
	string word;
	cin >> word;

	if(word == "banana"){cout << "True";}
	else{cout << "False";}
	
	return 0;
}	
