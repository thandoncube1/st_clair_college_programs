# Write a program that accepts a list of countries
number = int(input("Enter the length of the array: "))

countries: list = list()

for i in range(number):
    country = input("Enter the country: ")
    countries.append(country)

longest = ""
for country in countries:
    if len(country) > len(longest):
        longest = country

print(longest)