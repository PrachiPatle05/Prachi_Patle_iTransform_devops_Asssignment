#!/bin/bash

echo "select items"
echo "1- books"
echo "2- pens"
echo "3- eraser"

read -p "what do you want to have?(1 or 2 or 3)" option

case $option in 
"1") echo "books selected"
;;
"2") echo "pens selected"
;;
"3") echo "eraser selected"
;;
*) echo "things not available"

esac