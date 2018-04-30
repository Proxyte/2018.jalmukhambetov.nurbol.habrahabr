#!/bin/sh

. java_home.sh

sh ab_kill_tomcat.sh

sh bb_remove_logs.sh

sh startup.sh

tail -f ../logs/catalina.out &
TAIL_PID=$!

while ! grep "INFO: Server startup in" ../logs/catalina.out > /dev/null ; do sleep 1 ; done

kill $TAIL_PID


