package assignment

//4.	Strings and GroovyStrings
//a-number of character in string

def name = "Hello, Groovy!"
println name
println name.length()

//b-concatenation in groovy strings

myName = "Prachi Patle"
println "Hello! ".concat(myName)
println "Hello! " + myName


//c-check Palindrome

def originalString = "racecar"
println originalString
String reverseString = originalString.reverse()
//println reverseString

if (reverseString == originalString)
	println "The given string $originalString is Palindrome"
	else
		println "The given string $originalString is NOT Palindrome"
		
// Case in-sensitive comparision
	
def originalString2 = "Bob"
println originalString2
String reverseString2 = originalString2.reverse()
//println reverseString2
		
if (originalString2.equalsIgnoreCase(reverseString2))
	println "The given string $originalString2 is Palindrome"
	else
		println "The given string $originalString2 is NOT Palindrome"
		
//d- Split the sentence into an array using the split method.

def str= "Hello, World. How are you?"
println str
println str.split()

//Count the numbers of words

def countLines(s) { s.split(" , ").size() }
def countWords(s) { s.split(" ").size() - countLines(s) + 1 }

println countWords(str)

//Same using the tokenize method.

println str.tokenize()

//e-array notation (square brackets) to print the substring "World".

println str[7..11]

//f-array notation to print the last word, but reversed.

println str[25..22]















































