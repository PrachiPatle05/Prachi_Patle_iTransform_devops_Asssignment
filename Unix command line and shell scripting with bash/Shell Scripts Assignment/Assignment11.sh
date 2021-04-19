#!/bin/bash

mynumber=3
read -p "Guess my number between 1 to 5:" gnum

if [[ $gnum == $mynumber ]]
then
	echo "you guessed right"

fi	

	
