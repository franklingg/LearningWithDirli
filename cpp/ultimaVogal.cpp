
#include <iostream>
#include <locale.h>
#include <string>

using namespace std;

int main(){
	setlocale(LC_ALL, "");
	
	string word;
	char last;

	for(int i=0; i<5; i++){
		cin >> word;
		last = word[word.length()-1];
		
		if(last == 'a' || last == 'e' || last == 'i' || last == 'o' || last == 'u'){
			cout << last;
		}
	}
	
	return 0;
}

