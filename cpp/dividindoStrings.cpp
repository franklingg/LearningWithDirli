
#include <iostream>
#include <locale.h>
#include <string>
#include <vector>
#include <sstream>

using namespace std;

int main(){
	setlocale(LC_ALL, "");
	
	string line, word1, word2;

	getline(cin, line);
	istringstream stream(line);
	getline(cin, line);
	istringstream stream2(line);

	for(word1; stream >> word1; ){
		stream2 >> word2;
		cout << word1 << " " << word2 << endl;
	}
	return 0;
}

