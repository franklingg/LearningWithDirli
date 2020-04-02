
#include <iostream>
#include <locale.h>
#include <string>
#include <vector>
#include <sstream>

using namespace std;

int main(){
	setlocale(LC_ALL, "");
	
	string word, start;
	
	cin >> word;
	start = word.substr (0,2);
	if(start == "pa" || start == "pe" || start == "pi" || start == "po" || start == "pu"){
		cout << "s";
	} else {
		cout << "n";
	}
	return 0;
}
