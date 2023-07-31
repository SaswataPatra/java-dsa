import matplotlib.pyplot as plt
import numpy as np

# x = np.array([1, 2, 3, 4])
# y = x*2

x = [1, 2, 3, 4, 5, 6]
y = [1, 5, 3, 5, 7, 8]

plt.plot(x, y,marker="o")
plt.xlabel("X-axis") 
plt.ylabel("Y-axis") 
plt.title("Todays python task") 
plt.show()
