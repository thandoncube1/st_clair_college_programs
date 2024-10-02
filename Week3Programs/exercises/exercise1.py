# Author: Thando Ncube
# Date: September 20, 2024
# Purpose: Robot sales and shipping company cost calculator

# BuyNLarge Shipping Company 
robot_cost = 75.99
ship_cost = 40

print("Welcome to BuyNLarge!")

custName = input("Enter your customer name: ")
numOfRobots = int(input("How many robots would you like to purchase?: "))
province = input("Which province are we shipping the Robots?\nEnter the province Code: ")

ShippingProvince = province
ShippingProvince.upper()

if numOfRobots >= 6:
    robot_cost = 59.99

if ShippingProvince == "ON":
    ship_cost = 0

total_robot_cost = numOfRobots * robot_cost
total_cost = total_robot_cost + ship_cost

print(f"Cost from robots you ordered is CAD${total_robot_cost:.2f}, your total cost with shipping cost CAD${total_cost:.2f}")