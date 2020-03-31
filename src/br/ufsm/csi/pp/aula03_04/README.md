### Enunciado

* Crie uma classe banco que armazene um conjunto de contas e forneça métodos que permitam que sejam feitos criações de 
  conta, exclusão de contas, saques (uma conta corrente só pode fazer saques desde que o valor não exceda o limite de 
  saque -limite + saldo-), depósitos, emissão de saldo e extrato e transferência entre contas. 
* Uma conta possui um número, um saldo, um status que informa se ela é especial ou não, um limite e um conjunto de
  movimentações. Uma movimentação possui uma descrição, um valor e uma informação se ela é uma movimentação de crédito,
  débito ou de rendimento financeiro. 
* Além disto as contas podem ser do tipo: Poupança, Conta-corrente, Fundos de Renda Fixa ou Fundos de Renda Variável. 
  Dentre estes apenas os rendimentos de renda fixa e variável são tributados pelo IR, nestes casos deverá existir um
  método que calcula o valor do imposto devido com base no rendimento financeiro do mês e a alíquota de 27,5%.