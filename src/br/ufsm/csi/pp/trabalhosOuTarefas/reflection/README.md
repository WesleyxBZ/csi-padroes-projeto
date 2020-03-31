### Enunciado

O aluno deverá desenvolver uma implementação da interface br.ufsm.csi.pp.utils.PersistenceLayer que dado um conjunto de 
classes gera um comando CREATE TABLE para cada classe. As classes deverão estar devidamente anotadas com as seguintes 
anotações:

    @Tabela(nome = "nome_da_tabela"):
        Anotação para a classe com a identificação do nome da tabela.

    @ChavePrimaria
            Anotação para identificar o getter da propriedade que representa a chave primária da classe/tabela.

    @Coluna(nome = "nome_da_coluna", tipo = "tipo_coluna_no_bd", size = "tamanho", unique = "true|false"):
        Anotação para cada getter da classe que representa um atributo que deve ser persistido no SGBD.
        Atributos:
            nome: Nome da coluna a ser criada na tabela.
            tipo: Tipo da coluna a ser criada. Deve ser um tipo nativo do SGBD.
            size: Tamanho da coluna passado no tipo entre parênteses. Usado apenas nos tipos que suportam tamanho. 
            Ex. varchar(255), int(11).
            unique: Informa se a coluna deve ser criada como unique.


Após a implementação do PersistenceLayer, o aluno deverá alterar a classe de teste Main, colocando uma instância
da sua classe para teste com a classe "ClasseExemplo". Após o teste deverá imprimir na saída padrão um comando paracido 
com:
 
    @CREATE TABLE CLASSE_EXEMPLO (ID bigint, CODIGO bigint, ATRIBUTO1 varchar(200), ATRIBUTO2 varchar(10), primary key(ID));

Além, disso sua implementação de PersistenceLayer deverá ser um SINGLETON.