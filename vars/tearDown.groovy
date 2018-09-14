def call(String swarmManager, String stackName) {
    sh "docker -H ${swarmManager} stack rm ${stackName}"
}
