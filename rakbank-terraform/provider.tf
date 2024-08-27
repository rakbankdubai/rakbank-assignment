terraform {
  required_providers {
    aws = {
      source  = "hashicorp/aws"
      version = "~> 5.0"
      #version = ">= 5.61.0"
    }
  }
}


# Configure the AWS Provider
provider "aws" {
  region = "ap-south-1"
}
