Algoritmo "semnome"
// A empresa “Flor do campo” faz o pagamento de seus funcionários
//por hora. Faça um algoritmo que calcule e exiba o salário de um
//funcionário (obter nome, horas trabalhadas e nível do funcionário).
//Sabendo que o valor da hora segue a tabela abaixo:
//Funcionário Nível Junior R$ 12,00 por hora
//Funcionário Nível Pleno R$ 25,00 por hora
//Funcionário Nível Senior R$ 50,00 por hora
Var
   // Seção de Declarações das variáveis
   nome : caracter
   horas : real
   nivel1 : inteiro

Inicio
   Escreval("Nome do funcionario")
   Leia(nome)
   Escreval("Horas trabalhada")
   leia(horas)
   Escreval ("Nivel do operador")
   leia(nivel1)
   se nivel1 = 1 entao
      Escreval (" R$ ", horas*12)
      senao
      se nivel1 = 2  entao
         Escreval (" R$ ", horas*25)
         senao
           se nivel1 = 3  entao
         Escreval(" R$ ", horas*50)
      fimse
     fimse
     fimse
Fimalgoritmo