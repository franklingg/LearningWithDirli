
#include <iostream>
#include <locale.h>
#include <string>
#include <vector>
#include <sstream>

using namespace std;

int main(){
	setlocale(LC_ALL, "");
	
	string line;
	int number1, number2;

	getline(cin, line);
	istringstream stream(line);
	getline(cin, line);
	istringstream stream2(line);
	for(number1; stream >> number1; ){
		stream2 >> number2;
		cout << number1 - number2 << endl;
	}
	
	return 0;
}

