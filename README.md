# e2e (WebDriver) tests

## Running tests
To run all tests use:
```
mvn clean verify
```
Make sure that you have test environment properly configured.

## Setting up test environment

### Running docker containers via docker-compose
```
docker-compose up/down/start/stop
```
### Running docker containers individually
```
docker run -d -p 4444:4444 --restart=always --name selenium-hub selenium/hub:3.10.0
docker run -d -p 5900:5900 --restart=always --shm-size=2g --name selenium-firefox --link selenium-hub:hub selenium/node-firefox-debug:3.10
```
Container version depends on serenity version. For serenity 1.9.4 it's 3.10.0
You can connect to node container desktop via VNC (on port 5900), for example [TightVNC](https://www.tightvnc.com/download.php) (during installation select only viewer).

## Tests results

### Serenity report

Serenity report is accessible via ```index.html``` on ```target/site/serenity```.

