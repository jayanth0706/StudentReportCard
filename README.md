# Student Report Card GUI Application
This is a simple Java Swing application to manage and calculate student marks and generate a report card. The application allows you to input a student's name, roll number, branch, and their marks for six subjects, and it will calculate the total marks, percentage, and result (Pass/Fail).

### Features:
Input fields for student's name, branch, roll number, and marks in six subjects.
Automatically calculates the total marks and percentage.
Determines if the student Passes or Fails based on the marks.
Option to clear all inputs.
Simple error handling for invalid inputs like incorrect roll number or marks outside 0-100.

### Technologies Used
Java Swing for building the graphical user interface.
JComboBox for selecting the student's branch.
JTextField for user input.
JButton for triggering the calculation and clearing data.
StringTokenizer to split the marks entered.

### How to Run
Clone or download the repository:

git clone https://github.com/jayanth0706/StudentReportCard_UI.git
Open the project in any Java IDE (like Eclipse, IntelliJ) or compile and run via the terminal using javac and java commands.

Compile the Java file:

javac Student2.java
Run the program:

java Student2
The application window will open, allowing you to input the student details and marks.

### How to Use
Enter the student's name and roll number (must be 10 digits).
Select the branch from the drop-down.
Enter the marks for six subjects, separated by a space.
Click "Calculate" to display the total marks, percentage, and the result.
Click "Clear" to reset all fields.


### Error Handling
The roll number must be exactly 10 digits long, otherwise an error message will be displayed.
Marks should be in the range of 0 to 100. Any input outside this range will prompt an error message.
If any subject mark is below 35, the student will Fail; otherwise, the student will Pass.

### License
This project is licensed under the MIT License. See the LICENSE file for more details.
