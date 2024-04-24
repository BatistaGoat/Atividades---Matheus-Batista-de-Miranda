def fatorial(n):
    if n == 0:
        return 1
    else:
        return n * fatorial(n - 1)

numero = int(input("Digite um número para calcular o fatorial: "))

resultado = fatorial(numero)

print(f"{numero}! = {resultado}")
