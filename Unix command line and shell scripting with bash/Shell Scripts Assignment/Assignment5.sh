#!/bin/bash 


#Script to run three commands

echo "5+6 is:"
expr 5 + 6
echo $?

#Removing a file from different directory

rm /home/hp/assign4.sh

echo $? 

echo "90-6 is:"
expr 90 - 6
echo $?
