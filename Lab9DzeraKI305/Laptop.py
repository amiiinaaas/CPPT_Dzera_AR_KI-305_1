from Computer import Computer

class Laptop(Computer):
    def __init__(self, brand, processor, ram, battery_life):
        super().__init__(brand, processor, ram)
        self.battery_life = battery_life

    def display_info(self):
        super().display_info()
        print(f"Battery Life: {self.battery_life} hours")

    def update_specs(self, processor=None, ram=None, battery_life=None):
        super().update_specs(processor, ram)
        if battery_life:
            self.battery_life = battery_life

    def compare_specs(self, other_laptop):
        if self.processor == other_laptop.processor and self.ram == other_laptop.ram:
            return True
        else:
            return False