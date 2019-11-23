### Enunciado:

O aluno deverá desenvolver uma implementação da interface br.ufsm.csi.pp.formGenerator.FormGenerator que dada uma 
classe, esta deverá gerar o código HTML para um formulário desta classe. As classes deverão estar devidamente anotadas 
com as seguintes anotações:

    @Form(name = "nomeForm", action = "/action", submitButton = "Enviar"):
        Anotação para a classe com informações do formulário. Se uma classe não tiver esta anotação, não poderá ser
        gerado um form a partir dela.

        Atributos:
            name: atributo que será copiado para a tag form.
            action: atributo que também será copiado para a tag form.
            submitButton: nome do botão submit, que ficará no final do formulário

    @Field(name = "attrib", type = Field.FieldType.TEXT, label = "Atributo", size = 100)
        Anotação para um método getter, que caso existente, deverá gerar um campo no formulário HTML. Se uma método get não
         tiver esta anotação, não será gerado nenhum campo no form para ele.
        Atributos:
            name: name e id do campo de formulário.
            type: tipo do campo de formulário. Opções possíveis: text, textarea e hidden. Caso o tipo de retorno do
                método get na classe seja java.lang.Boolean este valor será ignorado e o campo sempre será checkbox.
            label: Label do campo do formulário.
            size: atributo que será copiado para a tag input.


1. Foi disponibilizada uma classe exemplo, bem como o resultado esperado em HTML, da execução do FormGenerator. Use a 
classe exemplo e o resultado esperado para testar a sua implementação.

2. A interface FormGenerator também tem um método "populateObject" que serve para preencher o objeto com os valores,
depois que o formulário é submetido. Será instanciado um novo objeto da classe recebida por parâmetro e setados os 
atributos @Field nos campos da classe com os valores retirados do map "parametrosRequisicao".

3. A implementação de FormGenerator deverá ser um SINGLETON.