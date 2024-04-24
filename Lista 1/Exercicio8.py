numero = int(input("Digite um número: "))

print("Tabuada de", numero, ":")

for i in range(101):
    resultado = numero * i
    print(numero, "x", i, "=", resultado)
