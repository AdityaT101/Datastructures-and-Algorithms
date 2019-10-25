
#functions practise
import csv

def abc(n):
    b = n * 2
    return b


#print( 2 * abc(1000) )

with open('/Users/aditya/Desktop/eggs.csv', newline='') as csvfile:
    spamreader = csv.reader(csvfile, delimiter=' ', quotechar='|')
    for row in spamreader:
         print(', '.join(row))





