#!/bin/bash


#gender as a command line parameter
function gender(){
local arms=2
local legs=2
  if [[ $ans -eq Female ]];then
           Female; 
   else 
          Male;
    fi 
   }
#nested functions, one for each a male and female
  function Female(){
          echo "Female has $arms arms ,$legs legs and no beards."
          }


  function Male(){
           echo "Male has $arms arms, $legs legs and beard."
          }
      

echo "Enter Male or Female"
read ans
gender $ans