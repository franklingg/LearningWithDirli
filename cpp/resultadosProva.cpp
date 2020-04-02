
#include <iostream>
#include <locale.h>
#include <string>
#include <typeinfo>

using namespace std;

int main(){
	setlocale(LC_ALL, "");
	string aluno;
	int maior=-1, menor=1001, media, sum=0, acima=0, abaixo=0, n=0, i;
	int notas[1000];

	while(true){
		cin >> aluno;
		if(aluno == "-"){break;}
		cin >> notas[n];
		sum += notas[n];
		if (notas[n] > maior){
			maior = notas[n];
			if(notas[n] < menor){menor = notas[n];}
		}else if(notas[n] < menor){menor = notas[n];}
		n += 1;
	}
	media = sum / n;
	notas[n]='\0';
	for(i=0;i<n;i++){
		if(notas[i] >= 700){acima += 1;}
	}
	abaixo = n - acima;

	cout << "maior: " << maior << endl;
	cout << "menor: " << menor << endl;
	cout << "media: " << media << endl;
	cout << "acima: " << acima << endl;
	cout << "abaixo: " << abaixo << endl;

}

