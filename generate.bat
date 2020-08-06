REM rmdir swagger /s /q
REM mkdir swagger
java -jar swagger-codegen.jar generate -i http://localhost:8080/v2/api-docs -o swagger -l java -c swagger-config.json
rmdir swagger\src\test /s /q