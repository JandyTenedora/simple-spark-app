package com.jandy_playground;
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.types._

/**
 * @author ${user.name}
 */
object App {
  
  def foo(x : Array[String]) = x.foldLeft("")((a,b) => a + b)

  val spark: SparkSession = SparkSession.builder()
    .master("local[3]")
    .appName("JandysSparkApplication")
    .getOrCreate()
  val sc = spark.sparkContext

  def main(args : Array[String]) {
    println( "Hello World!" )
    println("concat arguments = " + foo(args))
    println("aherm?")
  }

}
