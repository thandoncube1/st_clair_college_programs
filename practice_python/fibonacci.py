"""
Working on that Fibonacci sequence
in Recursive form
"""
def fib(n, memo={}):
    if n in memo:
        return memo[n]
    if n < 2:
        return n
    memo[n] = fib(n - 1, memo) + fib(n - 2, memo)
    return memo[n]


result = fib(100)
print(result)
