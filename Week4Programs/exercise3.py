from datetime import date

# Welcome message to Daily Spend Tracker
# day picker to keep track of the purchases.
# create a dictionary to store dates and a collection
    # - A list to store daily puchases and keep track of the full amount
    # - Enter for each day and record the cost of each item.
# Calculate the total for each and include the taxes for given region
# Display the total for a given day.
print("--"*30)
print(" "*30)
print("Welcome to the Daily Spend Tracker")
print(" "*30)
print("--"*30)
day = int(input("Enter a day using [1-31]: "))
month = int(input("Enter a month using [1-12]: "))
year = int(input("Enter a year: ")) 

setDate = date(year, month, day)
# Dictionary storage
purchases = dict()
# Single purchase will have {item, price}
purchase = dict()
# add item to the purchase
item = input("Enter the item name: ")
price = float(input("Enter the price of the item: "))
purchase[item] = price
# push new item into the purchases dict()
purchases = {
    setDate.isoformat(): purchase
}
# Display a single object for the day.
print(purchases)



