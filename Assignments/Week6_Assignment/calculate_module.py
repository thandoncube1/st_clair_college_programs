import math

# Author - Thando Ncube 0875297
# Module Shapes utilities
# Assignment 4

def square_properties(side: int | float) -> list:
    """Information about the square property function \n
        `:param side - int` - An integer or float represents the side length of a square.\n
        `:return int` - The area of the square (calculated as the side length squared).\n
        return side * side 
        `@desciption` - This function uses the math module to calculate the area of a square\n
        contains two functions the area and perimeter function 
    """
    def area(side: float) -> float:
        # Using Math library to calculate the side sqaured
        return math.pow(side, 2)

    def perimeter(side: int) -> int:
        return side * 4
    # Return a list of the functions - pass the parameters
    # This wil allow us to destructure the results.
    return [area(side), perimeter(side)]


def rectangle_properties(length: float, width: float) -> list:
    """Information about the square property function \n
    `:param length` - This is a parameter with varying type types `int | float`\n
    `:param width` - This is another parameter necessary for calculating the area \n
     of a rectangle\n
     `return list` - The perimeter of the rectangle (calculated as 2 times the sum\n of the
length and width).
    `@description` - The rectangle properties function calculates the area and perimeter \n
    of a rectangle and returns `[area, perimeter]` result.
    """
    def area(length: float, width: float) -> float:
        return length * width

    def perimeter(length: float, width: float) -> float:
        return (length + width) * 2
    # Return a list of functions - passing the parameters from the parent
    return [area(length, width), perimeter(length, width)]

