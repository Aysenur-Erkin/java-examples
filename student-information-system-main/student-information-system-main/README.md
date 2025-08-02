# Student Management System 

This project is a simple student management system that allows you to add, list, update, and delete student information. It is implemented in Java and uses a command-line interface for user interaction.

## Features

- Add new students 👩🏻‍🎓
- List all students 📋
- Update existing student information 🆕
- Delete a student 🗑️

## Prerequisites

- Java Development Kit (JDK) installed on your machine

## Getting Started

1. **Clone the repository**

    ```sh
    git clone https://github.com/your-username/student-management-system.git
    cd student-management-system
    ```

2. **Compile the Java files**

    ```sh
    javac Main.java Student.java StudentManagement.java
    ```

3. **Run the program**

    ```sh
    java Main
    ```

## How to Use

Upon running the program, you will be presented with a menu that allows you to choose from the following options:

1. **Add Student**

    - Enter the student's ID, name, age, and grade.

2. **List Students**

    - Display all students currently in the system.

3. **Update Student**

    - Enter the ID of the student you wish to update, followed by the new name, age, and grade.

4. **Delete Student**

    - Enter the ID of the student you wish to delete.

5. **Exit**

    - Exit the program.

### Example

Below is an example interaction with the program:

```plaintext
1. Add Student
2. List Students
3. Update Student
4. Delete Student
5. Exit
Choose an option: 1

Enter ID: 1
Enter Name: John Doe
Enter Age: 20
Enter Grade: A

Student added successfully!

1. Add Student
2. List Students
3. Update Student
4. Delete Student
5. Exit
Choose an option: 2

List of Students:
Student{id=1, name='John Doe', age=20, grade='A'}
