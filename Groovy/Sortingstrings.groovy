package assignment

//1.	Sorting Strings

def country = ['America', 'India', 'brazil', 'Thailand']
println "Original List    " +country

println "------------------------------------------"

println "sorted list      "+ country.sort(false)

println "------------------------------------------"

println country.sort { it.size() }

println "------------------------------------------"

println country.sort { -it.size() }    //descending