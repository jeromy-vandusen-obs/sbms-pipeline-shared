def call(String credentialsId = 'DOCKER_HUB_CREDENTIALS') {
    withCredentials([usernamePassword(credentialsId: credentialsId, usernameVariable: 'DOCKER_HUB_USERNAME', passwordVariable: 'DOCKER_HUB_PASSWORD')]) {
        mvn "dockerfile:push@version dockerfile:push@latest -DskipTests -Ddockerfile.username=$DOCKER_HUB_USERNAME -Ddockerfile.password=$DOCKER_HUB_PASSWORD"
    }
}
