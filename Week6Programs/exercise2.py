# Nested functions - Function decorators
def decorator(func):
    """Decorator function that wraps a function to extend its behaviour
        :param func - The function that is being extended by the decorator
        :return func 
    """
    def wrapper():
        print(f"Running ... {func.__name__}")
        print(func())
        print("Complete")
    return wrapper()

@decorator
def hello(name: str = "Wilson") -> str:
    return "Hello {0}".format(name)

@decorator
def message() -> str:
    return "This is a warning message!"

async def calculate(a, b, func):
    return await func(a, b)