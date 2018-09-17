def call(String stackName) {
    sh "docker stack rm ${stackName}"
}
