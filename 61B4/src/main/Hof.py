def tenX(x):
    return 10*x

def do_twice(f,x):
    return f(f(x))

print(do_twice(tenX, 2))