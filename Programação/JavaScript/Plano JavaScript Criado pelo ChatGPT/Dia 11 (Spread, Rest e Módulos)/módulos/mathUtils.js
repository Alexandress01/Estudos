// Exercícios de Default Parameters e Módulos em JavaScript
// Módulos com funções matemáticas que serão exportadas para 'script.js' 

export const PI = 3.14159;

export const raizQuadrada = num => num * num;

export function calcularIMC(peso, altura) {
    imc = peso / (altura * altura)
    console.log(`Seu peso é ${peso}, sua altura é ${altura} e seu IMC é ${imc.toFixed(2)}`)
}