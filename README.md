
📅 Week 5 – Day 1: Working with CSV Files in Java
📅Date: 23 january 2026

🔹 Topics Covered
Introduction to CSV
Reading CSV Files
Writing CSV Files
Parsing CSV Data
Data Validation
1. Introduction to CSV
CSV (Comma-Separated Values) is a lightweight file format used to store tabular data.
Each line represents a record, and values are separated by commas.

2. Reading CSV Files
CSV files are read line by line using I/O streams such as FileReader and BufferedReader.
Headers can be skipped and large files can be handled efficiently using buffering.

3. Writing CSV Files
CSV data is written using FileWriter and BufferedWriter.
Each record is written in comma-separated format with proper line breaks.

4. Parsing CSV Data
Parsing involves splitting each line into fields using delimiters like commas.
Care must be taken to handle missing values and incorrect formats.

5. Data Validation
Validation ensures data correctness and consistency.
Checks include column count, data type validation, range checks, and regex-based pattern validation.

📝 Practice Problems on CSV Data Handling
🔹 Basic Problems
Read a CSV File and Print Data
Write Data to a CSV File
Read and Count Rows in a CSV File
🔹 Intermediate Problems
Filter Records from CSV
Search for a Record in CSV
Modify a CSV File (Update a Value)
Sort CSV Records by a Column
🔹 Advanced Problems
Validate CSV Data Before Processing
Convert CSV Data into Java Objects
Merge Two CSV Files
Read Large CSV File Efficiently
Detect Duplicates in a CSV File
Generate a CSV Report from Database
Convert JSON to CSV and Vice Versa
Encrypt and Decrypt CSV Data
Code link: [Working with CSV Files in Java](https://github.com/shubham-2902/BridgeLabz-Training/tree/java-iostreams-practice/java-iostreams-practice/gcr-codebase/java-iostreams-practice/src/main/java/com/csvdatahandling)

📅 Day 2: Working with JSON Data in Java
📅 Date 24 january 2026

🔹 Topics Covered
Introduction to JSON
Reading JSON Data
Writing JSON Data
Parsing JSON Data
JSON Schema Validation
1. Introduction to JSON
JSON (JavaScript Object Notation) is a lightweight data-interchange format that is easy to read and write.
It represents data in key–value pairs and supports nested structures.

Example:

{
  "id": 101,
  "name": "Ravi",
  "marks": 85
}
2. Reading JSON Data
JSON data can be read from files or APIs using:

File I/O streams
JSON libraries such as Jackson or Gson
Key Points
Read the file as text
Convert JSON text into Java objects
Handle malformed JSON using exception handling
3. Writing JSON Data
JSON data is written by:

Converting Java objects into JSON format
Saving the JSON output to a file
Key Points
Maintain proper JSON structure
Use indentation for better readability
Handle file writing exceptions properly
4. Parsing JSON Data
Parsing JSON means extracting values from JSON objects and arrays.

Common Tasks
Read values using keys
Iterate through JSON arrays
Handle nested JSON objects
5. JSON Schema Validation
JSON Schema is used to validate the structure and data types of JSON data.

Validation Ensures
Required fields are present
Data types are correct
Values follow defined rules
📌 Practice Problems on JSON
Create a JSON Object for a Student
Convert a Java Object to JSON
Read a JSON File and Extract Specific Fields
Merge Two JSON Objects
Validate JSON Structure Using Jackson
Convert a List of Java Objects into a JSON Array
Filter JSON Records Based on Age
🛠️ Hands-on Practice Problems
Read a JSON File and Print All Keys and Values
Convert a List of Java Objects into a JSON Array
Filter JSON Data for Users Older Than 25
Validate Email Field Using JSON Schema
Merge Two JSON Files into One
Convert JSON to XML Format
Convert CSV Data into JSON
Generate a JSON Report from Database Records
Code link: [Working with JSON Data in Java](https://github.com/shubham-2902/BridgeLabz-Training/tree/java-iostreams-practice/java-iostreams-practice/gcr-codebase/java-iostreams-practice/src/main/java/com/jsondata)
