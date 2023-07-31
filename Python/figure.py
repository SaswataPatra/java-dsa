# from matplotlib import markers
# import matplotlib.pyplot as plt
# import numpy as np

# x = np.array([1,2,3,4])
# y = x*2

# plt.plot(x,y)
# x1 = [2, 4, 6, 8]
# y1 = [3, 5, 7, 9]
# plt.plot(x1,y1,'-.',color="green",marker="o",markerfacecolor="red",markersize=12)
# plt.show()

# plt.plot(x,y)
# plt.xlabel("X-axis")
# plt.ylabel("Y-axis")
# plt.title("Title has")
# plt.show()

# plt.figure()
# x1 = np.array([2,4,6,8])
# y1= x1*2
# plt.plot(x1, y1, '-.')
# plt.show()
# lst = [2,33,222,14,25]
# print(lst[:-1])

def magic( n,sum):
    if sum==1:
     print("magic no")
     return

    if(n>0 or sum>9):
      if n==0:
       n=sum
       sum=0
    else:
     print("not magic no")
     return
    magic(n//10,sum+n%10)
  


n=int(input("enter value:"))
magic(n,0)
