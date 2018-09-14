def call(String swarmManager, String stackName) {
    sh "docker -H ${swarmManager} stack deploy --compose-file docker-compose.yml --resolve-image always --prune ${stackName}"
}
