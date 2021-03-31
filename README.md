# runeemon-cargo

mvn clean package cargo:run -Ppayara

http://localhost:8080/ping/ping

## TODO

 * when shutting down with ctrl-c: works, but also results in output "No domains are currently running"
 * download also possible with cargo plugin (instead of maven dependency plugin)?
 * latest cargo version for wildfly: 23.x; latest wildfly version: 25.x
 * zipUrlInstaller: double directory for wildfly