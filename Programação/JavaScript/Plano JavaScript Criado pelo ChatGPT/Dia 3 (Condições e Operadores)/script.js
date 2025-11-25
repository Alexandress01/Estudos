// Operadores lógicos
let a = true;
let b = false;

console.log("a AND b:", a && b); // false
console.log("a OR b:", a || b); // true
console.log("NOT a:", !a); // false
console.log("NOT b:", !b); // true

// Operadores de comparação
let x = 10;
let y = "10";

console.log("x == y:", x == y); // true (igualdade de valor)
console.log("x === y:", x === y); // false (igualdade de valor e tipo)
console.log("x != y:", x != y); // false (diferença de valor)
console.log("x !== y:", x !== y); // true (diferença de valor ou tipo)
console.log("x >= 10:", x >= 10); // true
console.log("x <= 10:", x <= 10); // true
console.log("x > 5:", x > y); // true
console.log("x < 5:", x < y); // false

console.log("Script executado com sucesso!");

// Declaração de variáveis
let idade = 16;
let nota = 9.5;
const usuario = prompt("Digite seu usuário:");
const senha = prompt("Digite sua senha:");

// Estrutura condicional simples
if (idade >= 18) {
  console.log("Você é maior de idade. Vá trabalhar 😡!");
} else {
  console.log("Você é menor de idade. Vá estudar mlk 😎!");
}

// Estrutura condicional composta
if (nota >= 9) {
  console.log("Excelente!");
} else if (nota >= 6 && nota < 9) {
  console.log("Aprovado.");
} else {
  console.log("Reprovado, seu burro 😡.");
}

// Verificação de login
if (usuario === "Aleki" && senha === "1234") {
  alert("Login bem-sucedido");
} else {
  alert("Usuário ou senha incorretos.");
}