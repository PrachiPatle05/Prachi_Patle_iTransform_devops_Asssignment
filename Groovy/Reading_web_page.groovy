package assignment

//3.	Reading a web page

def link = "http://www.google.com/".toURL().getText()

//displaying source code
println link

println link.eachLine { it -> println "size :" + it.size() }
