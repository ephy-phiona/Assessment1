fun main(){
  var info=Name("codehive")
   println(info)

   var number=remainder(30,4)
   println(number)
   var name=identity("Ephy",20)
   println(name)
   var write=word("phiona")
   println(write.length)
}
fun Name(name: String):String{
   var info=name
   return info
}
fun remainder(a: Int,b: Int):Int{
   var number=a%b
   return number
}
fun identity(z: String,p: Int):String{
   var name=("Hi,my name is $z and am $p years old.")
   return name
}
fun word(name: String):String{
   var write=name
   return write
}