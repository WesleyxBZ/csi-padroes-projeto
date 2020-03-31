### Enunciado

1. Implementar o padrão memento para o exemplo do Editor apresentado durante a aula:
    - O editor deverá implementar um método `onKeyPressed(Key k`) que permite editar o texto contido neste
    - Quando o usuário pressionar espaço ou enter deverá ser criado um novo memento,
    desde que este não contenha o mesmo estado do memento anterior.
    - Caso o usuário pressione Ctrl+z será desfeita a última edição.
    - Caso o usuário pressione Ctrl+r será refeita a última edição desfeita, desde que nenhuma outra edição tenha sido 
    feita neste tempo.

2. Implementar um AudioPlayer que possui métodos que atendem a uma interface com o usuário, tais como:
    - `Play()`, `Next()`, `Previous()`, `Lock()`
    - A função executada por cada uma das teclas da interface dependem do estado em que o AudioPlayer está, por exemplo:
        - Se ele estiver bloqueado, nenhuma tecla faz nada exceto a tecla lock que fará o desbloqueio.
        - Se estiver tocando uma música, a tecla play fará a função de pause.
        - A função realmente executada pelo player deverá ser impressa na saída padrão.