pessoas_mais_de_90kg = 0
soma_idades = 0

print("Informe a idade e o peso de sete pessoas:")

for i in range(7):
    print("Pessoa", i + 1, ":")
    idade = int(input("Idade: "))
    soma_idades += idade

    peso = float(input("Peso (em kg): "))
    if peso > 90:
        pessoas_mais_de_90kg += 1

media_idades = soma_idades / 7

print("Quantidade de pessoas com mais de 90kg:", pessoas_mais_de_90kg)
print("Média das idades das sete pessoas:", media_idades)
