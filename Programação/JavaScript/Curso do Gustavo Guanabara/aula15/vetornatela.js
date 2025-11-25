// Aula 14 - Variáveis Compostas (Arrays/Vetores/Listas) em JavaScript
let valores = [8, 1, 7, 4, 2, 9]

/*
maneira burra de fazer (kkkkkkkkkkkkkkkkk)
console.log(valores[0])
console.log(valores[1])
console.log(valores[2])
console.log(valores[3])
console.log(valores[4])
console.log(valores[5])

forma tradicional de fazer
for (pos = 0; pos < valores.length; pos++) {
    console.log(`A posição ${pos} tem o valor ${valores[pos]}`)
}
*/

// forma simplificada de fazer (recomendada para arrays)
for (let valor of valores) {
    console.log(`A posição ${valor} tem o valor ${valores[valor]}`)
}
