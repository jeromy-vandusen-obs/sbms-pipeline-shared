def call(String host, String stackName) {
    withEnv(["DOCKER_HOST=$host", "DOCKER_TLS_VERIFY=1", "DOCKER_CERT_PATH=/root/.tls"]) {
        sh "docker stack deploy --compose-file docker-compose.yml --resolve-image always --prune $stackName"
    }
}
