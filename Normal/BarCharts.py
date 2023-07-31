import numpy as np
import matplotlib.pyplot as plt

data = {'English':20, 'Physics':15, 'Mathematics':30,
		'Computer science':35}
courses = list(data.keys())
values = list(data.values())

fig = plt.figure(figsize = (10, 5))

plt.bar(courses, values, color ='maroon',
		width = 0.4)

plt.xlabel("Courses offered")
plt.ylabel("No. of students enrolled")
plt.title("Students enrolled in different courses")
plt.show()
