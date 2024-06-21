package lexicalanalyzer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Test {

    public static void main(String[] args) throws FileNotFoundException {        
        //Take code input from file
    	Scanner reader = new Scanner(new File("C:\\Users\\matth\\eclipse-workspace\\COMP 360_P1\\src\\lexicalanalyzer\\input.txt"));
        System.out.println("The Lexemes: ");
        //Reads every line and then splits everything into lexemes
        while (reader.hasNextLine()) {
            String str = reader.nextLine(); //Reads the lines
            if (!(str.length() == 0)) {
            	String[] strSplit = str.trim().split("\\s+|(?=[(){};])|(?<=[(){};])");
            	//Add to the ArrayList 
            	for (String lexemes: strSplit) {
                    if (!lexemes.isEmpty() && !lexemes.matches("\\s*")) {
            		System.out.println("The Next Lexeme is: " + lexemes);
            	}
            }
        }
        }
    String inputFilePath = "C:\\Users\\matth\\eclipse-workspace\\COMP 360_P1\\src\\lexicalanalyzer\\input.txt";
    boolean isValid = parseInput(inputFilePath);
    if (isValid) {
        System.out.println("The test program is generated by the EBNF grammar for Simple Function");
    } else {
        System.out.println("The test program cannot be generated by the EBNF Grammar for Simple Function.");
    }
 }
    //END OF MAIN
    // PARSER
    private static boolean parseInput(String filePath) {
    try {
        Scanner scanner = new Scanner(new File(filePath));
        scanner.useDelimiter("\\s+|(?=[(){};])|(?<=[(){};])");
        if (parseProgram(scanner)) {
            return true;
        } else {
            return false;
        }
    } catch (FileNotFoundException e) {
        System.err.println("File not found: " + filePath);
        return false;
    }
}

    private static boolean parseProgram(Scanner scanner) {
    // Check if the next token matches "<program>"
    	if (scanner.hasNext("void")) {
	        System.out.println("The Next Token is: <program>");
	        scanner.next(); // Consume the keyword token
	        if (!parseIdent(scanner)) {
	            System.out.println("The first syntax errror is: <keyword>. Failed to parse identifier.");
	            return false;
	        }
	        if (!scanner.next().equals("(")) {
	            System.out.println("The first syntax errror is: '('.Failed to parse '('.");
	            return false;
	        }
	        if (!scanner.next().equals(")")) {
	            System.out.println("The first syntax errror is: ')'.Failed to parse ')'.");
	            return false;
	        }
	        if (!scanner.next().equals("{")) {
	            System.out.println("The first syntax errror is: '{'.Failed to parse '{'.");
	            return false;
	        }
	        if (!parseDeclares(scanner)) {
	            System.out.println("The first syntax errror is: <keyword>.Failed to parse declarations.");
	            return false;
	        }
	        if (!parseLoop(scanner)) {
	            System.out.println("The first syntax errror is: <keyword>.Failed to parse loop.");
	            return false;
	        }
	        if (!scanner.next().equals(")")) {
	            System.out.println("The first syntax errror is: ')'.Failed to parse ')'.");
	            return false;
	        }
	        if (!parseAssignment(scanner)) {
	            System.out.println("The first syntax errror is: <ident>.Failed to parse assignment.");
	            return false;
	        }
	        if (!scanner.hasNext("}")) {
	            System.out.println("The first syntax errror is: '}'.Failed to parse '}'.");
	            return false;
	        }
	        return true;
	    } else {
	        return false;
	    }
}
    private static boolean parseDeclares(Scanner scanner) {
    // Check if the next token "<declares>"
    if (scanner.hasNext("int")) {
        System.out.println("The next Token is: <keyword>");
        scanner.next(); 
        return parseIdent(scanner) && scanner.next().equals("=") && parseConst(scanner) &&
                scanner.next().equals(";");
    } else {
        System.out.println("Expected Token: <keyword>");
        return false;
    }
}
    private static boolean parseLoop(Scanner scanner) {
    // Check if the next token matches "<loop>"
    if (scanner.hasNext("while")) {
        System.out.println("The Next Token is: <keyword>");
        scanner.next();
        String nextToken = scanner.next();
        if (nextToken.equals("(")) {
            if (parseIdent(scanner)) {
                String lessthan = scanner.next();
                if (lessthan.equals(">=") && parseConst(scanner)) {
                	System.out.println("Found <loop>");
                	return true;
                }
                else {
                	System.out.print("Expected Token: <loop>");
                }
                }
                }
    }
    return false;
} 
    private static boolean parseAssignment(Scanner scanner) {
    // Check if the next token matches "<assignment>"
    if (scanner.hasNext("[a-z]")) {
        System.out.println("The Next Token is: <ident>");
        scanner.next();
        return scanner.next().equals("=") && parseIdent(scanner) &&
                scanner.next().equals("-") && parseConst(scanner) &&
                scanner.next().equals(";");
    } else {
        System.out.println("Expected Token: <ident>");
        return false;
    }
}
    private static boolean parseIdent(Scanner scanner) {
    // Check if the next token matches "<ident>"
	if (scanner.hasNext("[a-zA-Z0-9]+")){
        System.out.println("The Next Token is: <ident>");
        scanner.next(); 
        return true;
    } else {
        System.out.println("Expected Token: <ident>");
        return false;
    }
}
    private static boolean parseConst(Scanner scanner) {
    // Check if the next token matches "<const>"
    if (scanner.hasNextInt()) {
        System.out.println("The Next Token is: <const>");
        scanner.nextInt();
        return true;
    } else {
        System.out.println("Expected Token: <const>");
        return false;
    }
}
}