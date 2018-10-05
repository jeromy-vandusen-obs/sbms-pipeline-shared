def call(String host, String imageName, String sourceImageTag, String imageTag, String serviceName, String registryCredentialsId = 'DOCKER_HUB_CREDENTIALS', String registryUrl = '') {
    withEnv(["DOCKER_HOST=$host", "DOCKER_TLS_VERIFY=1", "DOCKER_CERT_PATH=/root/.tls"]) {
        sh "docker pull $imageName:$sourceImageTag"
        sh "docker tag $imageName:$sourceImageTag $imageName:$imageTag"
        withDockerRegistry([url: registryUrl, credentialsId: registryCredentialsId]) {
            sh "docker push $imageName:$imageTag"
        }
        sh "docker service update --image $imageName:$imageTag $serviceName"
    }
}
