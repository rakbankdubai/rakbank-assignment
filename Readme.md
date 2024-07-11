# Rakbank Assignment


This repository contains the necessary configurations and scripts for deploying a sample application to an AWS EKS cluster using Helm.

## Table of Contents
- [Prerequisites](#prerequisites)
- [Setup](#setup)
- [Deployment](#deployment)
- [Clean Up](#clean-up)
- [Usage](#usage)

## Prerequisites
- AWS CLI
- kubectl
- Helm
- AWS account with appropriate permissions to create resources
- An EKS cluster

## Setup
1. **Clone the repository:**
    ```sh
    git clone https://github.com/rakbankdubai/rakbank-assignment.git
    cd rakbank-assignment
    ```

2. **Configure AWS CLI:**
    Ensure your AWS CLI is configured with the necessary credentials:
    ```sh
    aws configure
    ```

3. **Update kubeconfig for EKS:**
    Replace `<region>` and `<cluster-name>` with your actual EKS region and cluster name.
    ```sh
    aws eks --region <region> update-kubeconfig --name <cluster-name>
    ```

## Deployment

### Using Makefile
1. **Package the Helm chart:**
    ```sh
    make package
    ```

2. **Deploy the application:**
    ```sh
    make install
    ```

3. **Verify the deployment:**
    ```sh
    kubectl get all
    ```

### Manual Steps
1. **Package the Helm chart:**
    ```sh
    cd rakbankhelm
    helm package .
    cd ..
    ```

2. **Deploy the application:**
    ```sh
    helm install rakbank ./rakbankhelm-*.tgz
    ```

3. **Verify the deployment:**
    ```sh
    kubectl get all
    ```

## Clean Up

### Using Makefile
1. **Uninstall the application:**
    ```sh
    make uninstall
    ```

2. **Clean up packaged files:**
    ```sh
    make clean
    ```

### Manual Steps
1. **Uninstall the application:**
    ```sh
    helm uninstall rakbank
    ```

## Usage
- **Accessing the application:**
  After deployment, you can access the application using the external IP of the service or through the configured ingress.

## Files and Directories
- **rakbankhelm/**: Contains the Helm chart for deploying the application.
- **Makefile**: Contains automation scripts for common tasks.
- **README.md**: This file.


