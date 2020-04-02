
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

	for(int i=0; i<word.length(); i++){
		cout << i+1 << ": " << word.at(i) << endl;
	}
	return 0;
}

