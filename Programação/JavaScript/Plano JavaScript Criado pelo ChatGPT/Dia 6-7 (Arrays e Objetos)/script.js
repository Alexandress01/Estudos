// Exercícios de Arrays e Objetos em JavaScript
let nomes = ['Alexandre', 'Ana', 'André', 'Bruno', 'Carlos'];

// Acessando o primeiro e o último elemento do array
console.log(nomes[0]);
console.log(nomes[4]);

let numeros = [1, 20, 15, 30, 5, 7, 10];

// Imprimindo o tamanho do array e todos os seus elementos usando um loop for
console.log(numeros.length);
for (let numero = 0; numero < numeros.length; numero++) {
    console.log(numeros[numero]);
}

let pessoa = {
    nome: 'Aleki',
    idade: 16,
    cidade: 'Lauro de Freitas',
    profissao: 'Programador (Amém 😎🙏?)'
};

// Acessando e imprimindo as propriedades do objeto pessoa
console.log(pessoa.nome);
console.log(pessoa.idade);
console.log(pessoa.cidade);
console.log(pessoa.profissao);

let livro = {
    titulo: 'Mindset',
    autor: 'Carol S. Dweck',
    descricao() {
        return `O livro ${this.titulo} foi escrito por ${this.autor}.`;
    }
}

console.log(livro.descricao());

let produtos = [
    produto1 = {nome: 'Nescau', preco: 12, categoria: 'Achocolatados'},
    produto2 = {nome: 'Escova de Dentes Colgate', preco: 10.99, categoria: 'Higiene Bucal'},
    produto3 = {nome: 'Peito de Frango Sadia 1kg', preco: 22.90, categoria: 'Carnes e Frios'}
]

// Imprimindo os detalhes de cada produto usando um loop for
for (produto = 0; produto < produtos.length; produto++) {
    console.log(`Produto: ${produtos[produto].nome} | Preço: R$${produtos[produto].preco} | Categoria: ${produtos[produto].categoria}`);
}