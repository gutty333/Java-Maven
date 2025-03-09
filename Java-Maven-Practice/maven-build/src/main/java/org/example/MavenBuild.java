package org.example;

public class MavenBuild {
    public static void main(String[] args) {

        /*
        Build Lifecycles

        Default = responsible for building
        Clean = will delete the target directory, cleans/resets the project
        Site = for generating project documentation

        Default Stages
            - validate
            - compile
            - test
            - package
            - verify
            - install
            - deploy


        3 Types of Build Plugins

        Core
        Packaging
        Tools

        Core Plugins
            - Compile = Responsible for the JDK in use for compiling source code step
            - Installation = For handling the artifacts
            - Deployment = For pushing the artifacts and pushing to remote repository



        Packaging Plugins
            - JAR = produces JAR file that can be used by other projects
            - WAR
            - EAR
            - Shade
         */

        System.out.println("Hello, World!");
    }
}