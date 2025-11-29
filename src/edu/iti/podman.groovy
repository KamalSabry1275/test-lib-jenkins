package edu.iti;

def build(imageName,imageTag){
    sh 'podman build -t ${imageName}:${imageTag} .'
}