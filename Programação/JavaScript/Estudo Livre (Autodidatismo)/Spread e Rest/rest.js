// Operador rest = ...
// Permite que uma função com um número variável de argumentos, agrupando-os em um array. É muito parecido com o 'spread', fazendo o oposto

// Exemplo 1
console.log('-----------------------------------------------------')

function abrirGeladeira(...lanches) {
    console.log(...lanches); // <-- Aqui tem um spread, que vai separar os elementos ao mesmo tempo
}

// Sem spread dessa vez
function pegarComida(...comidas) {
    return comidas;
}

const lanche1 = 'Pizza';
const lanche2 = 'Hambúrguer';
const lanche3 = 'Cachorro-quente';
const lanche4 = 'Coxinha';
const lanche5 = 'Pastel'

abrirGeladeira(lanche1, lanche2, lanche3, lanche4, lanche5);

const comidas = pegarComida(lanche1, lanche2, lanche4)

console.log(comidas)

console.log('-----------------------------------------------------')

// Exemplo 2
console.log('-----------------------------------------------------')

function somar(...numeros) {
    let resultado = 0;
    for (let numero of numeros) {
        resultado += numero;
    }
    return resultado;
}

function obterMedia(...numeros) {
    let resultado = 0;
    for (let numero of numeros) {
        resultado += numero;
    }
    return resultado / numeros.length;
}

const total = somar(1, 2, 3, 4, 5);

console.log(`O total da soma é ${total}`);

const media = obterMedia(7.5, 10, 8.5, 9, 5)

console.log(`A média é ${media}`) 

console.log('-----------------------------------------------------')

// Exemplo 3
console.log('-----------------------------------------------------')

function combinarStrings(...strings) {
    return strings.join(' ');
}

const nomeCompleto = combinarStrings('Benjamin', 'Kirby', 'Tenysson');

console.log(nomeCompleto);

// Fim
console.log('-----------------------------------------------------')