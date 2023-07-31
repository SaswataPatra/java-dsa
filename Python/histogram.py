import matplotlib.pyplot as plt
import numpy as np

x = np.random.normal(150, 50, 300)
print (x)
plt.xlabel("X-axis") 
plt.ylabel("Y-axis") 
plt.title("Histogram") 
plt.hist(x)
plt.show() 
