print("Input Word")
x = input()
newX = x[::-1]
print("Reversed Word:", newX)
if(x==newX):
    print("Palindrome")
else:
    print("Not a palindrome")
