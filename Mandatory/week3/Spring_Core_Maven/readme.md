
##  Exercise 1: Configuring a Basic Spring Application

### 🔹 Description:
Sets up a Spring-based application to manage books in a library.

### 🔹 Steps:
- Created a Maven project `LibraryManagement`.
- Added Spring Core dependency in `pom.xml`.
- Defined `BookService` and `BookRepository` as beans in `applicationContext.xml`.
- Implemented basic method to display book info.

---

##  Exercise 2: Implementing Dependency Injection

### 🔹 Description:
Demonstrates Spring's IoC to inject `BookRepository` into `BookService`.

### 🔹 Steps:
- Used setter-based DI in `BookService`.
- Updated XML configuration to wire dependencies.
- Verified output in `MainApp.java`.

---

##  Exercise 4: Creating and Configuring a Maven Project

### 🔹 Description:
Maven setup with required Spring dependencies.

### 🔹 Dependencies Used:
 <dependencies>
    <!-- Spring Core and Context -->
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-context</artifactId>
      <version>5.3.32</version>
    </dependency>

    <!-- Optional: For AOP and MVC if needed later -->
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-aop</artifactId>
      <version>5.3.32</version>
    </dependency>
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-webmvc</artifactId>
      <version>5.3.32</version>
    </dependency>
  </dependencies>

  <build>
    <plugins>
      <!-- Use Java 8 -->
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-compiler-plugin</artifactId>
        <version>3.8.1</version>
        <configuration>
          <source>1.8</source>
          <target>1.8</target>
        </configuration>
      </plugin>
    </plugins>
  </build>

--
## To run and execute

mvn clean compile exec:java -Dexec.mainClass="com.library.MainApp"

