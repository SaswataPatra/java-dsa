
import matplotlib.pyplot as plt
x_cords = range(-100,100)
y_cords = [x*x for x in x_cords] #y=x^2

plt.plot(x_cords, y_cords)
plt.show()