## README: Running and Testing the Policy Enforcement Modules

This document provides instructions on how to build, run, and test the policy enforcement consumer and provider components.

---

### Prerequisites
- Java JDK 17 installed.
- Gradle installed or use the provided `./gradlew` wrapper.
- A JSON processor like `jq` (optional, for formatted output).

---

### 1. Build the Modules

Ensure you are in the **root directory of the project** before running the following commands.

#### Build the Consumer and Provider
```bash
./gradlew policy:policyExtension:policy-enforcement-provider:build
./gradlew policy:policyExtension:policy-enforcement-consumer:build
```

---

### 2. Run the Provider and Consumer

#### Start the Provider
```bash
"C:\Program Files\Java\jdk-17\bin\java.exe" -Dedc.fs.config=policy/policyExtension/policy-enforcement-provider/config.properties -jar policy/policyExtension/policy-enforcement-provider/build/libs/provider.jar
```

#### Start the Consumer
```bash
"C:\Program Files\Java\jdk-17\bin\java.exe" -Dedc.fs.config=policy/policyExtension/policy-enforcement-consumer/config.properties -jar policy/policyExtension/policy-enforcement-consumer/build/libs/consumer.jar
```

---

### 3. Test the Setup with CURL Commands

#### Create an Asset
```bash
curl -X POST -H "Content-Type: application/json" -H "X-Api-Key: password" \
  -d @policy/policyExtension/resources/create-asset.json \
  "http://localhost:19193/management/v3/assets" | jq
```

#### Create a Policy
```bash
curl -X POST -H "Content-Type: application/json" -H "X-Api-Key: password" \
  -d @policy/policyExtension/resources/create-policy.json \
  "http://localhost:19193/management/v3/policydefinitions" | jq
```

#### Create a Contract Definition
```bash
curl -X POST -H "Content-Type: application/json" -H "X-Api-Key: password" \
  -d @policy/policyExtension/resources/create-contract-definition.json \
  "http://localhost:19193/management/v3/contractdefinitions" | jq
```

#### Request a Catalog
```bash
curl -X POST -H "Content-Type: application/json" -H "X-Api-Key: password" \
  -d @policy/policyExtension/resources/catalog-request.json \
  "http://localhost:29193/management/v3/catalog/request" | jq
```

#### Initiate a Contract Negotiation
```bash
curl -X POST -H "Content-Type: application/json" -H "X-Api-Key: password" \
  -d @policy/policyExtension/resources/contract-request.json \
  "http://localhost:29193/management/v3/contractnegotiations" | jq
```

#### Check Contract Negotiation Status
```bash
curl -X GET -H "X-Api-Key: password" "http://localhost:29193/management/v3/contractnegotiations/<UUID>" | jq
```

---

### Notes
- Replace `<UUID>` with the actual ID of the contract negotiation.
- Ensure all configurations (e.g., ports and file paths) are correctly set in the `.properties` files.
- Always run the commands from the **root directory of the project**.