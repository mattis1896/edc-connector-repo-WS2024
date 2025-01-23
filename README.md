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

Certainly, here's the improved version with the first command included and a clearer description of the two options:

### 4. **Docker (Optional, for Containerization)**

1. **Build or Pull Docker Image**

   You have two options to obtain the necessary Docker image:

   * **Build from Dockerfile:**
      ```bash
      docker build -t <username/name> . 
      ```
      This command builds a Docker image using the `Dockerfile` located in the current directory. Replace `<username/name>` with a unique identifier for your image (e.g., `your_username/edc-connector`).

   * **Pull from Docker Hub:**
      ```bash
      docker pull mattis96/edc-connector
      ```
      This command downloads a pre-built image named `mattis96/edc-connector` from Docker Hub.

2. **Run the Docker Container**

   Execute the following command to start the Docker container:

   ```bash
   docker run -p 8080:19193 -p 8081:29193 -it --name java-gradle-dev -w /workspace mattis96/edc-connector
   ```

   This command:
      * `-p 8080:19193`: Maps port 8080 on the host machine to port 19193 inside the container.
      * `-p 8081:29193`: Maps port 8081 on the host machine to port 29193 inside the container.
      * `-it`: Runs the container in interactive mode with a pseudo-TTY.
      * `--name java-gradle-dev`: Assigns a name to the container for easier identification and management.
      * `-w /workspace`: Sets the working directory within the container to `/workspace`.
      * `mattis96/edc-connector`: Specifies the name of the Docker image to use (either the one you built or pulled from Docker Hub).

3. **Attach VS Code**

   * Press F1 in VS Code and select "Dev Containers: Attach to running container".
   * Select the `java-gradle-dev` container from the list.

This refined description provides a clearer explanation of the two options for obtaining the Docker image and includes the necessary command to run the container with the specified port mappings.

---

If you have got all the prerequisites installed, you are ready to start building, running, and testing the EDC Connectors. Each project folder contains its own README file with specific instructions on how to work with that particular component.
