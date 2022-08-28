import random
def function():
    l1 = "1234567890";#It has all numbers
    l2 = "ABCDEFGHIJKLMNOPQURSTUVWXWZ"#Uppercase Alphabets
    l3 = "abcdefghijklmnopqrstuvwxyz"#Lowercase Alphabets 
    l4 = "`~!@#$%^&*()_+=-/.'?><,"#Special characters
    Password = l1+l2+l3+l4;
    Length  = (int (input("Enter the length of the password:")))

    if Length<1:
        print("Password cannot be made")

    else:
        print("Password of length ",Length," :-",end="   ")
        for i in range(Length):
            a = random.choice(Password);
            print(a,end="")

print()


function()

