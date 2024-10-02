# get the limit
n: int = int(input("Enter the limit you want to enter: "))
myList: list = list()

for number in range(n):
    num: int = int(input("Enter the list of numbers: "))
    myList.append(num)

reversedList: list = list()
for number in enumerate(myList):
    reversedList.append(myList)

print(reversedList)    