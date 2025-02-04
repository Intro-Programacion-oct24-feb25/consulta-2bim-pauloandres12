def factor(a):
    if a == 0 or a == 1:
        return 1
    else:
        numero = a * factor(a - 1)
        return numero

def main():
    numero = 5
    numero2 = factor(numero)

    print(f"El factorial de {numero} es: {numero2}")

if __name__ == "__main__":
    main()