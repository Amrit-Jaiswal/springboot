steps to generate keystore:
1. Open command prompt
2. Type following command to generate keystore
keytool -genkey -alias https-example -storetype JKS  -keyalg RSA -keysize 2048 -validity 365 -keystore https-example.jks


URL to access (end points):
https://localhost:8081/hello/amrit