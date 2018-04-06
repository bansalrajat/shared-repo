def call(args){
  println "i m in shared lib"
  bat "${tool 'm3'}/bin/mvn ${args}"
}
