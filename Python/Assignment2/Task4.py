print("Amount to be sent: ")
x = float(input())
print("Bank Balance: ")
y = float(input())
if(x % 10 != 0):
    print("Ammount is not a multiple of 10")
if(x > y):
    print("Insufficient Balance")
else:
    NewBalance = ((y-x) - 10)
    print("Updated Balance:",NewBalance)
