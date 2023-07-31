num1 = 10
num2 = 20

for i in range(num1,num2+1):
    for j in range(2,i):
        if(i%j==0):
            break
        else:
            print(i)
            break
            
        