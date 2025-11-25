// Aula 09 - Manipulando elementos do DOM
// Selecionando elementos e alterando estilos e conteúdo através de variáveis
let corpo = document.body
let p1 = document.getElementsByTagName('p')[0]

/*
let div = document.getElementById('msg')

div.style.background = 'blue'
div.innerText = 'Estou aguardando...'
*/

// Usando querySelector para selecionar elementos
// Id -> # Classe -> .
let div = document.querySelector('div#msg')

div.style.backgroundColor = 'blue'
div.innerText = 'Estou aguardando...'