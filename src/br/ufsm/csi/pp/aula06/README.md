### Enunciado

1. Implemente a instanciação do Banco do Exercício 2 (introdução)
através de FactoryMethod.

2. Implemente um Singleton (qualquer classe).

3. Defina uma interface Prototype usando genéricos (class:
Prototype<T>, method: T clone()). Crie uma classe ContaBancaria
que implementa Prototype e uma classe para teste.

4. Implemente um Pool Genérico (classe concreta) de objetos a partir
da interface:

        public interface Pool<T> {
            T acquire();
            void release(T t);
        }  
     
    - O pool deverá manter no mínimo 3 instâncias criadas e deverá instanciar no
máximo 20. Caso algum cliente tente fazer acquire e o máximo já tenha sido
atingido, deverá esperar até que algum outro cliente devolva outro objeto
(problema dos produtores vs. Consumidores).