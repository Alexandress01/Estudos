// Aula 15 - Variáveis Compostas (Arrays/Vetores/Listas) em JavaScript
let num = [5, 8, 2, 9, 3]

num.push(1)
num.sort()
console.log(num)
console.log(`O vetor tem ${num.length} posições`)
console.log(`O primeiro valor do vetor é ${num[0]}`)

let oito = num.indexOf(8)

if (oito == -1) {
    console.log('O valor não foi encontrado!')
} else {
    console.log(`O valor 8 está na posição ${oito}`)
}