
#include <iostream>
#include <locale.h>
#include <algorithm>
#include <string>
#include <vector>
#include <sstream>
#include <iomanip>

using namespace std;

void mySplit(string line, vector<string> &input){
	istringstream stream(line);
	for(string s; stream >> s; ){
		input.push_back(s);
	}
}

void createEvent(vector<string> input, string &event){
	event="";
	for(int i=1; i < input.size()-2; i++){
		event += input[i] + " ";
	}
	event += input[input.size()-2];
}

void dayHandler(vector<string> input, int &lastDay, int &maxDays){
	int today = stoi(input[0]);
	int days = today - lastDay - 1;
	if(days > maxDays){
		maxDays = days;
	}
	lastDay = today;
}

void costCheck(vector<string> input, double &balance, double &maxCost, string event, string &maxEvent){
	double currentBalance = stod(input[input.size()-1]);
	double cost = balance - currentBalance;
	balance = currentBalance;
	if(cost > maxCost){
		maxCost = cost;
		maxEvent = event;
	}	
}

void commaCout(double maxCost){
	string costString = to_string(maxCost);
	replace(costString.begin(), costString.end(), '.', ',');
	string costString2 = costString.substr(0, costString.find(',')+3);
	cout << costString2 << endl;
}


int main(){
	setlocale(LC_ALL, "");

	vector <string> input;
	string line, event, maxEvent;
	int lastDay=0, maxDays=0;
	double balance = 1200, maxCost = -1;

	while(getline(cin, line)){
		mySplit(line, input);
		createEvent(input, event);
		dayHandler(input, lastDay, maxDays);
		costCheck(input, balance, maxCost, event, maxEvent);
		input.clear();
	}
	
	cout << "MAIOR: " << maxEvent << " ";
	commaCout(maxCost);
	cout << "DIAS: " << maxDays << endl;

	return 0;
}	
