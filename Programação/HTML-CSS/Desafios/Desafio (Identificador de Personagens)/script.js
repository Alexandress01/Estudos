// Desafio de Jefferson - Criar um site que recebe o nome de um personagem de anime/mangá e retorna as informações básicas: idade, poder, anime etc.

// Lista dos personagens com as informações (Luffy, Midoriya, Light, Eren, Itadori)
let personagens = [
    { nome: ['Luffy'.toUpperCase(), 'Monkey D. Luffy'.toUpperCase(), 'Monkey D Luffy'.toUpperCase()], idade: 19, habilidade: 'Gomu Gomu no Mi', anime: 'One Piece', imagem: 'images/monkey-d-luffy.jpg', titulo: 'Rei dos Piratas' },
    { nome: ['Midoriya'.toUpperCase(), 'Izuku Midoriya'.toUpperCase(), 'Deku'.toUpperCase()], idade: 15, habilidade: 'One For All', anime: 'My Hero Academia', imagem: 'images/izuku-midoriya.jpg', titulo: 'Herói Número 1' },
    { nome: ['Light'.toUpperCase(), 'Light Yagami'.toUpperCase(), 'Kira'.toUpperCase()], idade: 17, habilidade: 'Death Note', anime: 'Death Note', imagem: 'images/light-yagami.png', titulo: 'Deus do Novo Mundo' },
    { nome: ['Eren'.toUpperCase(), 'Eren Yeager'.toUpperCase()], idade: 15, habilidade: 'Titã de Ataque', anime: 'Attack on Titan', imagem: 'images/eren-yeager.jpg', titulo: 'Salvador da Humanidade' },
    { nome: ['Itadori'.toUpperCase(), 'Itadori Yuji'.toUpperCase(), 'Yuji Itadori'.toUpperCase(), 'Yuji'.toUpperCase()], idade: 15, habilidade: 'Kokusen', anime: 'Jujutsu Kaisen', imagem: 'images/yuji-itadori.jpg', titulo: 'Portador de Sukuna' }
]

// Função pra pesquisar o personagem e exibir as informações
function pesquisar() {
    const txtName = document.getElementById('txtname'); // Input de texto
    let name = String(txtName.value); // Valor do input pra string
    let resposta = document.getElementById('resposta'); // Div da resposta

    resposta.innerHTML = ''; // Limpa a resposta anterior
    txtName.value = ''; // Limpa o campo de input
    txtName.focus(); // Foca de novo no campo de input

    // Verifica se o nome corresponde a algum personagem e exibe as informações
    // Luffy:
    if (personagens[0].nome.includes(name.toUpperCase())) {
        resposta.innerHTML = `<h2>${personagens[0].nome[1]}</h2>
        <img src='${personagens[0].imagem}' alt='foto do luffy' width='200' height='200'>
        <p><strong>Idade:</strong> ${personagens[0].idade}</p>
        <p><strong>Habilidade:</strong> ${personagens[0].habilidade}</p>
        <p><strong>Anime:</strong> ${personagens[0].anime}</p>
        <p><strong>Título:</strong> ${personagens[0].titulo}</p>`
        // Midoriya:
    } else if (personagens[1].nome.includes(name.toUpperCase())) {
        resposta.innerHTML = `<h2>${personagens[1].nome[1]}</h2>
        <img src='${personagens[1].imagem}' alt='foto do deku' width='200' height='200'>
        <p><strong>Idade:</strong> ${personagens[1].idade}</p>
        <p><strong>Habilidade:</strong> ${personagens[1].habilidade}</p>
        <p><strong>Anime:</strong> ${personagens[1].anime}</p>
        <p><strong>Título:</strong> ${personagens[1].titulo}</p>`
        // Light:
    } else if (personagens[2].nome.includes(name.toUpperCase())) {
        resposta.innerHTML = `<h2>${personagens[2].nome[1]}</h2>
        <img src='${personagens[2].imagem}' alt='foto do light' width='200' height='200'>
        <p><strong>Idade:</strong> ${personagens[2].idade}</p>
        <p><strong>Habilidade:</strong> ${personagens[2].habilidade}</p>
        <p><strong>Anime:</strong> ${personagens[2].anime}</p>
        <p><strong>Título:</strong> ${personagens[2].titulo}</p>`
        // Eren:
    } else if (personagens[3].nome.includes(name.toUpperCase())) {
        resposta.innerHTML = `<h2>${personagens[3].nome[1]}</h2>
        <img src='${personagens[3].imagem}' alt='foto do eren' width='200' height='200'>
        <p><strong>Idade:</strong> ${personagens[3].idade}</p>
        <p><strong>Habilidade:</strong> ${personagens[3].habilidade}</p>
        <p><strong>Anime:</strong> ${personagens[3].anime}</p>
        <p><strong>Título:</strong> ${personagens[3].titulo}</p>`
        // Itadori:
    } else if (personagens[4].nome.includes(name.toUpperCase())) {
        resposta.innerHTML = `<h2>${personagens[4].nome[1]}</h2>
        <img src='${personagens[4].imagem}' alt='foto do itadori' width='200' height='200'>
        <p><strong>Idade:</strong> ${personagens[4].idade}</p>
        <p><strong>Habilidade:</strong> ${personagens[4].habilidade}</p>
        <p><strong>Anime:</strong> ${personagens[4].anime}</p>
        <p><strong>Título:</strong> ${personagens[4].titulo}</p>`
    } else { // Se não encontrar o personagem (não tiver nome na lista)
        alert('Personagem não encontrado! Talvez não esteja na lista. Verifique a ortografia e tente novamente.');
    }
}