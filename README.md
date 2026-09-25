# SIS - Sales and Inventory Management System

A desktop-based Sales and Inventory Management System application developed in Java using Java Swing.

---

## 📁 Project Structure

```text
SIS/
├── .gitignore
├── README.md
└── src/
    └── stocksalemanagement/
        ├── Main.java       # Application entry point
        ├── Login.java      # User login screen with validation
        ├── Register.java   # User registration form
        ├── Menu.java       # Main inventory & sales dashboard
        └── Notadmin.java   # Authentication error dialog
```

---

## 🚀 Features

- **Authentication Flow**:
  - Login window with credential validation (`admin` / `admin`).
  - Access control with feedback dialog for invalid credentials.
  - Direct navigation to the Registration view.
- **Registration Form**:
  - User registration screen with easy return navigation to login.
- **Dashboard / Menu**:
  - Main operational hub for sales and inventory tracking.
- **Modernized Swing Practices**:
  - Standard directory layout (`src/` at root).
  - Centered windows on screen launch (`setLocationRelativeTo(null)`).
  - Safe password handling using `JPasswordField.getPassword()`.
  - Replaced deprecated `.show()` calls with `.setVisible(true)`.

---

## 🛠️ Prerequisites

- **Java Development Kit (JDK)**: Version 8 or higher
- Any Java-compatible IDE (Eclipse, IntelliJ IDEA, NetBeans, or VS Code with Java Extension Pack)

---

## 💻 How to Run

### Option 1: Command Line

1. **Compile all Java source files:**
   ```bash
   javac -d bin src/stocksalemanagement/*.java
   ```

2. **Run the application:**
   ```bash
   java -cp bin stocksalemanagement.Main
   ```

### Option 2: Using an IDE (Eclipse / VS Code / IntelliJ)

1. Open the repository root folder `SIS` in your IDE.
2. Mark `src` as the Source folder (if not automatically detected).
3. Run [`Main.java`](file:///src/stocksalemanagement/Main.java) or [`Login.java`](file:///src/stocksalemanagement/Login.java) as a Java Application.

---

## 🔑 Default Credentials

- **Username**: `admin`
- **Password**: `admin`
