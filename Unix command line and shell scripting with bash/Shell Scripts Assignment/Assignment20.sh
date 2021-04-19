#!/bin/bash 
ls $1 2> /dev/null
if [[ $? = 0 ]]
then
    echo "It was a success"
else
    echo "Not working and exit code is "$?""
fi