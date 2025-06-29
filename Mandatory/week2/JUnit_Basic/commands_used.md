## Maven Commands Used

## 1. Create a Maven File
mvn archetype:generate ^
  -DgroupId=com.example ^
  -DartifactId=junit_basic ^
  -DarchetypeArtifactId=maven-archetype-quickstart ^
  -DinteractiveMode=false

## 2. Build and Run All Tests

mvn clean test

-Cleans the target directory and runs all tests in the project.

## 3. Run with Debug Output (Verbose)

mvn clean test -X

-Shows detailed logs for troubleshooting build or test failures.

## 4. Run a Specific Test Class

mvn test -Dtest = MockingStubbingTest

mvn test -Dtest = VerifyingInteractionTest

-Executes only the specified test class. Useful when test class names don't match Maven’s default pattern.

## 5. Run All Tests with Test Summary

mvn clean test -Dsurefire.printSummary=true

-Prints a summary of all executed tests at the end of the build.

## Required Dependencies in pom.xml
xml
<dependencies>
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.13.2</version>
        <scope>test</scope>
    </dependency>
  </dependencies>