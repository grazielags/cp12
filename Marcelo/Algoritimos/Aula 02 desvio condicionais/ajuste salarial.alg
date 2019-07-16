Algoritmo "semnome"
// Uma empresa realizará um ajuste salarial variável de acordo com o
//cargo, conforme a tabela abaixo. Escreva um algoritmo que leia o
//salário e o cargo de um funcionário e calcule o novo salário. Se o
//funcionário for de um cargo diferente dos apresentados na tabela,
//ele deverá então receber 40% de aumento. Mostre o salário antigo,
//o novo salário e a diferença.
//
//Código Cargo Percentual
//1 Estagiário 10%
//2 Desenvolvedor 20%
//3 Analista 30%
Var
   salario,salarionovo:real
   cargo1:inteiro


Inicio
   Escreval("Escreva o salario")
   leia(salario)
   Escreval("Escreva o cargo:")
   leia(cargo1)

   se cargo1 = 1 entao
      salarionovo <- salario*10/100
      Escreval ("Seu salario antigo era de :", salario, "Seu novo salario é : ",salario + salarionovo)
   senao
      se cargo1 = 2 entao
         salarionovo<- salario*20/100
         Escreval ("Seu salario antigo era de :", salario, "Seu novo salario é : ",salario + salarionovo)
      senao
         se cargo1 = 3 entao
            salarionovo<- salario*30/100
            Escreval ("Seu salario antigo era de :", salario, "Seu novo salario é : ",salario + salarionovo)
         senao
            se cargo1> 3 entao
               salarionovo<- salario*40/100
               Escreval ("Seu salario antigo era de :", salario, "Seu novo salario é : ",salario + salarionovo)
            fimse
         fimse
      fimse
  fimse

Fimalgoritmo