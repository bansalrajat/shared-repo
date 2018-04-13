def call(args){
  echo "job name is : $JOB_NAME"
  sh "/usr/bin/docker  ${args}"
}
