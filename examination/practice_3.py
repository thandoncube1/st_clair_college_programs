n = int(input("Enter the length of the list: "))

numbers: list = list()

for i in range(n):
    number = int(input("Enter the number: "))
    numbers.append(number)
print("==\n"*20)
for i, n in enumerate(reversed(numbers)):
    print(f"index: {i}, number: {n}")
