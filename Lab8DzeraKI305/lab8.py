import os
import struct
import sys
import math

# функція для запису результату у текстовий файл
def write_res_txt(file_name, result):
    with open(file_name, 'w') as file:
        file.write(str(result))

# функція для читання результату з текстового файлу
def read_res_txt(file_name):
    result = 0.0
    try:
        if os.path.exists(file_name):
            with open(file_name, 'r') as file:
                result = float(file.read())
        else:
            raise FileNotFoundError(f"File {file_name} not found.")
    except FileNotFoundError as e:
        print(e)
    return result

# функція для запису результату у бінарний файл
def write_res_bin(file_name, result):
    with open(file_name, 'wb') as file:
        packed_result = struct.pack('f', result)
        file.write(packed_result)

# функція для читання результату з бінарного файлу
def read_res_bin(file_name):
    result = 0.0
    try:
        if os.path.exists(file_name):
            with open(file_name, 'rb') as file:
                packed_result = file.read(4)  # читаємо 4 байти (розмір типу float)
                result = struct.unpack('f', packed_result)[0]
        else:
            raise FileNotFoundError(f"File {file_name} not found.")
    except FileNotFoundError as e:
        print(e)
    return result

# функція для обчислення виразу ctg(x) / sin(7x - 1)
def calculate_expression(x):
    try:
        rad = math.radians(x)
        sin_value = math.sin(7 * rad - 1)
        if sin_value == 0:
            raise ZeroDivisionError("Exception reason: sin(7x-1) = 0")
        result = (1.0 / math.tan(rad) / sin_value)
        return result
    except ZeroDivisionError as e:
        raise CalcException(str(e))

# клас для власного виключення CalcException
class CalcException(Exception):
    pass

if __name__ == "__main__":
    try:
        # зчитуємо введене користувачем значення
        data = float(input("Enter X in degrees: "))
        # обчислюємо вираз
        result = calculate_expression(data)
        # виводимо результат
        print(f"Result of ctg(x) / sin(7x - 1) is: {result}")

        # записуємо результат у текстовий та бінарний файли
        write_res_txt("textRes.txt", result)
        write_res_bin("binRes.bin", result)

        # читаємо результат з бінарного файлу та текстового файлу і виводимо їх
        print("Result from binary file: {0}".format(read_res_bin("binRes.bin")))
        print("Result from text file: {0}".format(read_res_txt("textRes.txt")))

    except CalcException as e:
        print(e)
    except FileNotFoundError as e:
        print(e)
        sys.exit(1)