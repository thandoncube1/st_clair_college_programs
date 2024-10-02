# Author: Thando Ncube
# Date: September 20, 2024
# Purpose: Hourly wage calculator 

# A program that calculates the person's wage
# Normal wage is 18.75/hour for the first 40 hours
# After that the wage increases to "time and half" 
normal_wage = 18.75
over_time = 1.5
average_hours = 40
salary = 0
over_time_pay = 0
# Ask for the user name and number of hours worked
worker_name = input("Please enter your name: ")
hours_worked = int(input("Please enter the number of hours worked?: "))
# Display the total number of hours worked and amount they made
# Over time - $18.75 * 1.5 = $28.125
if hours_worked > average_hours:
    over_time_pay = (normal_wage * over_time) * (hours_worked - average_hours)
    salary = (average_hours * normal_wage) + over_time_pay
else:
    salary = (normal_wage * hours_worked)


print(f"Total wage: ${salary}")