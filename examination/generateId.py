# 14 B. Develop a Python program that collects information from k participants in a fitness class, 
# Import randint from random
from random import randint
# Enter number of participants
number_of_Participants: int = int(input("Enter number of participants: "))
participants: list = list()

for i in range(number_of_Participants):
    print("--"*30)
    print(f"Participant {i+1}:".format(i))
    print("--"*30)
    # Take participant information [firstname, lastname, classtype]
    first_name = str(input("Enter first name: ")).capitalize()
    last_name = str(input("Enter last name: ")).capitalize()
    class_type = str(input("Enter the class type: ")).upper()
    # Generate the registration Id and convert to str
    randomNumber: str = str(randint(1, 100))
    formatName: str = first_name[0:3]
    registration_id: str = class_type+"-"+formatName+"-"+randomNumber
    # create a dictionary to store participant information
    participant = {
        "registration_id": registration_id,
        "first_name": first_name,
        "last_name": last_name,
        "class_type": class_type
    }
    # append each participant in to the list
    participants.append(participant)


for i, participant in enumerate(participants):
    # Display each participant registration ID
    print("Registration Id: {}\n", participant["registration_id"])