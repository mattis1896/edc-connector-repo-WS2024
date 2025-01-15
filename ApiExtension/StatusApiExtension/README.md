# Status API Connector

This project provides a simple API connector that serves a status endpoint for the EDC (Eclipse Data Space Connector) framework. It includes a custom extension to register a REST API that allows you to check if the connector is running. This connector has no further special functionality other than the status endpoint and was created for testing purposes.

## Setup Instructions

### 1. Make Sure You Are in the Root Directory

Before building the project, ensure you are in the root directory of the project. This is where the `settings.gradle` and `build.gradle` files are located.

### 2. Clean and Build the Project

To build the project, first ensure you have Gradle installed on your system. You can run the following command to clean the previous build files (if any) and build the project:

```bash
./gradlew clean ApiExtension:StatusApiExtension:build
```

#### Explanation:

- **`./gradlew clean`**: This cleans up any previous build artifacts, ensuring that the build starts fresh.
- **`ApiExtension:StatusApiExtension:build`**: This command triggers the build process for the `StatusApiExtension` class, which is responsible for the Status API functionality in the EDC connector.

### 3. Run the Connector

Once the project is successfully built, you can run the connector using the `java -jar` command. The following command will execute the JAR file created in the build step:

```bash
java -jar ApiExtension/StatusApiExtension/build/libs/StatusApi-connector.jar
```

#### Explanation:

- **`java -jar`**: This runs the Java application packaged into a JAR file.
- **`basic/basic-03-configuration/build/libs/StatusApi-connector.jar`**: This path specifies the location of the generated JAR file. If the build was successful, you can run the JAR to start the EDC connector with the Status API endpoint.

### 4. Access the Status API

Once the connector is running, you can send a GET request to the `/status` endpoint to check if the connector is running. This can be done by using any HTTP client (like Postman, curl, or a browser).

#### Example Request:

```bash
curl -X GET http://localhost:8181/api/status
```

#### Example Response:

```json
{
  "response": "Connector Running"
}
```

This response indicates that the connector is up and running.

---