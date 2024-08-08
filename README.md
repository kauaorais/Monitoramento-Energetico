Relatório Individual Trabalho de POO

Aluno: Francisco Kauã Morais Silva
Responsabilidades: Lider, Back end, e front end.

O nosso trabalho consistia em fazer uma aplicação que monitora-se os gastos energéticos dedispositivos eletrônicos de uma residência e a 
partir de um banco de dados com os gastos padrões que o Felype fez, retornar ao usuário se o gasto daquele equipamento estava acima do padrão e indicar o 
que ele poderia fazer para resolver. Partindo deste principio para o back end eu fiz um total de 5 classes em que consistiam, 
1° classe abstrata que nomeei “dispositivo”,  ao qual era responsável por diferir um dispositivo do outro e ler sua potencia gasta. 2° esta classe nomeei de equipamento eletrônico, esta recebia era uma extends de dispositivo, onde ela era responsável por ver a quantidade de horas que 
o equipamento teve de uso e calcular a media. 3° esta terceira classe nomeada monitor energético recebia os dados da segunda e fazia uma media do consumo
diário com a media mensal. 4° foi a classe monitor energeticoview, que era respoinsavel por ler os dados e retornar ao usuários os resultados, esta classes
era pra ser trocada para uma de conexão com o scenne builder mas não fui capaz de fazer isso, e relatarei os problemas 
que tive mais a frente. 5° esta quinta e o controller do monitor energético em que a mesma recebe os dados da view e uni com os dados do banco de dados em sql feito pelo membro do grupo Felype Hipólito.
Já na parte de scene builder não tive dificuldade de montar a interface da aplicação mas, ao tentar fazer a ligação com o bluej ocorria erros de conexão 
ao qual perguntei ao professor Hugo, e ele me orientou e refazer a conexão extensions 2, mesmo refazendo ao nomear os botões da aplicação e 
colocar no controller estava dando erro até que percebi que eu não estava entendo a função de cada, botão utilizado na interface, mas mesmo 
percebendo meu erro ainda fui incapaz de corrigir. 

