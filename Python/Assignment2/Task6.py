print("Luggage Weight: ")
x = int(input())
if(x <= 10):
    p = (200+(x/20))
    print("Payment Tk.", p)
elif(x > 10 and x <= 30):
    check = x-10
    ub = check*50
    p = (200+(x/20))+ub
    print("Payment Tk.", p)
else:
    print("Weight crosses maximum limit")