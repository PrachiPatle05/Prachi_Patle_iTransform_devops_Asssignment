package assignment


//5.	Multi-line strings
//Make a multi-line string. Compute the number of vowels on each line


def str = """In life, success is a destination that not all the people travel and reach successfully.
Life is a race, and moving in the right way takes us to the way of success.
We all would have the famous story “Slow and Steady Wins The Race”.""".trim()

println str

def vowels = ['a','e','i','o','u','A','E','I','O','U']
s = str.tokenize('\n')

println "-------------------------------------------------"


def line1 = s[0]
def first = line1.findAll { it -> it in vowels }
println "vowel in first line- " + first.size()

def line2 = s[1]
def second = line2.findAll { it -> it in vowels }
println "vowel in Second line- " + second.size()

def line3 = s[2]
def third = line3.findAll { it -> it in vowels }
println "vowel in third line- " + third.size()

 

//int count
//for(int i = 0; i < str.length(); i++)
//{
//
//if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
//{
//
//count++;
//
//}
//}
//println count
