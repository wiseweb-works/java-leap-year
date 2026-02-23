
# Java Leap Year Checker

A simple **Maven-based Java project** that determines whether a given year is a **leap year**. This project demonstrates basic Java syntax, conditional logic, and how to structure a Maven project.

## 🧠 What Is a Leap Year?

A **leap year** has 366 days (February 29) to align the calendar with Earth's orbit.

Rules:

- A year divisible by **400** → leap year
- A year divisible by **4 but not 100** → leap year
- Otherwise → not a leap year

## 🚀 Features

- Maven-based Java project structure
- Simple, beginner-friendly leap year logic
- Demonstrates conditional statements and modular arithmetic

## 📁 Project Structure

```

java-leap-year/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/example/leapyear/LeapYearCalculator.java
│   └── test/
│       └── java/
│           └── com/example/leapyear/LeapYearCheckerTest.java
├── pom.xml
├── .gitignore
└── LICENSE
└── README.md
````

## 🛠️ How to Build and Run

1. **Clone the repository:**

```bash
git clone https://github.com/wiseweb-works/java-leap-year.git
cd java-leap-year
````

2. **Build the project with Maven:**

```bash
mvn clean compile
```

3. **Run the program:**

```bash
mvn exec:java -Dexec.mainClass="com.example.leapyear.LeapYearCalculator"
```

4. **Run tests (if any):**

```bash
mvn test
```

## 📌 Example

```
Enter a year: 2024
2024 is a leap year.
```

```
Enter a year: 2023
2023 is not a leap year.
```

## 📝 License

This project is licensed under the **MIT License** — see the [LICENSE](LICENSE) file for details.
