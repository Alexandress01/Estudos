// Exercícios de funções em JavaScript
function saudar() {
    console.log('Olá, Aleki! Bem-vindo de volta ao JavaScript 😎');
}

function dobrar(numero) {
    return numero * 2;
}

// Testando a função 'dobrar'
let numero = 7;
let resultado = dobrar(numero);
console.log(`O dobro de ${numero} é ${resultado}`);

function media(n1, n2, n3) {
    return (n1 + n2 + n3) / 3
}

// Testando a função 'media'
let resultado_media = media(8, 9.4, 10);
console.log(`A média é: ${resultado_media.toFixed(1)}`);

function verificarIdade(idade) {
    if (idade < 18) {
        console.log('Menor de idade 😅')
    }
    else {
        console.log('Maior de idade 🔥')
    }
}

// Função que gera uma senha aleatória de 8 caracteres
function gerarSenha() {
    return Math.random().toString(36).slice(-8);
}

// Testando a função 'gerarSenha'
let senha = gerarSenha();
console.log(`Senha gerada: ${senha}`);

// Chamando as funções
saudar()
verificarIdade(16)
gerarSenha()