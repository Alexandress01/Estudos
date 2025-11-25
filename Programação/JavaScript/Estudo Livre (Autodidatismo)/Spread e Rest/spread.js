// Operador spread = ...
// Permite que um iterável, como um array ou string, seja expandido em elementos separados (descompactando os elementos)

let numeros = [1, 2, 3, 4, 5];

// Pegando o maior e o menor valor do array. Sem o spread não é possível fazer isso, pois não dá pra colocar um array dentro do método 'Math'
let maximo = Math.max(...numeros);
let minimo = Math.min(...numeros);

console.log(minimo);

// Criando uma variável 'nome' e separando todas as letras com o spread
let nome = 'Aleki';
let letras = [...nome].join('-');

console.log(letras)

// Juntando arrays com o spread e adicionando mais dois elementos
let frutas = ['Maça', 'Laranja', 'Banana'];
let vegetais = ['Cenouras', 'Couve', 'Batatas'];

let alimentos = [...frutas, ...vegetais, 'Ovos','Leite'];

console.log(alimentos);