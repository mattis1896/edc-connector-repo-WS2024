# Use an official OpenJDK 17 image as a base image
FROM eclipse-temurin:17-jdk-jammy
 
# Set environment variables for Gradle
ENV GRADLE_VERSION=7.6 \
    GRADLE_HOME=/opt/gradle \
    PATH=/opt/gradle/bin:$PATH
 
# Install dependencies, Gradle, and Git
RUN apt-get update && apt-get install -y --no-install-recommends \
    curl unzip git && \
    curl -L -o gradle.zip https://services.gradle.org/distributions/gradle-${GRADLE_VERSION}-bin.zip && \
    unzip gradle.zip -d /opt && rm gradle.zip && \
    mv /opt/gradle-* /opt/gradle && \
    apt-get clean && \
    rm -rf /var/lib/apt/lists/*
 
# Clone the repository and make gradlew executable
RUN git clone https://github.com/g0gi02/edc-connector-repo-WS2024.git /workspace && \
    chmod +x /workspace/gradlew
 
# Set the working directory
WORKDIR /workspace
 
# Default command to open an interactive bash shell
CMD ["/bin/bash"]
