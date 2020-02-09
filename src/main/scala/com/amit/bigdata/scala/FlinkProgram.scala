package com.amit.bigdata.scala

import org.apache.flink.api.common.functions.FlatMapFunction
import org.apache.flink.api.java.DataSet
import org.apache.flink.api.java.ExecutionEnvironment
import org.apache.flink.api.java.tuple.Tuple2
import org.apache.flink.util.Collector

object FlinkProgram {
  @throws[Exception]
  def main(args: Array[String]): Unit = {
    val env = ExecutionEnvironment.getExecutionEnvironment
    val rawdata = env.readTextFile("E:\\flingproject/ReadmeAmit.txt")
    val output="E:\\flingproject/WordCountResults.txt"
    //if we wna t we can connect to a aws as well
    //// val socketStream = env.socketTextStream("ec2-13-126-44-170.ap-south-1.compute.amazonaws.com",9000)
    val result = rawdata.flatMap(new FlinkProgram.Splitter).groupBy(0).sum(1)
    result.print()

  }

  class Splitter extends FlatMapFunction[String, Tuple2[String, Integer]] {
    override def flatMap(line: String, out: Collector[Tuple2[String, Integer]]): Unit = {
      for (wordToken <- line.split(" ")) {
        out.collect(new Tuple2[String, Integer](wordToken, 1))
      }
    }
  }

}