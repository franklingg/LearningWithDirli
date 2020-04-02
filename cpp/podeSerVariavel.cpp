
#include <iostream>
#include <locale.h>
#include <string>
#include <vector>
#include <sstream>

using namespace std;

int main(){
	setlocale(LC_ALL, "");
	
	string word;
	cin >> word;
	
	if(isdigit(word[0])){
		cout << "N";
	} else {
		cout << "S";
	}
	return 0;
}
