terraform {
  required_providers {
    aws = {
      source  = "hashicorp/aws"
      version = "5.95.0"
    }
  }
  backend "s3" {
    bucket = "ecommerce-tf"
    key    = "terraform.tfstate"
    region = "us-east-1"
  }
}

provider "aws" {
  profile = "personal"
  region  = "us-east-1"
}