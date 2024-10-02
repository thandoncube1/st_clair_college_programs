import random

first_name: str = str(input("Enter the first name: "))
last_name: str = str(input("Enter the last name: "))
birth_date: str = str(input("Enter date of birth (dd-mm-yyyy): "))
email: str = str(input("Enter the email address: "))

fullname = first_name + " " + last_name
username = first_name[0:3] + last_name[0:3] + birth_date[0:2]
password = random.randint(0, 1999)
print(f"{fullname}\nUser Name: {username}\nPassword:{password:04d}".format(name=fullname, user=username, userpass=password))

