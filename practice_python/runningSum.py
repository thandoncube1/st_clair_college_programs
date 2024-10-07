# Calculate the running sum of our input array

def runningSum(myList: list) -> list:
    result: list = list()
    result.append(myList[0])
    count: int = 1
    for current in myList:
        if count != len(myList):
            result.append(result[count-1] + myList[count])
            count += 1
    return result

myList: list = [3, 1, 2, 10, 1]
print(runningSum(myList))
