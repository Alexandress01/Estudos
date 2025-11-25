// Aula 16 - Funções em JavaScript
function fatorial(num) { // num! = num x num x num x num x num
    let fat = 1

    for (let c = num; c > 1; c--) { // loop que vai do número recebido até 2
        fat *= c // multiplica o acumulador pelo contador
    }
    return fat
}

console.log(fatorial(5))