package assignment

//Create a list of numbers. Print all elements greater than zero.

def list=[89, -56, 76, -99, 5]
def filter = list.findAll{ it > 0 }
println filter
