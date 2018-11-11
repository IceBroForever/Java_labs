rm -r classes Task1.jar &> /dev/null
find . -iname "*.java" -print | xargs javac -d classes &&
jar cfm Task1.jar manifest.txt -C classes . &&
java -jar Task1.jar