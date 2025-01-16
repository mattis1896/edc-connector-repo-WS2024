# Testing the implementation of EDC Connectors

In this project, we test different aspects of the EDC Connectors implementation.

## Current Folders

### ApiExtension

How to extend the EDC API with custom endpoints.

### Policy

How to control the flow between Connectors using  simple Policies.

### Transfer

How to transfer data between Connectors. Example with Consumer Pulling data from Provider.

## Gradle Multi-Project

This repository is set up as a Gradle multi-project build. This means that the different components of the EDC Connectors, such as ApiExtension, Policy, and Transfer, are organized as subprojects under one main Gradle build script. This structure allows for easy management and isolation of different aspects of the project, while still being able to build, test, and deploy them together as a unified system.

With the Gradle multi-project setup, each subproject has its own configuration, dependencies, and build tasks, but can also share common dependencies and tasks from the root project.

Hier ist der Abschnitt "Prerequisites", den du hinzufügen kannst:

---

## Prerequisites

Before starting with this project, make sure you have the following prerequisites installed:

### 1. **Java Development Kit (JDK)**

This project requires Java JDK 17 or later to build and run. You can download the latest version of the JDK from the [official Oracle website](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html) or use OpenJDK.

### 2. **Gradle**

Gradle is used for building and managing the dependencies of this project. To build the project, you need Gradle installed. You can install Gradle by following the [official Gradle installation guide](https://gradle.org/install/).

### 3. **Git**

Git is required to clone this repository and manage the versioning of your code. You can download Git from the [official website](https://git-scm.com/).

### 4. **Docker (Optional, for Containerization)**

1. You need the following image. You can either build it yourself with the following command (username/name has to be chosen individually):
´´´bash
docker build -t <username/name> .
´´´
   or pull it from docker desktop:
´´´bash
docker pull mattis96/edc-connector
´´´
2. Execute the following command in a terminal in VS-Code:
´´´bash
docker run -it --name java-gradle-dev -w /workspace mattis96/edc-connector
´´´
3. Now press F1 and select "Dev Containers: Attach to running conatiner" and then select the correct container.
---

If you have got all the prerequisites installed, you are ready to start building, running, and testing the EDC Connectors. Each project folder contains its own README file with specific instructions on how to work with that particular component.
