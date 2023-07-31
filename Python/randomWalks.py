import random
import matplotlib.pyplot as plt

def rand(n):

    #defining a func which will return x and y co ordinates for 'n' number of steps
    x,y=0,0

    for i in range(n):
        (dx,dy) = random.choice([(0,1),(1,0),(-1,0),(0,-1)])

        x += dx
        y+= dy

    return (x,y)

number_of_walks = 1000
x_values,y_values = [],[]
for i in range(1000):
    walk = rand(i)
    x_values.append(walk[0])
    y_values.append(walk[1])

plt.scatter(x_values,y_values,s=15)
plt.show()










