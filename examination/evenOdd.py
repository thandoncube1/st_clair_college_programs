# 13 A. Write a python program that checks if a given number is a even  or not
# Get number as input
# number: float = float(input("Enter a number: "))
import random

randomNumber: str = str(random.randint(1, 100))
name = "thando"
formatName = name[0].capitalize()
print(formatName + randomNumber)
# # Check if number is even
# isEven: bool = number % 2 == 0
# isOdd: bool = number % 2 == 1
# # test each condition
# if isEven:
#     # display the result of even number
#     print(f"{number} is even".format(number))
# elif isOdd:
#     # display the result of odd number
#     print(f"{number} is odd".format(number))
# else:
#     # display the result of neither
#     print(f"{number} is neither even or odd".format(number))