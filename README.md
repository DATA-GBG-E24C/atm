# ATM - Banking System

ATM is a banking and account management system built with IntelliJ IDEA 2024.3.5 (Ultimate Edition), Java SDK 21, and Spring Boot.  
It provides user role separation (Admin/Customer), supports accounts and transactions, and organizes banking operations.  
The frontend is built with HTML/CSS/Thymeleaf, and data is stored in a MySQL database.  

---

## 🌐 Features

- Create and manage accounts
- Deposit and withdraw money
- Transfer funds between accounts
- Track account balance and transaction history
- Role-based access (Admin, Customer)
- Secure user authentication
- Responsive HTML/CSS UI

---

## 🧱 Technologies

- **Frontend:** HTML / CSS / Thymeleaf  
- **Backend:** Java 21, Spring Boot, JDBC  
- **Database (Production):** MySQL  
- **Database (Testing):** H2 In-Memory Database  
- **Build Tool:** Maven  
- **Code Quality:** Qodana  
- **Modeling Tool:** Visual Paradigm  

---

## 🗂️ Version Control & Repository  

The project is managed using Git and hosted on GitHub:  

- Source code and diagrams are version-controlled  
- Branching model follows **main** for production and **feature branches** for development  
- Continuous deployment is connected via GitHub Actions (CI/CD)  
- Pull Requests (PRs) are reviewed before merging to **main**  

GitHub Repository: https://github.com/DATA-GBG-E24C/atm  

---

## 📬 Contributions  

We welcome contributions to ATM! If you’d like to report bugs, suggest features, or submit code:  

- Fork the repository  
- Create a branch (`feature/your-feature`)  
- Commit your changes with clear messages  
- Push the branch and open a Pull Request  

Make sure your code:  

- Passes tests (`mvn test`)  
- Follows existing style and naming conventions  
- Does not expose any sensitive credentials or config  

For a full guide, see [CONTRIBUTING.md](./CONTRIBUTING.md)  

---

## 📁 Project Structure (Maven)

```
atm/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/atm/          # Backend logic
│   │   └── resources/            # Application resources
│   └── test/
│       └── java/
│           └── com/atmtest/      # Unit and integration tests
├── diagrams/                     # System diagrams
├── .qodana.yaml                  # Qodana configuration
└── pom.xml
