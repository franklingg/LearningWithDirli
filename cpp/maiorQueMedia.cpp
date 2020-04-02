
#include <iostream>
#include <locale.h>
#include <string>
#include <vector>
#include <sstream>

using namespace std;

int main(){
	setlocale(LC_ALL, "");

	vector<int> values;
	string line;
	
	getline(cin, line);
	istringstream stream(line);
	
	int sum=0, n=0; 
	for(int s; stream >> s; ){
		values.push_back(s);	       
		sum += s;
		n += 1;
	}
	int media = sum / n;
	
	for(int i=0; i < n; i++){
		if(values[i] > media){
			cout << values[i] << " ";
		}
	}	
	return 0;
}

