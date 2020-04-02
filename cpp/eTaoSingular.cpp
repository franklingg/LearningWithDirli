
#include <iostream>
#include <locale.h>
#include <string>
#include <vector>
#include <sstream>

using namespace std;

int main(){
	setlocale(LC_ALL, "");
	
	string word;
	char last;
	
	cin >> word;
	last = word.at(word.length()-1);
	if(last == 's' || last == 'S'){
		cout << "TALVEZ PLURAL";
	} else {
		cout << "TALVEZ SINGULAR";
	}
	return 0;
}
