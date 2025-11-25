// Aula 12 - Condições em JavaScript
let agora = new Date() // Cria um objeto Date com a data e hora atuais
let hora = agora.getHours() // Obtém a hora atual (0-23)

console.log(`Agora são exatamente ${hora} horas.`)

if (hora > 0 && hora < 6) { // Madrugada
    console.log('Boa Madrugada!')
} else if (hora < 12) { // Manhã
    console.log('Bom Dia!')
} else if (hora <= 18) { // Tarde
    console.log('Boa Tarde!')
} else { // Noite
    console.log('Boa Noite!')
}