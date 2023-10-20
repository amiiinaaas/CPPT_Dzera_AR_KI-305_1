class Computer:
    def __init__(self, brand, processor, ram):
        self.brand = brand
        self.processor = processor
        self.ram = ram

    def display_info(self):
        print(f"Brand: {self.brand}")
        print(f"Processor: {self.processor}")
        print(f"RAM: {self.ram}GB")

    def update_specs(self, processor=None, ram=None):
        if processor:
            self.processor = processor
        if ram:
            self.ram = ram