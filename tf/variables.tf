variable "aws_region" {
  default = "us-east-1"
}
variable "app-name" {
  default = "helloWorld"
}
variable "s3_bucket" {
  default = "helloworld-lambda-state"
}
variable "s3_artifact_bucket" {
  default = "helloworld-lambda-state"
}
#this key should never exist
variable "s3_artifact_key" {
  default = "bullyrooks/helloworld-lambda/helloworld-lambda-0.0.1-SNAPSHOT-aws.jar"
}
variable "dynamo_lock" {
  default = "helloworld-lambda-state-lock"
}
