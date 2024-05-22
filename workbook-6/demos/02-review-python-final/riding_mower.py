from vehicle import Vehicle
from power_tool import PowerTool

class RidingMower(Vehicle,PowerTool):
    
    def __init__(self, make, model):
        Vehicle.__init__(self, make, model)
        PowerTool.__init__(self)
        print("Bulding a new Riding Mower")
        
    def repair(self):
        Vehicle.repair(self)
        PowerTool.repair(self)
