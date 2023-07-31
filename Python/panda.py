from numpy import ndindex
import pandas as pd

data = pd.read_csv("nba.csv",index_col=("Name","Number"))

print (data.loc["Avery Bradley"])