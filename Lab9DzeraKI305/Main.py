from Computer import Computer
from Laptop import Laptop


def main():
    computer = Computer("HP", "Intel Core i5", 8)
    laptop1 = Laptop("Dell", "Intel Core i7", 16, 10)
    laptop2 = Laptop("Lenovo", "AMD Ryzen 5", 12, 8)

    print("Computer Info:")
    computer.display_info()

    print("\nLaptop 1 Info:")
    laptop1.display_info()

    print("\nLaptop 2 Info:")
    laptop2.display_info()

    print("\nUpdating Laptop 1 specs...")
    laptop1.update_specs(processor="Intel Core i9", ram=32, battery_life=12)
    laptop1.display_info()

    print("\nComparing Laptop 1 and Laptop 2 specs...")
    if laptop1.compare_specs(laptop2):
        print("Laptop 1 and Laptop 2 have the same processor and RAM.")
    else:
        print("Laptop 1 and Laptop 2 have different processor or RAM.")


if __name__ == "__main__":
    main()
