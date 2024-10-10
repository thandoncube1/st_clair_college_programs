def min_max(values: list) -> list[int, int]:
    if (len(values) < 2):
        return
    current_min = values[0]
    current_max = values[1]
    right = len(values) - 1
    left = 0
    # Get the min value of list
    while right > left:
        if (values[left] < values[right]):
            current_min = values[right]
            right -= 1
        elif (values[left] > values[right]):
            current_max = values[left]
            right -= 1
        else: 
            left += 1
    return [current_min, current_max]
        
result = min_max([2, 3, 6, 8, 4, 1])
print(result)