print("Total number of CSE 101 classes: ")
x = int(input())
print("Days present: ")
y = int(input())
p = (y * (100/x))
print("Present Percentage:", p, "%")
if(p >= 70):
    print("Allowed to sit for finals.")
else:
    print("Not allowed to sit for finals.")
