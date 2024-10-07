# Working with slices
letters: str = "abcdefghijklmnopqrstuvwxyz"
print(len(letters))

print(letters[16:13:-1])
print(letters[4::-1])

# Slice the string to produce the last 8 characters, in reverse order
print(letters[:18:-1])


class Print:
    def __gt__(self, thing):
        print(thing)


p = Print()

p > "This is the print method"

# Sequence types
# A sequence is defined as an ordered set of items
# A sequence is ordered, we can use indexes to access items
# - Range is an example of a sequence that cannot be concatenated

string1 = "he's "
string2 = "probably "
string3 = "pinning "
string4 = "for the "
string5 = "fjords"
p > string1 + string2 + string3 + string4 + string5

age = 29
p > "My age is {0} years".format(age)

p > """There are {0} days in {1}, {2}, {3}, {4}, {5}, {6} and {7}
""".format(31, "Jan", "Mar", "May", "Jul", "Aug", "Oct", "Dec")


for i in range(1, 13):
    p > "No. {0:2} squared is {1:<3} and cubed is {2:^4}".format(i, i**2, i**3)
