// Arrow Functions em JavaScript
// Arrow functions são uma forma mais concisa de escrever funções em JavaScript.

// Exemplo de função tradicional
function subtracao(n1, n2) {
    return n1 - n2;
}

// Equivalente usando arrow function
const subtracao2 = (n1, n2) => n1 - n2;

// Outra função tradicional (com um único parâmetro)
function somarComDois(num) {
    return num + 2;
}

// Equivalente usando arrow function
const somarComDois2 = n => n + 2;

// Função tradicional para obter o dia do mês
function diaDoMes() {
    return new Date().getDate();
}

// Equivalente usando arrow function
const diaDoMes2 = () => new Date().getDate();

// Forma tradicional de uma função mais complexa
function superFuncao(a, b) {
    let subtracao = a - b;
    subtracao -= 2
    let diaDoMes = new Date().getDate();
    return diaDoMes;
}

// Equivalente usando arrow function. nesse caso, a sintaxe é praticamente a mesma. não faz muita diferença usar arrow function aqui
const superFuncao2 = (a, b) => {
    let subtracao = a - b;
    subtracao -= 2
    let diaDoMes = new Date().getDate();
    return diaDoMes;
}

// Testando as funções
console.log(subtracao2(10, 5));
console.log(somarComDois2(3));
console.log(diaDoMes2());