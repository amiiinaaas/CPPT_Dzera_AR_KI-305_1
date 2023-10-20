try:
    size = int(input("Enter matrix size: "))
    if size < 3:
        print("Invalid matrix size. Size should be greater than or equal to 3.")
        size = int(input("Enter valid matrix size: "))

    while True:
        filler = input("Enter fill character: ")
        if len(filler) == 1:
            break  # Виходимо з циклу, якщо введено лише один символ
        elif len(filler) == 0:
            print("Fill character cannot be empty. Please enter a single character.")
        else:
            print("Invalid input. Please enter only one character for fill character.")

    matrix = [['\t' for _ in range(i + 1)] if i < size // 2 else ['\t' for _ in range(size - i)] for i in range(size)]
    for i in range(size):
        for j in range(len(matrix[i])):
            matrix[i][j] = filler

    # виведення матриці на екран
    for row in matrix:
        print("\t".join(row))

    # запис матриці в файл 'MyFile.txt'
    with open('MyFile.txt', 'w') as file:
        for row in matrix:
            file.write("\t".join(row) + "\n")

    print("Matrix was written to file 'MyFile.txt'")

except Exception as e:
    print("An error occurred:", str(e))

def is_jagged_array(arr):
    # Перевіряємо довжину першого підмасиву
    base_length = len(arr[0])

    # Перевіряємо довжину кожного підмасиву
    for sub_array in arr[1:]:
        if len(sub_array) != base_length:
            return True  # Якщо довжини не співпадають, масив є зубчастим
    return False  # Якщо всі підмасиви мають однакову
