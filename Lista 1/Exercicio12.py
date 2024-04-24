total_pessoas = 25
pessoas_mais_de_50_anos = 0
soma_alturas_entre_10_e_20_anos = 0
total_pessoas_entre_10_e_20_anos = 0
pessoas_com_peso_inferior_a_40_quilos = 0

print("Informe a idade, a altura (em metros) e o peso (em kg) de 25 pessoas:")

for i in range(total_pessoas):
    print("Pessoa", i + 1, ":")
    idade = int(input("Idade: "))
    altura = float(input("Altura (em metros): "))
    peso = float(input("Peso (em kg): "))

    if idade > 50:
        pessoas_mais_de_50_anos += 1

    if 10 <= idade <= 20:
        total_pessoas_entre_10_e_20_anos += 1
        soma_alturas_entre_10_e_20_anos += altura

    if peso < 40:
        pessoas_com_peso_inferior_a_40_quilos += 1

media_alturas_entre_10_e_20_anos = soma_alturas_entre_10_e_20_anos / total_pessoas_entre_10_e_20_anos if total_pessoas_entre_10_e_20_anos > 0 else 0
porcentagem_peso_inferior_a_40_quilos = (pessoas_com_peso_inferior_a_40_quilos / total_pessoas) * 100

print("a) Quantidade de pessoas com idade superior a 50 anos:", pessoas_mais_de_50_anos)
print("b) Média das alturas das pessoas com idade entre 10 e 20 anos:", media_alturas_entre_10_e_20_anos, "metros")
print("c) Porcentagem de pessoas com peso inferior a 40 quilos:", porcentagem_peso_inferior_a_40_quilos, "%")
