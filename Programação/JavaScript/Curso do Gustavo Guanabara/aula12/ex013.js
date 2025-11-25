// Aula 12 - Condições em JavaScript
let agora = new Date() // Cria um objeto Date com a data e hora atuais
let diaSem = agora.getDay() // Obtém o dia da semana (0-6)

/* 
    0 - Domingo
    1 - Segunda
    2 - Terça
    3 - Quarta
    4 - Quinta
    5 - Sexta
    6 - Sábado
*/

// console.log(diaSem)

switch(diaSem) { // Estrutura de seleção múltipla (switch case) - alternativa ao if else if else, quando há muitas condições baseadas em um mesmo valor, como dias da semana, meses do ano, etc.
    case 0: // Domingo
        console.log('Domingo')
        break // Encerra o bloco do case
    case 1: // Segunda
        console.log('Segunda')
        break
    case 2: // Terça
        console.log('Terça')
        break
    case 3: // Quarta
        console.log('Quarta')
        break
    case 4: // Quinta
        console.log('Quinta')
        break
    case 5: // Sexta
        console.log('Sexta')
        break
    case 6: // Sábado
        console.log('Sábado')
        break
    default: // Caso nenhum dos anteriores seja atendido (igual ao else)
        console.log('[ERRO] Dia inválido!')
        break // Encerra o bloco do default
}