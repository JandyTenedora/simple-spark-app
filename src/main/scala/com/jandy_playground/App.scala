package com.jandy_playground;
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.types._


object App {
  
  def concat(x : Array[String]) = x.foldLeft("")((a,b) => a + b)

  val spark: SparkSession = SparkSession.builder()
    .master("local[3]")
    .appName("JandysSparkApplication")
    .getOrCreate()
  val sc = spark.sparkContext

  def main(args : Array[String]) {
    println("concat arguments = " + foo(args))
  }

}
