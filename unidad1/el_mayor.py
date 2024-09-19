def main():
    num_1 = float(input("Dame un numeito: "))
numeros = []

for i in range(3):
    numero = int(input("Dame un numeito: "))
    numeros.append(numero)

# Inicializar el máximo como el primer número
maximo = numeros[0]

# Comparar con los otros números y encontrar el máximo
for numero in numeros:
    if numero > maximo:
        maximo = numero

print("El número mayor es:", maximo)

if __name__ == "__main__":
    main()