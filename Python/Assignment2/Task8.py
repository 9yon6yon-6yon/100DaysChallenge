print("Enter 1st angle: ")
x = int(input())
print("Enter 2nd angle: ")
y = int(input())
print("Enter 3rd angle: ")
z = int(input())
sum = x+y+z
if(sum <= 180 and x & y & z > 0):
    if(x == 45 and y == 45 and z == 90):
        print("Isosceles Right Triangle")
    elif(x == 90 and y == 45 and z == 45):
        print("Isosceles Right Triangle")
    elif(x == 45 and y == 90 and z == 45):
        print("Isosceles Right Triangle")
    elif(x == y == z):
        print("Equilateral Triangle")
    elif(x == y or x == z or y == z):
        print("Isosceles Triangle")
    elif(x != y != z):
        print("Scalene Triangle")

else:
    print("Not a Triangle")
