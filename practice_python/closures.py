"""
Create a closure like you do 
"""
def counter():
    count: int = 0

    def _():
        nonlocal count
        count += 1
        return count
    return _


increment = counter()

print(increment())
print(increment())
print(increment())
