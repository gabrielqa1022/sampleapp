#language:pt

@login
Funcionalidade: preencher dados
 Como usuario da aplicação 
 Quero informar os dados 
 Para acessar a proxima aba e preencher dados
 
  Cenario: dados informados
   Dado que esteja na aba de vehicle
   Quando preencho todos os dados
   E clico em next
   Entao preencho todos os dados insurant
   E clico em next pela segunda vez
   Entao preencho todos os dados pruduct
   E clico em next pela terceira vez
   Entao escolho um opcao em select price
   E clico em next pela quarta vez
   Entao preencho todos os dados em send quote
   E clico em send
   E clico em Ok
   