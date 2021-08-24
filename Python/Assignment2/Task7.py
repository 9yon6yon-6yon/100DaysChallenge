x = int(input())
if(x == 0):
    print("Input is  0")

elif(x < 0):
    if(x % 2 == 0 and x % 10 == 0):
        print("Negative even number which is a multiple of 10")
    elif(x % 2 != 0 and x % 10 == 0):
        print("Negative odd number which is a multiple of 10")
    elif(x % 2 != 0 and x % 10 != 0):
        print("Negative odd number which is not a multiple of 10")
    elif(x % 2 == 0 and x % 10 != 0):
        print("Negative even number which is not a multiple of 10")

else:
    if(x % 2 == 0 and x % 10 == 0):
        print("Positive even number which is a multiple of 10")
    elif(x % 2 != 0 and x % 10 == 0):
        print("Positive odd number which is a multiple of 10")
    elif(x % 2 != 0 and x % 10 != 0):
        print("Positive odd number which is not a multiple of 10")
    elif(x % 2 == 0 and x % 10 != 0):
        print("Positive even number which is not a multiple of 10")
   
