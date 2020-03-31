### Enunciado
1. Implementar a mesma funcionalidade de Logs do Banco
(exercício anterior), porém através de um Proxy dinâmico:

   - Nos logs deverá haver o tempo decorrido na invocação de cada método;
    - Alterar o método factory estático getInstancia(), para entregar um 
    proxy do Banco.

2. Re-implementar o exercício do Pool Genérico, porém:
    - O pool não será mais genérico. Será um Pool para Conexões com 
    um SGBD qualquer (java.sql.Connection);
    - O pool não terá o método release();
    - Ao invés disso o cliente recebe um proxy para uma conexão, e
    quando este invocar “close()” isto terá o mesmo efeito de release.
    - Faça o Pool receber um DataSource como parâmetro, para criação
    das conexões.