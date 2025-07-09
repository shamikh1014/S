

a=23
b=12
c=a+b

print("Sum is ", c)
print("Sum of ", a, "and", b, "is", c)

print("Sum is %d " %c)
print("Sum of %d and %d is %d" %(a, b, c))

print("Sum if {} and {} is {}".format(a, b, c))
print("Sum if {1} and {2} is {0}".format(c, a, b))

# f-strings (fast strings)
print(f"Sum of {a=} and {b=} is{c=}")


# Multiline print statement
print("1. Add\n2. Sub\n3. Mul\n4. Div")
print("""
1. Add
2. Sub
3. Mul
4. Div
""")

# walrus operator
a=12
b=23

'''
c=a+b
print("Sum is ", c)

d=a-b
print("Diff is ", d)

e=a*b
print("Prod is ", e)

f=a/b
print("Quot is ", f)
'''

'''
print("Sum is ", c:=a+b)
print("Diff is ", d:=a-b)
print("Prod is ", e:=a*b)
print("Quot is ", f:=a/b)

print(f"""
Sum is {c=}
Diff is {d=}
Prod is {e=}
Quot is {f=}
""")
'''

print(f"""
Sum is {(c:=a+b)}
Diff is {(d:=a-b)}
Prod is {(e:=a*b)}
Quot is {(f:=a/b)}
""")

print("Hello, ", name:=input("Enter your name: "))







