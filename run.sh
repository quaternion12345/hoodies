#!/bin/bash

REPOSITORY=/home/ec2-user/app
PROJECT_NAME=hoodies

echo "> Current Running Application Stop"
CURRENT_BPID=$(pgrep -f Hoodies-0.0.1-SNAPSHOT)

CURRENT_FPID=$(pgrep -f serve)

CURRENT_TPID=$(pgrep -f Smilegate_Hate_Speech_Detector)

if [ -n "$CURRENT_BPID" ]; then
  kill -15 $CURRENT_BPID
  sleep 5
fi

if [ -n "$CURRENT_FPID" ]; then
  kill -15 $CURRENT_FPID
  sleep 5
fi

if [ -n "$CURRENT_TPID" ]; then
  kill -15 $CURRENT_TPID
  sleep 5
fi

echo "> Run Applications in Background"
cd $REPOSITORY/$PROJECT_NAME/run

chmod +x *.jar *.py

nohup java -jar Hoodies-0.0.1-SNAPSHOT.jar 1>bout.txt 2>berr.txt &

nohup python3 Smilegate_Hate_Speech_Detector.py --noreload 1>tout.txt 2>terr.txt &

nohup serve -s build 1>fout.txt 2>ferr.txt &
