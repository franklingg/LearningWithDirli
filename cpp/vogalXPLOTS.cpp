
#include <iostream>
#include <locale.h>
#include <string>
#include <vector>
#include <sstream>

using namespace std;

int main(){
	setlocale(LC_ALL, "");
	
	string word;
	char letter, xplots;
	cin >> word;

	for(int i=0; i<word.length();i++){
		letter = word.at(i);
		if(letter=='A'){xplots=letter; break;}
		else if(letter=='E' && xplots!='A'){xplots=letter;}
		else if(letter=='U' && (xplots!='A'&&xplots!='E')){xplots=letter;}
		else if(letter=='O' && (xplots!='A'&&xplots!='E'&&xplots!='U')){xplots=letter;}
		else if(letter=='I' && (xplots!='A'&&xplots!='E'&&xplots!='U'&&xplots!='O')){xplots=letter;}
	}
	cout << xplots;
	return 0;
}

