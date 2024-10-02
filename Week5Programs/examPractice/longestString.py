countries: list = list()
currentValue = True or False
while (currentValue):
    stdIO = str(input("Write a country or [F] to exit: ")).capitalize()
    if stdIO == "F": 
        currentValue = False
    else:
        countries.append(stdIO)

myList: list = list()
prev = ""
for country in countries:
    if (len(country) > len(prev)):
        myList.append(country)
    else:
        prev = country

if (len(countries) > 0):
    print(myList[-1])