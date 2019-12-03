## Trabalho de Padrões de Projeto - CSI

### Enunciado 

Demonstrar o uso de um padrão de projeto em Sistemas Web, contendo o seguinte:

- Explicações sobre a aplicação do padrão. Pode ser um padrão GoF ou não. Caso seja GoF, precisa estar relacionado com componentes/classes que tem função na parte Web. Caso não seja GoF, buscar uma relação de semelhança do padrão implementado, com um ou mais padrões GoF.
- Diagrama de classes: relacionando as classes do sistema com os papeis de cada uma no padrão de projetos. Pode ser necessário colocar o diagrama de classes genérico do padrão, relacionando com as suas classes.
- Código fonte: pode ser em qualquer linguagem de programação orientada a objetos (backend ou frontend).

Observações:
- Não pode ser MVC nem DAO, escolher outros.
- Não é necessário ser um projeto funcional.
- O trabalho é INDIVIDUAL.

***

### Padrão MVP

O padrão MVP tem a finalidade de separar a camada de apresentação das camadas de dados e regras de negócio.
O MPV é divido em três partes bem distintas e com responsabilidades específicas, são elas o Model, View e Presenter

- Presenter: "O presenter age como intermediário entre a view e o model. Ele retira os dados do modelo e retorna para
a view. Mas, diferente de típicos MVC, ele também decide o que acontece quando usuário interage com a view."
(TIN MEGALI, 2014)

- View: "O view, normalmente implementado por uma Atividade (também pode ser um Fragmento ou qualquer elemento UI, 
dependendo da estrutura do aplicativo), vai conter uma referência para o presenter. O presenter pode ser criado pela 
Activity ou fornecido via injeção de dependência. A única responsabilidade da View é chamar métodos no Presenter toda 
vez que o usuário interage com ela."(TIN MEGALI, 2014)

- Model "O model é responsável pelos dados que serão exibidos na interface do usuário. Poderíamos considerar como 
modelo, além dos dados, qualquer lógica de manipulação e acesso destes dados."

### Padrão Builder

O objetivo do pattern Builder é separar o processo de construção de um objeto permitindo a sua criação 
passo-a-passo. Diferentes tipos de objetos podem ser criados com implementações diferentes de cada passo.

Usado largamente em interafces gráficos, quando a criação depende de muitos objetos, como botões, inputs, etc.

***

### Referências

[DEVMEDIA](https://www.devmedia.com.br/o-padrao-mvp-model-view-presenter/3043]), acesso em 24 de novembro de 2019.

[MEGALI, Tin. MODEL VIEW PRESENTER (MVP) NO ANDROID, PARTE 1](http://www.tinmegali.com/pt/model-view-presenter-mvp-no-android-introducao/)
, acesso em 24 de novembro de 2019.

Material das aulas.