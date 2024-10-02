print("""
    Welcome to the Addition program
    'exit' to stop the loop.
""")

choice = "Y"
total = 0
while choice != exit:
    userInput = int(input("Enter a number: "))
    total += userInput
    print(f"The sum of {total} and {userInput} = {total}")
    choice = input("Would you like to continue adding: (Y) or 'exit' ")
    if (choice == "N"):
      break