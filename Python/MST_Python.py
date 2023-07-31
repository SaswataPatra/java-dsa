# String = input('Enter the string :')
# count = 0
# String = String.lower()
# for i in String:
#     if i == 'a' or i == 'e' or i == 'i' or i == 'o' or i == 'u':
#         count += 1

# print('Total vowels are :' + str(count))

# lst = [1,2,3,4,5,6,7,8,9]
  
# odd = [num for num in lst if num % 2 == 1]
  
# print(odd)

# lst=[]
# for x in range(1500, 2701):
#     if (x%7==0) and (x%5!=0):
#         lst.append(str(x))
# print (','.join(lst))

class Shape():
    def __init__(self):
        pass

    def area(self):
        return 0

class Square(Shape):
    def __init__(self,length = 0):
        Shape.__init__(self)
        self.length = length

    def area(self):
        return self.length*self.length

a_square = Square(3)
print(a_square.area())     #prints the area of sqaure as per the parameters passed

print(Square().area())  # prints the default value i.e 0
