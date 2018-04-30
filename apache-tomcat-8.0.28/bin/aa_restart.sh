#!/bin/sh

sh ab_kill_tomcat.sh

sh bb_remove_logs.sh

sh startup.sh

tail -f ../logs/catalina.out


