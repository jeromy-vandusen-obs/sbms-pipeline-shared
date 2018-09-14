// The following environment variables must have values before calling this method:
// - IMAGE_TAG
// - DISCOVERY_PORT
// - ADMIN_PORT
// - WEB_PORT
// - GREETING_PORT
// - MONGODB_DATA_PATH
// - MONGODB_PORT
// - NETWORK_NAME
def call(String swarmManager, String stackName) {
    sh "docker -H $swarmManager stack deploy --compose-file docker-compose.yml --resolve-image always --prune $stackName"
}
