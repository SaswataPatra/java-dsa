import matplotlib.pyplot as plt
import numpy as np

y = np.array([15,25,35,10,15])
mylabels = ['MCA','BCA','BTECH','Msc','PHD']
myexplode = [0.2,0,0,0,0]
mycolors = ['r','g','b','c','m']


plt.pie(y,labels=mylabels,explode=myexplode,colors=mycolors)
plt.legend(title = "departments of CU")
plt.show() 