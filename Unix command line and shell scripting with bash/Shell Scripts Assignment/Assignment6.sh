#!/bin/bash

first=50
second=40
third=10


#Add two numbers
sum=$(($first + $second))
echo "Sum is" $sum


#Add two numbers and multiply by a third

Multi=$(($sum * $third))
echo "Ans after adding and multiply is" $Multi
 
group= expr $first + $second \* $third
echo $group
