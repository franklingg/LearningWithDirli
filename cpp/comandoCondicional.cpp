
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

	if(word.length() >= 5){
		cout << "PALAVRA GRANDE!";
	} else {
		cout << "palavrinha";
	}
	return 0;
}	
