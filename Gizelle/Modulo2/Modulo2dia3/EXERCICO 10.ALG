Algoritmo "exercico 10"
//Escreva um algoritmo dado o nome, cargo e o seu sal�rio bruto de um
//funcion�rio considere:
//     a. O sal�rio bruto teve um reajuste de 38%.
//     b. O funcion�rio receber� uma gratifica��o de 20% do sal�rio bruto.
//     c. O Sal�rio total � descontado em 15%
//     d. Imprimir Nome, idade e cargo.
//     e. Imprimir o sal�rio bruto.
//     f. Imprimir o sal�rio l�quido.

Var
nome, cargo : caractere
salario, reajuste, gratificacao, bruto, total, desconto : real
idade : inteiro

Inicio
escreva ("Nome funcion�rio: ")
leia (nome)
escreva ("Salario bruto: ")
leia (bruto)
escreva ("Idade funcion�rio: ")
leia (idade)
escreva ("Cargo funcion�rio: ")
leia (cargo)

reajuste <- bruto+(bruto*(38/100))
// reajuste <- bruto * 1.38
escreval ("a) Reajuste de 38%: R$", reajuste)

gratificacao <- (reajuste*(20/100))
escreval ("b) Gratifica��o de 20%: R$", gratificacao)

Total <- (reajuste+gratificacao)
Desconto <- total-((total*15)/100)
// desconto <- bruto * 0.85 : 0.85 pq � (1 - 0.15
escreval ("c) Total com 15% desconto: R$", desconto)

Escreval (nome, (" tem"), idade, (" anos e trabalha como "), cargo)
escreval ("Sal�rio bruto: ", total)
escreval ("Sal�rio l�quido: ", desconto)

Fimalgoritmo