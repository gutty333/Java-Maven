package org.example;

public class MavenDependencies {
    public static void main(String[] args) {

        /*

        Dependency Scopes

        Compile Scope = Default scope for all dependencies if otherwise not specified. Dependency is propagated, transient dependency
        Provided Scope = Not common in cloud applications
        Runtime Scope = Only needed for execution
        Test Scope = Only needed for testing. Available only for testing, you will see testing frameworks with this scope





        Transitive Dependencies

        Dependencies of dependencies = Will bring child dependencies that are needed

        For versioning, is best to be explicit

        Best practice are
        - Only declare what you need. Use tools like Dependency Analyze to check if dependency is used
        - Consider parent POMs to control versions




        Dependency Management

        This object allows to better structure and control our module dependency management
        Essentially we have the Parent POM be our single source for shared dependencies, controlling the scope and versions
        The properties from the Parent POM will also be accessible to the other child POMS

        Parent POM declaration:
        <dependencyManagement>
            <dependencies>
                <dependency>
                    <groupId>com.fasterxml.jackson.core</groupId>
                    <artifactId>jackson-core</artifactId>
                    <version>${jackson.version}</version>
                </dependency>
                <dependency>
                    <groupId>com.fasterxml.jackson.core</groupId>
                    <artifactId>jackson-databind</artifactId>
                    <version>${jackson.version}</version>
                </dependency>
                <dependency>
                    <groupId>org.projectlombok</groupId>
                    <artifactId>lombok</artifactId>
                    <version>${lombok.version}</version>
                    <scope>provided</scope>
                </dependency>
            </dependencies>
        </dependencyManagement>



        Child POM declaration for the shared/common dependency you want to use:
        <dependencies>
            <dependency>
                <groupId>com.fasterxml.jackson.core</groupId>
                <artifactId>jackson-core</artifactId>
            </dependency>
        </dependencies>

        Notice we are not concerned with scope or version, since it will be propagated from the parent
        This also works best with the enforcer build plugin, again it depends. you might want different versions for certain modules


        mvn clean verify =  to analyze your POM structures




        Dependency Goals

        mvn dependency:analyze =  The following command will analyze your dependencies and provide information or their usage
        mvn dependency:resolve
        mvn dependency:tree



        Uber JARs

        This is a Shaded Jar
            - Contains all source code
            - Contains all libraries
            - Can be executable

        mvn clean package = The usual command to package your project. Will create the jar files in target folder

         */

        System.out.println("Hello, World!");
    }
}