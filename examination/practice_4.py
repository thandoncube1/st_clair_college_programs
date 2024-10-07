vowels = ["a", "e", "i", "o", "u"]

string = "werwyiadjdhksadgkdfvauowiohjzsdhj"
vowelCount = 0

for i in range(len(string)):
    if (string[i] in vowels):
        vowelCount += 1

print(vowelCount)