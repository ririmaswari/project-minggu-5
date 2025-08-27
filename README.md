<h1 align="center">
  <em>🔍 Automation Testing CURA Healthcare Service</em>
</h1>

<p align="center">
  <em>Built with the tools and technologies:</em>
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Java-8+-blue?logo=java&style=flat-square" />
  <img src="https://img.shields.io/badge/Maven-3.8+-green?logo=apache-maven&style=flat-square" />
  <img src="https://img.shields.io/badge/TestNG-7.10.2-orange?logo=testng&style=flat-square" />
  <img src="https://img.shields.io/badge/Cucumber-7.15.0-brightgreen?logo=cucumber&style=flat-square" />
  <img src="https://img.shields.io/badge/Selenium-4.34.0-yellow?logo=selenium&style=flat-square" />
  <img src="https://img.shields.io/badge/ExtentReports-5.1.1-red?style=flat-square" />
  <img src="https://img.shields.io/badge/GitHub-Repository-black?logo=github&style=flat-square" />
  <img src="https://img.shields.io/badge/Jenkins-LTS-blue?logo=jenkins&style=flat-square" />
</p>

---

## 📖 Project Description

This project automates testing for the **CURA Healthcare Service** web app. It covers key workflows such as user login (valid and invalid cases) and booking appointments by selecting a facility and date. Using **Selenium**, **Cucumber**, **TestNG**, and **Jenkins**, these tests ensure the application works correctly and can be integrated into a continuous integration pipeline for reliable delivery.

---

## 📑 Table of Contents

- [🚀 Quick Installation](#-quick-installation)
- [▶️ Run All Tests](#️-run-all-tests)
- [📂 View Test Report](#-view-test-report)
- [🚀 Jenkins Configuration for Projek Minggu 5 Pipeline](#-jenkins-configuration-for-projek-minggu-5-pipeline)

---

## 🚀 Quick Installation

1. **Clone the repository**:
   ```bash
   git clone https://github.com/ririmaswari/project-minggu-5.git
   ```
2. **Navigate to the project folder**:
   ```bash
   cd projek-minggu-5
   ```
3. **Open the project in VS Code:**:
   ```bash
   code .
   ```

---

## ▶️ Run All Tests

- To run all automated tests:

```bash
mvn clean test
```

- Run Specific Test Suite
  **To run tests using a specific suite (e.g., main.xml):**

```bash
mvn clean test -Dsurefire.suiteXmlFiles=src/test/resources/main.xml
```

---

## 📂 View Test Report

```bash
target/ExtentReports/LaporanPengujian/HtmlReport/ExtentHtml.html
```

🌐 Open this file in your browser to see the detailed test results.

---

## 🚀 Jenkins Configuration for Projek Minggu 5 Pipeline

## 🛠 Prerequisites

- Jenkins installed (minimum version 2.x)
- The following plugins installed:
  - Git plugin
  - Pipeline plugin
  - HTML Publisher plugin
- Git executable installed and accessible by Jenkins (configured in **Manage Jenkins > Global Tool Configuration**)

## 📢 Configuration Steps

### Create a New Item

1. Go to Jenkins dashboard
2. Click **New Item**
3. Enter project name (e.g., `ProjekMinggu5`)
4. Select **Pipeline**
5. Click **OK**

## 🛠 Source Code Management Setup

- Under **Pipeline** section:
  - Select **Pipeline script from SCM**
  - Choose **Git** as SCM
  - Repository URL: `https://github.com/ririmaswari/projek-minggu-5.git`
  - Branch: `main` (or your default branch)
  - Leave **Credentials** empty if public repo

### Pipeline Script

- Jenkins will automatically load the `Jenkinsfile` from the repository

### Global Tool Configuration

- Ensure Git is detected and installed in **Manage Jenkins > Global Tool Configuration**
- Ensure JDK is installed and configured if required
- Ensure Maven is installed and configured

### Running the Pipeline

1. Click **Build Now** to run the pipeline
2. Wait for the process to complete
3. After completion, the HTML report can be accessed via the **Last Successful Artifacts** menu or the published report link in the pipeline

## 🛠 Additional Notes

- Make sure the `mvn` command can be executed by the Jenkins user (correct PATH environment variable)
- If your Jenkins agent runs on Windows, use `bat` commands for shell execution
- If your Jenkins agent runs on Linux/macOS, use `sh` commands
- ExtentReports are saved in `target/ExtentReports/LaporanPengujian/HtmlReport`
- Use relative workspace paths in your pipeline for portability

## ⚠️ Troubleshooting

- If you get a "git executable not found" error, ensure Git is installed and Jenkins’ Git path is properly set
- If the pipeline fails due to a missing report folder, verify tests ran successfully and the report folder exists
- Check Jenkins console output for debugging errors
