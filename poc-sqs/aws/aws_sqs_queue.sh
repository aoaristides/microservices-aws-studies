#!/bin/bash

echo ### Criando Queue(Standard) no SQS do LocalStack...
aws --endpoint http://localhost:4566 --profile localstack --region sa-east-1 sqs create-queue --queue-name myFirstQueue

## http://sqs.sa-east-1.localhost.localstack.cloud:4566/000000000000/myFirstQueue