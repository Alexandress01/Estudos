// Aula 10 - Eventos DOM em JavaScript
let area = document.getElementById('area')

// Adiciona ouvintes de eventos para clique, mouse entrar e mouse sair
area.addEventListener('click', clicar)
area.addEventListener('mouseenter', entrar)
area.addEventListener('mouseout', sair)

// Define as funções de manipulação de eventos para cada evento
function clicar() {
    area.innerText = 'Clicou!'
    area.style.backgroundColor = 'red'
}

function entrar() {
    area.innerText = 'Entrou!'
}

function sair() {
    area.innerText = 'Saiu!'
    area.style.backgroundColor = 'green'
}