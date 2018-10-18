rm -r classes Task2.jar &> /dev/null
find . -iname "*.java" | xargs javac -d classes &&
jar cfm Task2.jar manifest.txt -C classes . &&
java -jar Task2.jar