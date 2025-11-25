// Exercício de manipulação do DOM - Adicionar e remover itens de uma lista
// Pegando os elementos do HTML
const botaoAdd = document.getElementById('botao-add');
const botaoDel = document.getElementById('botao-del');
const ul = document.querySelector('ul');

// Função pra adicionar um novo item na lista
botaoAdd.onclick = function() {
    let atualDeItens = document.querySelectorAll('li').length;
    let novoItem = document.createElement('li');
    novoItem.textContent = `Novo item ${atualDeItens + 1}`;
    ul.appendChild(novoItem);
}

// Função pra remover o último item da lista
botaoDel.onclick = function() {
    // Verifica se há itens na lista antes de tentar remover
    if (ul.lastElementChild) {
        ul.lastElementChild.remove();
    } else {le
        alert('Não há mais itens pra remover 😅');
    }
}