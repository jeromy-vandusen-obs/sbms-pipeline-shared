def call(String tag) {
    sh "docker pull jvandusen/sbms-discovery:${tag}"
    sh "docker pull jvandusen/sbms-admin:${tag}"
    sh "docker pull jvandusen/sbms-web:${tag}"
    sh "docker pull jvandusen/sbms-greeting:${tag}"
}
