package model

import play.api.data.Form
import play.api.data.Forms._

case class User(id : Long,firstName : String, lastName : String , mobile : Long , email : String)

case class UserFormData(firstName : String, lastName : String , mobile : Long , email : String )

case class Ex1(str:String, ex: Throwable) extends Exception (str, ex) {
  val a = 1

  def apply(str: String): Ex1 = new Ex1(str, null)

}

class User1(id : Long, firstName : String, lastName : String, mobile : Long, email : String)

object User1 {
  def apply(id: Long, firstName: String, lastName: String, mobile: Long, email: String): User1 = new User1(id, firstName, lastName, mobile, email)

  def apply(id:Long): Long = id


}

object UserForm {

  val form = Form(
    mapping(
      "firstName" -> nonEmptyText,
      "lastName" -> nonEmptyText,
      "mobile" -> longNumber,
      "email" -> email
    )(UserFormData.apply)(UserFormData.unapply)
  )
}

object Main extends App {
  val a = User(5,"felipe", "osorio", 12156, "andres@caiba")
  val b = User1(5,"felipe", "osorio", 12156, "andres@caiba")
  val c = User1(1)
}
