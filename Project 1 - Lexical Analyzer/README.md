# COMP-360-P1
# Comprehensive Java Project README: Lexical Analyzer and Parser System

This document serves as a comprehensive guide to a Java project developed for creating a lexical analyzer and parser. The project consists of several Java classes that work together to analyze and parse source code from a text file, identifying tokens and checking syntax based on a specified grammar.

## Table of Contents

1. [Project Overview](#project-overview)
2. [Class Descriptions](#class-descriptions)
   - [LexicalAnalyzer Class](#lexicalanalyzer-class)
   - [Parser Class](#parser-class)
3. [Usage](#usage)
4. [Example Usage](#example-usage)
5. [Conclusion](#conclusion)

## Project Overview

This Java project is designed to process source code to identify lexical tokens and parse them according to a defined grammar. The system reads source code from a file, breaks it into tokens, and checks if the tokens follow the specified grammar rules.

## Class Descriptions

### LexicalAnalyzer Class

- **Purpose**: To read source code from a file and break it into a series of tokens (lexical analysis).
- **Key Methods**:
  - `main(String[] args)`: Entry point of the lexical analyzer. It reads the file, breaks lines into tokens, and prints them.
  - Uses regular expressions to split source code into tokens and categorizes them based on their type (keywords, identifiers, literals, operators, etc.).

### Parser Class

- **Purpose**: To parse the tokens identified by the lexical analyzer and validate them against a specified grammar.
- **Key Methods**:
  - `main(String[] args)`: Entry point of the parser. It uses the tokens provided by the lexical analyzer to check syntax validity.
  - `parseProgram(Scanner scanner)`: Parses the tokens according to the grammar rules for a program.
  - `parseDeclares(Scanner scanner)`, `parseLoop(Scanner scanner)`, `parseAssignment(Scanner scanner)`: These methods parse different parts of the grammar, such as declarations, loops, and assignments.

## Usage

To use this system, compile and run the `LexicalAnalyzer` class to perform lexical analysis. Then, compile and run the `Parser` class to parse the tokens and check for syntax validity. The source code should be placed in a text file specified in the code.

## Example Usage

1. **Lexical Analysis**:
   - Input file contains: `int n = 21; while (n >= 1) n = n - 10;`
   - Output: List of tokens such as `int`, `n`, `=`, `21`, `;`, `while`, `(`, `n`, `>=`, `1`, `)`, `n`, `=`, `n`, `-`, `10`, `;`.

2. **Parsing**:
   - Using the tokens from the lexical analysis, the parser checks if they follow the grammar rules.
   - Output: Either "Input file is valid according to the grammar." or "Input file contains syntax errors according to the grammar."
