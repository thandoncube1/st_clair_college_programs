userInput = int(input("Enter a number to loop: "))

for value in range(userInput):
    userInput -= value 
    print(userInput)