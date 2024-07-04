terraform {
  backend "s3" {
    bucket         = "rak-bank-tfstate-bucket"
    key            = "terraform/state/eks-cluster/terraform.tfstate"
    region         = "us-west-1"
    encrypt        = true
    dynamodb_table = "rakbank--tf-lock-table"
  }
}
