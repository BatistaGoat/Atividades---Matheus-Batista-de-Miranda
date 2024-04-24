numeros = []

print("Digite 5 números do tipo ponto flutuante:")

for i in range(5):
    numero = float(input(f"Número {i + 1}: "))
    numeros.append(numero)

maior_numero = max(numeros)
print("O maior número informado é:", maior_numero)
