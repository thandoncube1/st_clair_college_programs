# Author: Thando Ncube
# StudentID: 0875297
# Assignment 5 _ Question 1
"""
1. Write a Python program that takes two strings as input from the user. Then print a new list with the common characters regardless of their case in both strings. All characters in the list must be in uppercase and it should be sorted in ascending order.
    Note: If you have duplicate characters show it once in your output list. Your input & output must be formatted as shown in below sample input and output.
"""
def common_characters(word1: str, word2: str) -> list[str]:
    """
    :description - This is a function taking two arguments to return \
    a list of common letters in both strings
    :param - str - A word from input
    :param - str - Another word from input  
    """
    # create a common character list
    common_char_list = []
    # get the length of the word
    for i in range(len(word1)):
        # check if the letter is in word
        if word1[i] in word2:
            # append the letter if its in word2
            common_char_list.append(word1[i].upper())
    # return the common character list
    return sorted(list(set(common_char_list)))

first_word = str(input("Enter a word: ")).lower()
second_word = str(input("Enter another word: ")).lower()
print(common_characters(first_word, second_word))

     