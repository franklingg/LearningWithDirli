
#include <iostream>
#include <locale.h>
#include <string>

using namespace std;

int main(){
	setlocale(LC_ALL, "");

	int ingratas = 0, vowel, i;
	string word;

	while(ingratas < 3){
		cin >> word;
		vowel = 0;
		for(i=0;i<word.length();i++){
			if(word[i] == 'a' || word[i] == 'e' || word[i] == 'i' || word[i] == 'o' || word[i] == 'u'){
				vowel+=1;
			}
		}

		if(vowel == 0){
			cout << word << endl;
			ingratas += 1;
		}
	}
}

