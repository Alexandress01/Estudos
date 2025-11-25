// Aula 14 - Laços de Repetição em JavaScript
function contar() {
  // Pegando os valores dos campos de entrada
  const inicio = document.getElementById('txtinicio')
  const fim = document.getElementById('txtfim')
  const passo = document.getElementById('txtpasso')
  const resultado = document.getElementById('resultado')

  // Verifica se algum campo está vazio
  if (inicio.value.length == 0 || fim.value.length == 0 || passo.value.length == 0) {
    alert('[ERRO] Faltam dados!')
    resultado.innerHTML = 'Impossível contar!'
  } else {
    resultado.innerHTML = 'Contando: <br>'

    let i = Number(inicio.value)
    let f = Number(fim.value)
    let p = Number(passo.value)

    // Verifica se o passo é menor ou igual a zero
    if (p <= 0) { 
      p = 1
      alert('Passo inválido! Considerando PASSO 1')
    }

    // Realiza a contagem com base nos valores fornecidos
    if (i < f) {
      // Contagem crescente
      for (let c = i; c <= f; c += p) {
        resultado.innerHTML += ` ${c} \u{1F449}`
      }
    } else {
      // Contagem decrescente
      for (c = i; c >= f; c -= p) {
        resultado.innerHTML += ` ${c} \u{1F449}`
      }
    }
    resultado.innerHTML += `\u{1F3C1}`
  }
}