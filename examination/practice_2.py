for i in range(16):
    if i % 3 == 0 and i % 5 == 0:
        print("FizzBuzz")
    elif i % 5 == 0:
        print("Fizz")
    elif i % 3 == 0:
        print("buzz")
    else:
        print(i)