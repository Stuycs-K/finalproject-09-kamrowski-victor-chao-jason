run: compile
	@java Main $(ARGS)

compile:
	@javac Main.java
	@javac Op_One.java
	@javac Op_Two.java
	@javac Op_Three.java
	@javac Op_Four.java

clean:
	@rm -rf *.class
