// Aula 12 - Condições em JavaScript
// Função para carregar a imagem e mensagem de acordo com a hora do dia
function carregar() {
    let msg = document.getElementById('msg')
    let img = document.getElementById('imagem')
    let data = new Date() // Objeto Date com a data e hora atuais
    let hora = data.getHours() // Obtém a hora atual (0-23)
    msg.innerHTML = `Agora são ${hora} horas.`

    if (hora >= 0 && hora < 12) {
        // BOM DIA!
        img.src = 'foto-manha.png'
        document.body.style.background = '#beb371ff'
    } else if (hora <= 18) {
        // BOA TARDE!
        img.src = 'foto-tarde.png'
        document.body.style.background = '#7a5635ff'
    } else {
        // BOA NOITE
        img.src = 'foto-noite.png'
        document.body.style.background = '#32353aff'
    }
}