
#include <iostream>
#include <locale.h>
#include <string>

using namespace std;

int main(){
	setlocale(LC_ALL, "");

	string word, maior (""), menor ("sakdjhsakjdsahkjdsahkdljsahkdjashkdasjhdkjashdkjashdkjashds");
	int i;

	for(i=0; i<5;i++){
		cin >> word;
		if(word.length() > maior.length()){
			maior = word;
			if(word.length() < menor.length()){
				menor = word;
			}
		} else if(word.length() < menor.length()){
			menor = word;
		}

	}
	cout << menor << "\n" << maior;

}

