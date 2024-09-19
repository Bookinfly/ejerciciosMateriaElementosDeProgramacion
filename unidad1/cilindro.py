def main():
    pi_value = 3.14159
    alt = float(input("Dime la altura del cilindro: "))
    rad = float(input("Dime el radio de la base del cilindro: "))
    area = (rad ** 2) * pi_value
    vol = area * alt
    print("El volumen del cilindro es:", vol)

if __name__ == "__main__":
    main()
