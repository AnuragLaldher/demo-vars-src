def call() {

    echo "Running application tests..."

    sh '''
        npm test
    '''

    echo "Application tests completed successfully."
}
