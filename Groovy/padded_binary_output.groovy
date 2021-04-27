package assignment

//6.	Padded binary output
//Print the numbers from 0 to 15 in binary (use Java's Integer.toBinaryString() method).
// make all the output values have four digits

for (i in 0..15)
	
	println String.format("%4s", Integer.toBinaryString(i)).replace(" ", "0")
