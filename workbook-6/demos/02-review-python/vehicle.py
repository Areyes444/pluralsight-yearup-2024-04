class Vehicle:
    # no such thing as private
    make = ""
    model = ""
    isOn = False
    
    # constructor
    def __init__(self, make, model):
        self.make = make
        self.model = model
        print(f"building a new {make} {model} - (Vehicle constructor)")

    # methods
    def turnOn(self):
        self.isOn = True
        
    def turnOff(self):
        self.isOn = False
    
    def repair(self):
        print(f"repairing {self.make} {self.model} (code inside Vehicle super class)")
        