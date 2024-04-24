soma = 0

print("Digite 10 números inteiros:")
for i in range(10):
    numero = int(input(f"Número {i + 1}: "))
    soma += numero

print("A soma dos números é:", soma)
