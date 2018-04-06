def call(args){
  println "i m in shared lib"
  "${tool 'm3'}/bin/mvn ${args}"
}
