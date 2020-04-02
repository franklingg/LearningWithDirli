
#include <iostream>
#include <locale.h>
#include <string>
#include <sstream>

using namespace std;

int main(){
	setlocale(LC_ALL, "");
	
	string line, wordToShow = "?";

	while(getline(cin, line)){
		if(line=="wally"){break;}
		
		istringstream iss(line);

		for(string s; iss >> s; ){
			if(s.length() == 5){
				wordToShow = s;
			}
		}

		cout << wordToShow << endl;
		wordToShow = "?";
	}
	
	return 0;
}

