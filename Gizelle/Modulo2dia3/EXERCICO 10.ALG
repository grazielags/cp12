Algoritmo "exercico 10"
//Escreva um algoritmo dado o nome, cargo e o seu salário bruto de um
//funcionário considere:
//     a. O salário bruto teve um reajuste de 38%.
//     b. O funcionário receberá uma gratificação de 20% do salário bruto.
//     c. O Salário total é descontado em 15%
//     d. Imprimir Nome, idade e cargo.
//     e. Imprimir o salário bruto.
//     f. Imprimir o salário líquido.

Var
nome, cargo : caractere
salario, reajuste, gratificacao, bruto, total, desconto : real
idade : inteiro

Inicio
escreva ("Nome funcionário: ")
leia (nome)
escreva ("Salario bruto: ")
leia (bruto)
escreva ("Idade funcionário: ")
leia (idade)
escreva ("Cargo funcionário: ")
leia (cargo)

reajuste <- bruto+(bruto*(38/100))
// reajuste <- bruto * 1.38
escreval ("a) Reajuste de 38%: R$", reajuste)

gratificacao <- (reajuste*(20/100))
escreval ("b) Gratificação de 20%: R$", gratificacao)

Total <- (reajuste+gratificacao)
Desconto <- total-((total*15)/100)
// desconto <- bruto * 0.85 : 0.85 pq é (1 - 0.15
escreval ("c) Total com 15% desconto: R$", desconto)

Escreval (nome, (" tem"), idade, (" anos e trabalha como "), cargo)
escreval ("Salário bruto: ", total)
escreval ("Salário líquido: ", desconto)

Fimalgoritmo