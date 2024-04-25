FROM tomcat:10

COPY DimMoneyAppRM552579.war /usr/local/tomcat/webapps/

EXPOSE 8080

WORKDIR /usr/local/tomcat/webapps
