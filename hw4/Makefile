all:
	java -cp antlr-3.5-complete.jar org.antlr.Tool myCompiler.g
	javac -cp antlr-3.5-complete.jar myCompiler_test.java myCompilerLexer.java myCompilerParser.java register.java
	java -cp antlr-3.5-complete.jar:. myCompiler_test input1.c>1.s
