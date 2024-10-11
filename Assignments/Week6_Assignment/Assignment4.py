from calculate_module import square_properties as square
""" 
    Author: Thando Ncube
    Program: Calculate Area, Perimeter of Square & Rectangle
    Assignment 4 - square_properties and rectangle properties
"""

# Calculate the area of a square
side = 4
[area, perimeter] = square(side)
print(f"Square with side length: {side}\nArea: {area}, Perimeter: {perimeter}")