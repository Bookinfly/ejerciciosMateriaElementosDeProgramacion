def main():
    kw_value = 10
    taxes = 1.22
    kw_new = float(input("Cuantos Kw marca el medidor: "))
    value = ( kw_new * kw_value ) * taxes
    print("Esté mes el valor es: ", value)


if __name__ == "__main__":
    main()