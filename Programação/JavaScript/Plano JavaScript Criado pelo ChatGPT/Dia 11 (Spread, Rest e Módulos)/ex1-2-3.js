// Exercícios de Default Parameters e Módulos em JavaScript
const somarVarios = (...nums) => nums.reduce((total, num) => total + num);

// Array SPREAD que combina arrays
const carros = ['McLaren', 'Ferrari', 'BMW'];
const motos = ['Honda', 'Yamaha', 'Suzuki'];

const carrosEmotos = [...carros, ...motos];

// Função com DEFAULT PARAMETER
const saudarVisitante = (nome = 'Visitante') => console.log(`Olá, ${nome}!`);

// Chamando as funções e array
const totalSoma = somarVarios(12, 100, 10);
console.log(totalSoma);

console.log(carrosEmotos);

saudarVisitante('Aleki');