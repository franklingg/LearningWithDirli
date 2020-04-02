
#include <iostream>
#include <locale.h>
#include <string>
#include <string_view>
#include <sstream>

using namespace std;

int main(){
	setlocale(LC_ALL, "");
	
	string word;
	cin >> word;

	if(isdigit(word[0]) && isdigit(word[1])){
		cout << 'S';
	} else {
		cout << 'N';
	}
	return 0;
}
