from calculate_module import square_properties, rectangle_properties
"""
    Author: Thando Ncube
    Program: Calculate Area, Perimeter of Square & Rectangle
    Assignment 4 - square_properties and rectangle properties
    Date: 11 October 2024
"""
# Display message function


def displayMessage(shape, area, perimeter, length, width=0):
    """
    `:param shape` - Takes a shape of type string parameter
    `:param area` - Calculated area value to be displayed
    `:param perimeter` - Calculated perimeter value of the shape
    `:param length` - The measurement of the length of side
    `:param width [optional]` - The measurement of width of the shape
    `@description` - This is just a display message method that is \n
    presentational and does not mutate any of the input values.
    """
    if shape == "square":
        print(f"{shape.capitalize()} with side length ", end="")
        print(f"{length}:\nArea: {area}, Perimeter: {perimeter}")
        print("--"*20)
    else:
        print(f"{shape.capitalize()} with length {length} and ", end="")
        print(f"Width {width}:\nArea: {area}, Perimeter: {perimeter}")
        print("--"*20)



# Calculate the area of a square
# Execute the main to test the output of the file
if __name__ == "__main__":
    # Initialize the square side
    [sq_area, sq_perimeter] = square_properties(4)
    # Initialize the rectangle length & width
    [r_area, r_perimeter] = rectangle_properties(8, 4)
    # Display message passing the relevant arguments
    displayMessage("square", sq_area, sq_perimeter, 4)
    displayMessage("rectangle", r_area, r_perimeter, 8, 4)
