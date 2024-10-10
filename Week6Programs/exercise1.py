def min_max(values: list) -> list[int, int]:
    if (len(list) < 2):
        return
    current_min = values[0]
    current_max = values[1]
    right = 0
    left = 0
    for i in values:
        if (i < values[right]):
            right -= 1
            pass
        if (i > values[left]):
            left -= 1
            pass
        