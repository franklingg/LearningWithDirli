
#include <iostream>
#include <locale.h>
#include <string>

using namespace std;

int main(){
	setlocale(LC_ALL, "");

	string word1, word2;	

	cin >> word1;
	cin >> word2;

	if(word1.length() > word2.length()){
		cout << word2 << "\n" << word1;
	} else if (word1.length() < word2.length()){
		cout << word1 << "\n" << word2;
	} else {
		cout << word1 << "\n" << word1;
	}
}

