print("IELTS Score: ")
score = float(input())
if(score < 4):
    print("CEFR Level: A1")
elif(score >= 4 and score <= 4.5):
    print("CEFR Level: A2")
elif(score >= 4.5 and score <= 5):
    print("CEFR Level: B1")
elif(score >= 5.5 and score <= 6.5):
    print("CEFR Level: B2")
elif(score > 6.5 and score < 8.5):
    print("CEFR Level: C1")
else:
    print("CEFR Level: C2")
    