all:
	java -cp antlr-3.5-complete.jar org.antlr.Tool myChecker.g
	javac -cp antlr-3.5-complete.jar myChecker_test.java myCheckerLexer.java myCheckerParser.java
	java -cp antlr-3.5-complete.jar:. myChecker_test input1.c
	java -cp antlr-3.5-complete.jar:. myChecker_test input2.c
	java -cp antlr-3.5-complete.jar:. myChecker_test input3.c
