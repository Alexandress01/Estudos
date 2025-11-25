// Mais exercícios de objetos
let pessoinha = {
    nome: 'Aleki',
    idade: 16,
    cidade: 'Lauro de Freitas'
}

// Imprimindo uma frase usando as propriedades do objeto pessoa
console.log(`${pessoinha.nome} tem ${pessoinha.idade} anos e mora em ${pessoinha.cidade}`);

// Atualizando as propriedades do objeto pessoa
pessoinha.profissao = 'Programador';
pessoinha.idade = 17;

console.log(pessoinha);

let livroBrabo = {
    titulo: 'O homem mais rico da Babilônia',
    autor: 'George S. Clason',
    descricao() {
        return `O livro ${this.titulo} foi escrito por ${this.autor}.`
    }
}

console.log(livroBrabo.descricao());

let produtoss = [
    { nome: 'Notebook Lenovo Ideapad 3', preco: 2500, categoria: 'Informática' },
    { nome: 'Smartphone Samsung Galaxy A32', preco: 1500, categoria: 'Telefonia' },
    { nome: 'Smart TV LG 43" 4K', preco: 2000, categoria: 'Eletrônicos' }
]

// Imprimindo os detalhes de cada produto usando um loop for
for (let produto of produtoss) {
    console.log(`Produto: ${produto.nome} | Preço: R$${produto.preco} | Categoria: ${produto.categoria}`);
}

let aluno = {
    nome: 'Alexandre',
    notas: [10, 9.4, 10],
    media() {
        let soma = 0;
        for (nota of this.notas) {
            soma += nota
        }
        return soma / this.notas.length
    }
}

// Imprimindo a média do aluno
console.log(`A média do aluno ${aluno.nome} é ${aluno.media().toFixed(1)}`)