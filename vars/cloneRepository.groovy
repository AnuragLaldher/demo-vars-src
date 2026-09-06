def call(String repositoryUrl, String branch = 'main') {

    echo "Cloning repository: ${repositoryUrl}"
    echo "Branch: ${branch}"

    checkout([
        $class: 'GitSCM',
        branches: [[name: "*/${branch}"]],
        userRemoteConfigs: [[
            url: repositoryUrl
        ]]
    ])

    echo "Repository cloned successfully."
}
