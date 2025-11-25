// Aula 16 - Funções em JavaScript
// Exercício 18 - Adicionar números em uma lista e mostrar estatísticas
let res = document.getElementById('resultado')
let nums = [] // Array para armazenar os números adicionados

function adicionarNum() {
    const txtNum = document.getElementById('txtnum')
    const txtSelNum = document.getElementById('selnum')
    let num = Number(txtNum.value)
    let select = Number(txtSelNum.value)

    res.innerHTML = '' // Limpa o resultado anterior

    if (num >= 1 && num <= 100 && !nums.includes(num)) {
        res.innerHTML = ''
        const opcao = document.createElement('option');
        opcao.text = `Valor ${num} adicionado.`
        txtSelNum.appendChild(opcao)
        nums.push(num)
    } else {
        alert('Valor inválido ou já encontrado na lista')
    }
    txtNum.value = '' // Limpa o input
    txtNum.focus() // Foca novamente no input
}

function mostrarRes() {
    if (nums.length >= 1) {
        let maior = Math.max(...nums) // Encontra o maior número
        let menor = Math.min(...nums) // Encontra o menor número
        let soma = 0
        let media = 0

        // Calcula a soma dos números
        for (num of nums) {
            soma += num
        }
        
        // Calcula a média dos números
        media = soma / nums.length

        // Exibe os resultados no div de resultado
        res.innerHTML = `<p>Ao todo, temos ${nums.length} numeros cadastrados.</p>`
        res.innerHTML += `<p>O maior valor informado foi ${maior}</p>`
        res.innerHTML += `<p>O menor valor informado foi ${menor}</p>`
        res.innerHTML += `<p>Somando todos os valores, temos ${soma}</p>`
        res.innerHTML += `<p>A média dos valores digitados é ${media.toFixed(2)}</p>`
    } else {
        alert('Adicione valores antes de finalizar!')
    }
}