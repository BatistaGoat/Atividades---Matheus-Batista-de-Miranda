numeros_pares = 0

print("Digite 10 números inteiros:")

for i in range(10):
    numero = int(input(f"Número {i + 1}: "))
    if numero % 2 == 0:
        numeros_pares += 1

print("Quantidade de números pares:", numeros_pares)
