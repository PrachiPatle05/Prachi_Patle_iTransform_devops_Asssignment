echo "enter file name"
read filename
if [[ -f "$filename" ]]
then
while IFS=read -r line
do
echo "$line"
done < $filename
else
echo "$filename  file name does not exist"
fi

