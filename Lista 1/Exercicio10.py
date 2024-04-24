def verificar_primo(n):
    if n <= 1:
        return False
    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            return False
    return True

numero = int(input("Digite um número para verificar se é primo: "))

if verificar_primo(numero):
    print(numero, "é primo.")
else:
    print(numero, "não é primo.")
