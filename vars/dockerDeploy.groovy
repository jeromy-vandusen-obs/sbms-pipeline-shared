def call(String stackName) {
    sh "docker stack deploy --compose-file docker-compose.yml --resolve-image always --prune $stackName"
}
