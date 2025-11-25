// Async e Await em JavaScript
// Permite escrever código assíncrono de forma síncrona. Async faz uma função retornar uma promise. Await faz uma função assíncrona esperar por uma promise. Async não tem parâmetros de resolver ou rejeitar. Tudo após Await é colocado numa fila de eventos

// Tarefas em ordem
function passearComCachorro() {
    return new Promise((resolver, rejeitar) => {
        setTimeout(() => {

            let passeou = true;

            if (passeou) {
                resolver('Você levou o cachorro para passear 🐕');
            } else {
                rejeitar('você não passeou com o cachorro');
            }
        }, 1000);
    })
}

function limparCozinha() {
    return new Promise((resolver, rejeitar) => {
        setTimeout(() => {

            limpou = false;

            if (limpou) {
                resolver('Você limpou a cozinha 🧹');
            } else {
                rejeitar('você não limpou a cozinha');
            }
        }, 2000);
    });
}

function tirarLixo() {
    return new Promise((resolver, rejeitar) => {
        setTimeout(() => {

            let tirou = true;

            if (tirou) {
                resolver('Você tirou o lixo ♻️');
            } else {
                rejeitar('você não tirou o lixo');
            }
        }, 1000);
    })
}

// Função de sincronização 'fazerTarefas', que chama todas as outras
async function fazerTarefas() {
    try {
        let passear = await passearComCachorro();
        console.log(passear);

        let limpar = await limparCozinha();
        console.log(limpar);

        let tirar = await tirarLixo();
        console.log(tirar);

        console.log('Você terminou todas as tarefas!')
    } catch (erro) {
        console.error(`Sua mãe te bateu porque ${erro}`);
    }
}

fazerTarefas();