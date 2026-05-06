# 🤖 Automation Playground

> A growing collection of automation demos built with **Selenide** and **JUnit** — designed for beginners, but built to scale.

Whether you're just getting started with test automation or looking for practical, runnable examples, this repo has you covered. From clicking buttons to calling APIs, each demo is self-contained, well-commented, and ready to run.

---

## 📚 What's Inside

| Category | Description |
|---|---|
| 🌐 **Web UI Automation** | Browser interactions, form filling, navigation, assertions |
| 🔌 **API Testing** | REST API calls, response validation, chaining requests |
| *(more coming soon)* | Additional topics will be added over time |

---

## 🚀 Getting Started

### Prerequisites

Make sure you have the following installed:

- **Java 22+** — [Download](https://adoptium.net/)
- **Maven 3.6+** — [Download](https://maven.apache.org/download.cgi)
- **A modern browser** (Chrome recommended — Selenide manages the driver automatically)

### Clone the Repository

```bash
git clone https://github.com/anca-grigore/selenide-junit-the-internet-project.git
cd selenide-junit-the-internet-project
```

### Install Dependencies

```bash
mvn clean install -DskipTests
```

### Run All Tests

```bash
mvn test
```

### Run a Specific Demo

```bash
# Run a specific test class
mvn test -Dtest=YourDemoClassName

# Run a specific test method
mvn test -Dtest=YourDemoClassName#yourMethodName
```

---

## 🗂️ Project Structure

```
src/
├── test/
│   ├── java/
│   │   ├── ui/               # Web UI automation demos
│   │   └── api/              # API testing demos
│   └── resources/            # Testing resources
└── main/
    └── java/
        ├── utils/            # Shared helpers and config
        ├── api/              # API-related classes
        └── pages/            # Page object model classes for UI tests
.gitignore
pom.xml
README.md
```

---

## 🧰 Tech Stack

| Tool | Purpose |
|---|---|
| [Selenide](https://selenide.org/) | Fluent API for browser automation |
| [JUnit 5](https://junit.org/junit5/) | Test framework |
| [Maven](https://maven.apache.org/) | Build & dependency management |
| [REST Assured](https://rest-assured.io/) *(planned)* | API testing |

---

## 🧪 Demo Highlights

### Web UI
- ✅ Open a browser and assert page title
- ✅ Fill and submit a form
- ✅ Handle dropdowns, checkboxes, and alerts
- ✅ Wait for dynamic elements (no flaky `Thread.sleep`!)

### API
- ✅ Send a GET request and verify the response
- ✅ Create a resource with POST and validate the result
- ✅ Chain API calls (create → retrieve → delete)

---

## 🍴 Forking

This repo is not open to direct contributions, but you're very welcome to fork it and build your own automation playground on top of it! Make it your own, experiment freely, and have fun with it.

---

## 📄 License

This project is licensed under the [MIT License](LICENSE).

---

> Built with ☕ and a love for clean, maintainable automation.