def test_function(a):
    def _(b):
        result = a + b
        return result, b
    return _, a 

add, a = test_function(12)
result, b = add(23)

print(f"Result: {result}\nParam A: {a}\nParam B: {b}")