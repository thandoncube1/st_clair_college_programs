# Author: Thando Ncube
# StudentID: 0875297
# Assignment 5 _ Question 2
"""
2. An anagram is a play on words created by rearranging the letters of the original word to make a new word or phrase. So, we can say two words are anagrams if they contain all the same letters but in a different order.
    Write a Python program that takes two strings from the user and tells if the given strings are anagrams or not.
    Note: Your input & output must be formatted as shown in below sample input and output.
"""
def anagram(word1: str, word2: str) -> str:
    """
    :description - This is a function taking two arguments to return \
        a string with the value 'word 1 & word 2 is an anagram' or 'word 1 \
        & word 2 is not an anagram. After taking input from the user
    :param - str - A word from input
    :param - str - Another word from input  
    """
    # Return if words are not the same length
    if len(word1) != len(word2):
        return f"{word1} & {word2} are not anagrams!"
    # Initialize the 2 pointer i and j
    i = 0
    # Run the loop till pointers meet
    while i < len(word1):
        if word1[i] in word2:
            # increment the loop
            i += 1
        else:
            return f"{word1} & {word2} are not anagrams!"
    return f"{word1} & {word2} are anagrams!"

print(f'{"PLAY ANAGRAM!":^30}')
print("="*30)
word_one = str(input("Enter word 1: ")).lower()
print(word_one)
word_two = str(input("Enter word 2: ")).lower()
print(word_two)
print("="*30)
print(anagram(word_one, word_two))
print("="*30)