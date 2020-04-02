
#include <iostream>
#include <locale.h>
#include <string>

using namespace std;

int main(){
	setlocale(LC_ALL, "");
	
	string word;
	int i;

	for(i=0;i<5;i++){
		cin >> word;
		if(word[0]=='a'){
			cout << "s" << "\n";
		}else{
			cout << "n" << "\n";
		}
	}
}

