
#  1. Swapping of two numbers

a, b=10, 20
print(f"Before Swapping: {a=}, {b=}")
a,b=b,a
print(f"After Swapping: {a=}, {b=}")

# 2. Pattern Program using single for loop

for i in range(1, 7):print('*'*i)

# 3. Max of 3 numbers in single statement

def max_of_3(a, b, c):
    return a if a>b and a>c else b if b>c and b>a else c

print("Maximum is ", max_of_3(10, 20, 30))

# 4. Walrus with while loop

# print(c:=1+2)->walrus operator

'''
while(msg:=input("Enter your message: "))!="bye":
    if msg=="hello" or msg=="hi":
        print("Hello User")
    elif msg=="how are you?":
        print("I am fine")
    else:
        print("I don't understand")
print("Conversation ended...")
'''

# 5. List, Tuples and Dictionary comprehension

num=[i for i in range(1, 11)]
print("List of 10 integers")
print(num)

# Create a list of even numbers

num=[i for i in range(0, 21, 2)]
print("List of even numbers till 20")
print(num)

# Create a list of even numbers using if else

num=[i for i in range(0, 21) if i%2==0]
print("List of even numbers till 20")
print(num)

# Dictionary comprehension
# Cubes of numbers 1 to 10

cubes={x:x**3 for x in range(1, 11)}
print("Cubes: ")
print(cubes)

# Tuple comprehension
# We call it as generator expression

x=(i for i in range(1, 11))
print(x)

for i in x:
    print(i, end=', ')

#  6. Map

# def temp_convert(c):
#     return 9/5*c+32

# f=temp_convert(34.5)
# print("Fahrenheit: ", f)

temp_c=[45.5, 36.7, 32.1, 39.6, 42.1]
# temp_f=[]
# for i in range(len(temp_c)):
#     temp_f.append(temp_convert(temp_c[i]))
# print(temp_f)

temp_f=list(map(lambda c:9/5*c+32, temp_c))
print(temp_f)

# 7. Filter

numbers=[i for i in range(1, 51)]
num=list(filter(lambda num:num%5==0, numbers))
print(num)

# 8. Sorting a list of dictionaries

data=[
    {"name":"John", "salary":45000},
    {"name":"Smith", "salary":15000},
    {"name":"Tom", "salary":40000},
    {"name":"Jack", "salary":29000}
]

print(sorted(data, key=lambda n:n['name']))
print(sorted(data, key=lambda n:n['salary'], reverse=True))

# 9. Use of for else

num=30
for i in range(2, num):
    if num%i==0:
        print("{} is Not Prime Number".format(num))
        break
else:
    print("{} is Prime Number".format(num))

# 10. Reverse a string

text="brain mentors"
# text[start:stop:step=-1]
rev=text[::-1]
print("Reverse of {} is {}".format(text, rev))


# 11. Function annotations

def calc(a:int, b:int)->int:
    return a+b

print("Sum is ", calc(4, 5))
print("Annotations are ", calc.__annotations__)

def temp_convert(c:'temperature in celcius')->'temperature in fahrenheit':
    return 9/5*c+32

print("Temperature is ", temp_convert(34.4))
print("Annotations are ", temp_convert.__annotations__)

# 12. Open a website in your browser

# import webbrowser

# webbrowser.open('www.facebook.com')

# 13. Print a calendar

import calendar

print("Calendar of year 2020")
print(calendar.calendar(2020))

print("Calendar of JUne 2020")
print(calendar.month(2020, 6))

# 14. Zip and longest zip

names=['John', 'Tom', 'Smith', 'Will', 'Jim', 'Tony']
marks=[67, 77, 69, 78]

# It will print an object of zip
print("After Zip ", zip(names, marks))

# We will type cast zip into list
print("After Zip and list ", list(zip(names, marks)))

# Longest zip

import itertools

print("After longest zip ", list(itertools.zip_longest(names, marks)))

# 15. Difference b/w is and ==

x=[4, 5, 7, 8]
y=[4, 5, 7, 8]

print(x==y) # True or False
print(x is y) # True or False

print(id(x), id(y))

print("X=Z")
z=x
print(x==z) # True or False
print(x is z) # True or False

print(id(x), id(z))

# ==->compare values
# is-> compare reference

# 16. Packing unpacking in python

def calc(x, y):
    a=x+y
    b=x-y
    c=x*y
    d=x/y

    return a, b, c, d # packing

# print(calc(5, 6))

x=calc(5, 6)
# Type of x will be a tuple

i, j, k, l=calc(5, 6)
print("Values are ", i, j, k, l) # unpacking

# 17. Permutation and combination

data=[5, 4, 6]
res=itertools.permutations(data)
print("permutations ", list(res))

res=itertools.permutations(data, 2)
print("Permutations ", list(res))

data=[1, 2, 3, 4, 5]
res=itertools.combinations(data, 2)
print("Combinations ", list(res))

# 18. ascii to char

asc=ord('a')
print("ASCII of 'a' is ", asc)

# char to ascii

char=chr(65)
print("Char at 65 ASCII is ", char)

# 19. Image downloader

import urllib.request as url 

# url.urlretrieve(url, filename)
url.urlretrieve('https://w1.pngwing.com/pngs/835/530/png-transparent-python-logo-programming-language-computer-programming-python-programming-basics-for-absolute-beginners-scripting-language-source-code-php-code-climate-inc.png', 'img.png')

# 20. Play music using python

import os, random

# Set path of of your music dir

os.chdir('C:/Users/SHAMIKH/Music/')

all_songs=os.listdir()
song=random.choice(all_songs)
os.startfile(song)









