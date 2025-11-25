// Aula 12 - Condições em JavaScript
// Função para verificar idade e gênero e exibir imagem correspondente
function verificar() {
    const formAno = document.getElementById('txtano')
    const resultado = document.getElementById('resultado')
    let data = new Date() // Objeto Date com a data atual
    let ano = data.getFullYear() // Obtém o ano atual

    if (formAno.value.length == 0 || Number(formAno.value) > ano) { // Validação do campo de entrada (se está vazio ou maior que o ano atual)
        alert('[ERRO] Verifique os dados e tente novamente!')
    } else {
        const FormSexo = document.getElementsByName('radsex')
        let genero = ''
        let img = document.createElement('img')
        let idade = ano - Number(formAno.value) // Calcula a idade com base no ano de nascimento
        img.setAttribute('id', 'foto')

        if (FormSexo[0].checked) { // Verifica se o primeiro rádio (masculino) está selecionado
            genero = 'Homem'

            if (idade >= 0 && idade < 16) {
                // Criança
                img.setAttribute('src', 'bebe-homem.png')
            } else if (idade >= 10 && idade <= 30) {
                // Jovem
                img.setAttribute('src', 'jovem-homem.png')
            } else if (idade < 50) {
                // Adulto
                img.setAttribute('src', 'adulto-homem.png')
            } else {
                // Idoso
                img.setAttribute('src', 'idoso-homem.png')
            }
        } else { // Caso contrário, o segundo rádio (feminino) está selecionado
            genero = 'Mulher'

            if (idade >= 0 && idade < 16) {
                // Criança
                img.setAttribute('src', 'bebe-mulher.png')
            } else if (idade >= 10 && idade <= 30) {
                // Jovem
                img.setAttribute('src', 'jovem-mulher.png')
            } else if (idade < 50) {
                // Adulta
                img.setAttribute('src', 'adulto-mulher.png')
            } else {
                // Idosa
                img.setAttribute('src', 'idoso-mulher.png')
            }
        }

        // Mostrando o resultado
        resultado.style.textAlign = 'center'
        resultado.innerHTML = `Detectamos ${genero} com ${idade} anos`
        resultado.appendChild(img)
    }
}