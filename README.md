# 1) Presentation

This project propose a java wrapper for the Opus audioc codec library.

# 2) Download

First you need to download this project on your computer. To do so, you can use the following command line :

```git
git clone https://github.com/Pierre-Emmanuel41/java-opus-wrapper.git
```

and then double click on the deploy.bat file. This will deploy this project and all its dependencies on your computer. Which means it generates the folder associated to this project and its dependencies in your .m2 folder. Once this has been done, you can add the project as maven dependency on your maven project :

```xml
<dependency>
    <groupId>fr.pederobien</groupId>
    <artifactId>java-opus-wrapper</artifactId>
    <version>1.0</version>
</dependency>
```

# 3) Tutorial

It is very easy to use this project because it contains only one class : <code>OpusWrapper</code>. In order to get access to the java wrapper for the opus library, the developer only needs to write the following line :

```java
Opus opus = OpusWrapper.getOpus();
```
