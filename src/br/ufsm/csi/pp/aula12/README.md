### Enunciado

1. Implementar o padrão Observer no problema das contas bancárias do módulo anterior.
   - Cada conta será observável e sempre que o saldo for negativo o Observer inclui o cliente na lista do
Serasa.

2. Implementar o padrão Command para um controle de videogame que possui os seguintes
botões:
   - A e B
   - Direcional: cima, baixo, esquerda, direita.
   - Os receivers são os diferentes jogos que podem ser utilizados com o videogame e na saída padrão
quando apertado cada botão, um resultado diferente será apresentado dependendo do jogo.
     - Ex.: futebol: A  chute , B  passe
     - Ex2.: Luta: A  soco, B  chute, Esq.  defesa

3. Implementar o padrão Command para um DAO com métodos simples como: remover,
atualizar, inserir e selecionar.
   - Cada um destes métodos do DAO gera um comando SQL que precisa ser processado pelo SGBD.
   - Implementar o padrão Command para abstrair os comandos SQL, considerando a conexão JDBC
como sendo o receiver;
   - Implementar um invoker de comandos SQL, que permite a execução em lote.
   - Os métodos