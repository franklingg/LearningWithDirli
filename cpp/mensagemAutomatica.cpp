
#include <iostream>
#include <locale.h>
#include <string>

using namespace std;

int main(){
	setlocale(LC_ALL, "");
	
	string nome;
	cin >> nome;

	cout << "Exuberante estudante " << nome << ", lhe tenho na mais alta estima ao ler a sua mensagem e responder "
	        "que a resposta da sua pergunta encontra-se no site da disciplina.\n"
		"Cordialmente,\n"
		"Matheus G.\n";

	return 0;
}	
