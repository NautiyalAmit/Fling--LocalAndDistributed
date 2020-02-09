# Fling--LocalAndDistributed
Test a Local Flink Setup and Distributed Flink Installation

### This is  Apache Fling project: The primary goal of this  is to get familiar with data-flow engines at the example of Apache Flink. You will setup and evaluate a small test application locally and on a distributed Flink installation.

#### 1. Prepare and Test a Local Flink Setup
#### 2. Use a Distributed Flink Installation

### 1.1 Download Apache Fling and after that open intellij and sstup a scala project  with following maven dependencies:
// https://mvnrepository.com/artifact/org.apache.flink/flink-core
libraryDependencies += "org.apache.flink" % "flink-core" % "1.7.1"
// https://mvnrepository.com/artifact/org.apache.flink/flink-scala
libraryDependencies += "org.apache.flink" %% "flink-scala" % "1.7.1"
// https://mvnrepository.com/artifact/org.apache.flink/flink-table
libraryDependencies += "org.apache.flink" %% "flink-table" % "1.7.1" % "provided"
// https://mvnrepository.com/artifact/org.apache.flink/flink-streaming-scala
libraryDependencies += "org.apache.flink" %% "flink-streaming-scala" % "1.7.1"
### 1.2 Run the  main scala fiel and this generates the o/p for word count problem 


