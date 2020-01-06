all:
	java -cp antlr-3.5.2-complete.jar org.antlr.Tool myparser.g
	javac -cp ./antlr-3.5.2-complete.jar:. testParser.java
	java -cp antlr-3.5.2-complete.jar:. testParser input1.c
	java -cp antlr-3.5.2-complete.jar:. testParser input2.c
	java -cp antlr-3.5.2-complete.jar:. testParser input3.c
