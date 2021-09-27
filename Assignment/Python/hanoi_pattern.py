# Printing Pattern

def pattern(n):

	k = n - 1

	for i in range(0, n):
		for j in range(0, k):
			print(end=" ")

		k = k - 1

		for j in range(i+1):
			print(2*i+1, end=" ")
		print("\r")


def RowValue(n):
    for i in range(0, n):
        print("Row",i+1,"=", (2*i+1)*(i+1))


n = int(input("Enter no. of levels you want to print: "))
pattern(n)
RowValue(n)
