package br.ufsm.csi.pp.utils;

/**
 * Interface que representa o nível de persistência de dados da aplicação.
 * Deve ser implementada por um framework de persistência de dados (mapeamento objeto-relacional).
 *
 * Created by Rafael on 09/10/2017.
 */
public interface PersistenceLayer {

    /**
     * método que recebe as classes gerando um create table para cada classe.
     * @param classes array de classes para gerar o create table
     * @return string contendo todos os create tables, separados por ';\n'
     */
    String generateCreateTable(Class[] classes);

}
