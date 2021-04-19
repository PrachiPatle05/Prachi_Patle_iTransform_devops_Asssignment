#!/bin/bash

var_change(){
  local var1='local 1'
  local var2='local 2'
  echo value inside the function: var1 is $var1
  echo value inside the function: var2 is $var2

 }
var1='global1'
var2='global2'

echo Before the function is called: var1 is $var1 : var2 is $var2
var_change
echo After the function is called: var1 is $var1 : var2 is $var2