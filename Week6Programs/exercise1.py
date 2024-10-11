# This is a Two pointer approach to solving this problem
# Returning two values min and max
def min_max(values: list) -> list[int, int]:
    # If out values array have only 2 elements
    if (len(values) < 2):
        return

    current_min = current_max = values[0]
    i = j = 0

    # Check the min and max value of list
    # by evaluating if current_min or max are greater or less than value.
    while i < len(values) and j < len(values):
        if (values[i] < current_min):
            current_min = values[i]
        if (values[j] > current_max):
            current_max = values[j]
        i += 1
        j += 1

    return [current_min, current_max]


result = min_max([2, 3, 78, 6, 8, 4, 1, 45, 0.89])
print(result)
