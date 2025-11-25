// Exercícios de manipulação do DOM
// Selecionando os elementos
const button = document.querySelector('button');
const titulo1 = document.querySelector('h1');
const paragrafo = document.querySelector('p');
const body = document.querySelector('body');

// Variável para controlar o estado
let mudou = false;

// Adicionando o evento de clique ao botão
button.onclick = function() {
    // Toggle para mudar o estado
    mudou = !mudou;
    // Alterando os estilos e o texto com base no estado
    if (!mudou) {
        titulo1.style.color = 'blue';
        paragrafo.textContent = 'O texto foi alterado 😎🔥!';
        body.style.backgroundColor = '#04032b';
    } else {
        titulo1.style.color = 'aliceblue';
        paragrafo.textContent = 'Clique no botão para mudar o texto!';
        body.style.backgroundColor = 'black';
    }
}