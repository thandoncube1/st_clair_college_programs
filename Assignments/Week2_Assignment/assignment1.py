# Author: Thando Ncube
# Date: September 13, 2024
# Purpose: This program calculates the weighted total of MAD 102 course by taking input for tests

# Taking input for all 3 tests with their respective total marks
test_1 = float(input("Enter the test 1 score (Total - 50): "))
test_1_total = 50
test_2 = float(input("Enter the test 2 score (Total - 74): "))
test_2_total = 74
test_3 = float(input("Enter the test 3 score (Total - 30): "))
test_3_total = 30

# Taking the inpute for all 3 Quizzes with their respective marks
quiz_1 = float(input("Enter the Quiz 1 score (Total - 15): "))
quiz_2 = float(input("Enter the Quiz 2 score (Total - 15: "))
quiz_3 = float(input("Enter the Quiz 3 score (Total - 15): "))
quiz_4 = float(input("Enter the Quiz 4 score (Total - 15): "))
quiz_total = 15

# Taking the inpute for all 3 Assignments with their respective marks out of 20
assignment_1 = float(input("Enter the Assignment 1 score (Out of 30): "))
assignment_total = 30
assignment_2 = float(input("Enter the Assignment 2 score (Out of 35): "))
assignment_total = 35
assignment_3 = float(input("Enter the Assignment 3 score (Out of 37): "))
assignment_total = 37
assignment_4 = float(input("Enter the Assignment 4 score (Out of 35): "))
assignment_total = 35

# Calculating the percentage scores for each test
test_1_percentage = (test_1 / test_1_total) 
test_2_percentage = (test_2 / test_2_total)
test_3_percentage = (test_3 / test_3_total)

# Calculate average percentage score for tests
average_test_percentage = (test_1_percentage + test_2_percentage + test_3_percentage) / 3 

# Calculating the percentage scores for each quiz
quiz_1_percentage = (quiz_1 / quiz_total)
quiz_2_percentage = (quiz_2 / quiz_total)
quiz_3_percentage = (quiz_3 / quiz_total)
quiz_4_percentage = (quiz_4 / quiz_total)

# Calculate average percentage score for quizzes    
average_quiz_percentage = (quiz_1_percentage + quiz_2_percentage + quiz_3_percentage + quiz_4_percentage) / 4 

# Calculating the percentage score for assignments
assignment_1_percentage = (assignment_1 / assignment_total)
assignment_2_percentage = (assignment_2 / assignment_total)
assignment_3_percentage = (assignment_3 / assignment_total)
assignment_4_percentage = (assignment_4 / assignment_total)

# Calculate average percentage score for assignments
average_assignment_percentage = (assignment_1_percentage + assignment_2_percentage + assignment_3_percentage + assignment_4_percentage) / 4

# Calculate the overall percentage of the tests, quizzes, and assignments
overall_percentage = (average_test_percentage + average_quiz_percentage + average_assignment_percentage) / 3 

# Calculating the weighted total of MAD 102 course
print(f"Average Test Percentage: {int(average_test_percentage * 100)}%")
print(f"Average Quiz Percentage: {int(average_quiz_percentage * 100)}%")
print(f"Average Assignment Percentage: {int(average_assignment_percentage * 100)}%")
print(f"Overall Percentage: {int(overall_percentage * 100)}%")