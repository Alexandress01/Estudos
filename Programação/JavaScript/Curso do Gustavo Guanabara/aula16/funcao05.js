// Aula 16 - Funçõoes em JavaScript
function fatorial(n) { // RECURSIVIDADE
    if (n == 1) { 
        return 1
    } else {
        return n * fatorial(n - 1) // chamada da própria função
    }
}

console.log(fatorial(5))

/*

5! = 5 x 4 x 3 x 2 x 1
5! = 5 x 4!

n! = n x (n - 1)!
1! = 1

*/