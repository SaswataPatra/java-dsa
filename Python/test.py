def outer_foo():
    a = 20
    def inner_foo():
        a = 30
        print("a=", a)
    inner_foo()
    print("a=", a)
a = 13
outer_foo()
print("a=", a)
