
#include <iostream>
#include <locale.h>
#include <string>

using namespace std;

int main(){
	setlocale(LC_ALL, "");

	string word1, word2;
	cin >> word1 >> word2;

	if(word1[0] == word2[0] && word1[word1.length()-1] == word2[word2.length()-1]){
		cout << "S";
	}
	else {
		cout << "N";
	}
}

