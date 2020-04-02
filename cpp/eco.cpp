
#include <iostream>
#include <locale.h>
#include <string>

using namespace std;

int main(){
	setlocale(LC_ALL, "");
	
	string word;
	cin >> word;

	for(int i=0; i<3; i++){
		cout << word << " ";
	}
	cout << "...";

	return 0;
}	
