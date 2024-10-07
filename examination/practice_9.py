# Write a program that takes n numbers
n: int = int(input("Enter the limit number: "))
# Collections of entered numbers
numbers: list = list()
# Enter a list of numbers
for i in range(n):
    number: int = int(input("Enter a number: "))
    numbers.append(number)
# Create a reversed list
reverseNumbers: list = list()
# Reverse the list if numbers
for i, number in enumerate(numbers):
    reverseNumbers.insert(0, number)
# Display the reversed list
for i, number in enumerate(reverseNumbers):
    print(i, number)

