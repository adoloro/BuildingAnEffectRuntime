package com.github.runtologist.demo

import com.github.runtologist.naturalNumbers._
import com.github.runtologist.naturalNumbers.N._
import com.github.runtologist.runtime.Runtime
import zio.ZioInterpreters._

import scala.concurrent.ExecutionContext.global

object DemoDiv extends scala.App {
  implicit val ec = global

  val interpreter = succeedFlatMap // orElse fail

  val runtime = new Runtime(interpreter)

  val r =
    runtime.unsafeRun(
      SubDiv
        .div(
          Cons(Cons(Zero)),
          Zero
        )
    )
  println(r)

}
