

LIB2=$CATALINA_HOME/profile/lib

JAVA_OPTS="$JAVA_OPTS -Xdebug -Xrunjdwp:transport=dt_socket,address=8787,server=y,suspend=n"
JAVA_OPTS="$JAVA_OPTS -XX:PermSize=128m -XX:MaxPermSize=256m -Xms128m -Xmx8192m"
#JAVA_OPTS="$JAVA_OPTS -javaagent:$LIB2/profile.jar -Dprofile.properties=$LIB2/webapp.profile.properties"


#JAVA_OPTS="$JAVA_OPTS -verbose:class"

JAVA_OPTS="$JAVA_OPTS -Dcom.sun.management.jmxremote -Dcom.sun.management.jmxremote.port=9191 -Dcom.sun.management.jmxremote.authenticate=false -Dcom.sun.management.jmxremote.ssl=false -Djava.rmi.server.hostname=127.0.0.1"


