import org.apache.logging.log4j.scala.Logging

object LetsLog extends Logging{

  def main(args: Array[String]): Unit = {
    val a: Int = 1 //args(0).toInt
    val b: Int = 0 //args(1).toInt

    logger.debug("starting a/b")
    try {
      a/b
    } catch {
      case e:Exception => {
        logger.warn("division error", e)
      }
    }
  }


}
