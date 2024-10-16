longestWord = ""
def checkIfLongestWord(previous, current):
        # Format string
        current.rstrip().lstrip()
        if len(previous) < len(current):
            previous = current
            print(f"{userIO} is the longest")
        else:
             print(f"{previous} is the longest")

while True:
    userIO = str(input("Enter a word: ")).lower()
    # check the length of string
    if userIO == "n":
        print("Thank you for playing.")
        break
    checkIfLongestWord(longestWord, userIO)

