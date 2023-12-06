
# RadioApp

![RadioApp](/src/gui/radio/resources/static/Images/MarkDown.png)

# ====================================

## Project In General

Name: RadioApp.<br/>
Description: Moroccan Radio Stations JavaFx-App.<br/>
@Version: 1.0.0-SNAPSHOT.<br/>
@Author: Zack4DEV.<br/>

# ====================================

## Project In Technical

This project uses Maven, JavaFX Java Framework.

If you want to learn more about JavaFX, please visit its website: <https://openjfx.io/> .

# ------------------------------------------

#### Running the application

You can run your application with maven javafx plugin using:

```shell script

./mvnw javafx:run
```

Or with  Maven/NonMaven [jre/jdk javafx modules:controls,fxml] added using:

```shell script
java "
--add-modules=javafx.fxml,javafx.controls,javafx.media \
--add-opens=javafx.fxml/javafx.fxml=ALL-UNNAMED \
com.oracle.javafx.scenebuilder.app.SceneBuilderApp
"

./mvnw exec:java {mainClass} "-classpath %classpath  --add-modules=javafx.fxml,javafx.controls,javafx.media"
```

# ------------------------------------------

#### Packaging the application

The application can be packaged using:

```shell script
./mvnw jar:jar target/*.jar
```

# ------------------------------------------

#### Creating a native executable

You can create a native executable using GraalVM:

```shell script
mvn -Pnative -Dagent=true -DskipTests=true -DskipNativeBuild=true package exec:exec@java-agent
```

# ------------------------------------------
