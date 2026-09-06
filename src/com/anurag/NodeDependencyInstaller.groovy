package com.anurag

class NodeDependencyInstaller implements Serializable {

    def script

    NodeDependencyInstaller(script) {
        this.script = script
    }

    def install() {

        script.echo "Installing Node.js dependencies..."

        script.sh '''
            npm install
        '''

        script.echo "Node.js dependencies installed successfully."
    }
}
