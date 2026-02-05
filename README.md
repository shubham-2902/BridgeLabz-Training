# 📘 Week 5 – File Data Handling in Java

This module focuses on handling structured data formats such as **CSV** and **JSON** using Java. It covers reading, writing, parsing, validation, and real-world data processing tasks.

---

## 🗓 Learning Schedule

| Day | Topic |
|-----|------|
| Day 1 | Working with CSV Files in Java |
| Day 2 | Working with JSON Data in Java |

---

# 📅 Day 1 – Working with CSV Files in Java  
**Date:** 23 January 2026  

## 🔹 Topics Covered
- Introduction to CSV  
- Reading CSV Files  
- Writing CSV Files  
- Parsing CSV Data  
- Data Validation  

---

### 📄 Introduction to CSV
CSV (Comma-Separated Values) is a lightweight file format used to store tabular data.  
Each line represents a record, and values are separated by commas.

---

### 📥 Reading CSV Files
CSV files are processed line by line using I/O streams such as **FileReader** and **BufferedReader**.  
Headers can be skipped when needed, and buffering helps handle large files efficiently.

---

### 📤 Writing CSV Files
CSV data is written using **FileWriter** and **BufferedWriter**.  
Each record is formatted in comma-separated form with proper line breaks.

---

### 🔍 Parsing CSV Data
Parsing involves splitting each line into fields using delimiters like commas.  
Extra care is needed to manage missing values and incorrect formats.

---

### ✅ Data Validation
Validation ensures data accuracy and consistency.  
Common checks include:

- Column count verification  
- Data type validation  
- Range checks  
- Regex-based pattern validation  

---

## 📝 Practice Problems on CSV Data Handling

### 🔹 Basic Problems
- Read a CSV File and Print Data  
- Write Data to a CSV File  
- Read and Count Rows in a CSV File  

### 🔹 Intermediate Problems
- Filter Records from CSV  
- Search for a Record in CSV  
- Modify a CSV File (Update a Value)  
- Sort CSV Records by a Column  

### 🔹 Advanced Problems
- Validate CSV Data Before Processing  
- Convert CSV Data into Java Objects  
- Merge Two CSV Files  
- Read Large CSV File Efficiently  
- Detect Duplicates in a CSV File  
- Generate a CSV Report from Database  
- Convert JSON to CSV and Vice Versa  
- Encrypt and Decrypt CSV Data  

🔗 **Code Link:** [Working with CSV Files in Java](https://github.com/shubham-2902/BridgeLabz-Training/tree/java-iostreams-practice/java-iostreams-practice/gcr-codebase/java-iostreams-practice/src/main/java/com/csvdatahandling)  

---

# 📅 Day 2 – Working with JSON Data in Java  
**Date:** 24 January 2026  

## 🔹 Topics Covered
- Introduction to JSON  
- Reading JSON Data  
- Writing JSON Data  
- Parsing JSON Data  
- JSON Schema Validation  

---

### Introduction to JSON
JSON is a lightweight data format using key–value pairs.

Example JSON:
```
{
  "id": 101,
  "name": "Ravi",
  "marks": 85
}
```
### Reading JSON Data
JSON can be read using file I/O and libraries like Jackson or Gson.

### Writing JSON Data
Convert Java objects into JSON and save to files.

### Parsing JSON Data
Extract values, iterate arrays, and handle nested objects.

### JSON Schema Validation
Ensures correct fields, data types, and constraints.

## 📌 Practice Problems on JSON
- Create JSON Object  
- Convert Java Object to JSON  
- Read JSON and Extract Fields  
- Merge JSON Objects  
- Validate JSON  
- Convert List to JSON Array  
- Filter JSON Records  

## 🛠️ Hands-on Practice Problems
- Print All JSON Keys  
- Filter Users > 25  
- Validate Email Field  
- Merge JSON Files  
- Convert JSON ↔ XML  
- Convert CSV → JSON  
- Generate JSON Report  

**Code Link:** [Working with JSON Data in Java](https://github.com/shubham-2902/BridgeLabz-Training/tree/java-iostreams-practice/java-iostreams-practice/gcr-codebase/java-iostreams-practice/src/main/java/com/jsondata)  

---
