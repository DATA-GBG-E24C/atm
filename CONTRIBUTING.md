# 🤝 Contributing to ATM  

Thank you for considering contributing to **ATM** – a banking and account management system built with Spring Boot.  

We welcome all kinds of contributions: new features, bug fixes, documentation improvements, and ideas!  

---

## 🧰 Project Setup  

Make sure you have:  

- Java 21 (SDK)  
- Maven  
- IntelliJ IDEA (or similar IDE)  
- Git & GitHub  

---

## 🚧 How to Contribute  

1. **Fork** the repository to your own GitHub.  
2. **Clone** the project locally:  
git clone https://github.com/DATA-GBG-E24C/atm/new/main

Make sure your fork is up to date:
git checkout main
git pull origin main


Create a new branch for your feature/fix:
git checkout -b feature/your-feature-name


Run tests with H2:
mvn test


Commit your changes clearly:
git commit -m "Add: balance inquiry feature"

Push your branch and open a Pull Request:
git push origin feature/your-feature-name

## 🧪 Testing
We use H2 In-Memory Database for testing. All unit and integration tests should pass before submitting a pull request.

Run all tests:
mvn clean test


## ✅ Guidelines
Follow existing code style and structure
Use meaningful names and write clean, readable code
Ensure all security standards are followed (e.g., passwords & PINs use bcrypt) - See the Security section
Avoid hardcoding credentials or sensitive data
Document your code where necessary


## 🔐 Security
For future releases:
Do not log or expose password/PIN hashes or tokens
All sensitive data must be hashed using bcrypt


## 💡 Need Help?

If you're stuck or have questions, feel free to open an issue or start a discussion.

Thanks for your contribution! 🙌
