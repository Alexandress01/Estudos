// Exercícios de Arrow Functions e Desestruturação em JavaScript
const saudar = nome => console.log(`Olá, ${nome}!`);

const dobrar = num => num * 2;

// Chamando as funcões
console.log(dobrar(0.1));
saudar('Aleki');

let pessoa = {
    nome: 'Aleki',
    idade: 16,
    cidade: 'Lauro de Freitas'
};
// Desestruturando o objeto 'pessoa'
const { nome, idade, cidade } = pessoa;

console.log(`Meu nome é ${nome}, tenho ${idade} anos e moro em ${cidade}.`);