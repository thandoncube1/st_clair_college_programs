import math
def square_properties(side: int) -> list:
    """Information about the square property function \n
        `:param side - int` - An integer or float represents the side length of a square.\n
        `:return int` - The area of the square (calculated as the side length squared).\n
        return side * side 
        `@desciption` - This function uses the math module to calculate the area of a square\n
        contains two functions the area and perimeter function 
    """
    def area(side: float) -> float:
        return math.pow(side, 2)
    
    def perimeter(side: int) -> int:
        return side * 4
    
    return [area(side), perimeter(side)]