# PIS API consumer contract

## API client can run the generated stubs
```console
mvn clean install

mkdir stub-runner && cd stub-runner

wget -O stub-runner.jar 'https://search.maven.org/remotecontent?filepath=org/springframework/cloud/spring-cloud-contract-stub-runner-boot/2.0.1.RELEASE/spring-cloud-contract-stub-runner-boot-2.0.1.RELEASE.jar'

java -jar stub-runner.jar --stubrunner.ids="sinanaj.aldo:scc-demo:1.0-SNAPSHOT:stubs:8085" --stubrunner.stubsMode=LOCAL

curl http://localhost:8085/payments/sepa-credit-transfers/27e90ee3-7ca1-46dd-a78b-50842da07c4b
```