def call(String imageName, String sourceImageTag, String imageTag, String serviceName, String registryCredentialsId = 'DOCKER_HUB_CREDENTIALS', String registryUrl = '') {
    sh "docker pull $imageName:$sourceImageTag"
    sh "docker tag $imageName:$sourceImageTag $imageName:$imageTag"
    withDockerRegistry([url: registryUrl, credentialsId: registryCredentialsId]) {
        sh "docker push $imageName:$imageTag"
    }
    sh "docker service update --image $iamgeName:$imageTag $serviceName"
}
