variable "aws_region" {
  default = "us-east-1"
}
variable "app-name" {
  default = "helloWorld"
}
variable "s3_bucket" {
  default = "helloworld-lambda-state"
}
variable "s3_key" {
  default = "global/s3/terraform.tfstate"
}
variable "dynamo_lock" {
  default = "helloworld-lambda-state-lock"
}
