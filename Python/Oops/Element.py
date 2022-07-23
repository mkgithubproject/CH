#activity 1
class Atom:#Atom class
    # constructor
    def __init__(self,name,electrons,protons,neutrons,electron_config):
        self.name=name;
        self.electrons=electrons;
        self.protons=protons;
        self.neutrons=neutrons;
        self.electron_config=electron_config;
    def calculate_atomic_mass(self):#calculate_atomic_mass function defined
        return self.protons+self.neutrons
    def calculate_charge(self):# calculate_charge function defined
        net_charge=self.protons-self.electrons
        return net_charge
#activity 3
class Element(Atom):
    def __init__(self,name,electrons,protons,neutrons,electron_config,mass,volume,boling_point,melting_point):
        super().__init__(name,electrons,protons,neutrons,electron_config)# call parent class constructor
        self.mass=mass
        self.volume=volume
        self.boling_point=boling_point
        self.melting_point=melting_point
        

#activity 2
atom=Element("Aluminium",10,13,14,[2,8],10800,4,2743,933.5)# created object of Atom class 
print("Atomic mass:",atom.calculate_atomic_mass())# call function calculate_atomic_mass

#calculate net_charge
net_charge=atom.calculate_charge()
if net_charge>0:# if net_charge is greater than zero means atom is cation
    print("Atom is an","cation and net charge is",net_charge)
elif net_charge==0:#if zero means atom is neutral
        print("Atom is an","neutral and net charge is",net_charge)
else:# else atom is anion
     print("Atom is an","anion and net charge is",net_charge)

    
