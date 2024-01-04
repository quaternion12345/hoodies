#!/bin/bash

REPOSITORY=/home/ec2-user/app
PROJECT_NAME=hoodies

echo "> Move Directory"
cd $REPOSITORY/$PROJECT_NAME

echo "> Git Pull"
git pull

echo "> BackEnd Build"
cd $REPOSITORY/$PROJECT_NAME/backend/Hoodies/
./gradlew build
cp $REPOSITORY/$PROJECT_NAME/backend/Hoodies/build/libs/*-SNAPSHOT.jar $REPOSITORY/$PROJECT_NAME/run/

echo "> FrontEnd Build"
cd $REPOSITORY/$PROJECT_NAME/frontend/Hoodies/
npm install --force
npm run build
npm install -g serve
cp $REPOSITORY/$PROJECT_NAME/frontend/Hoodies/build/ $REPOSITORY/$PROJECT_NAME/run/

echo "> TextFilter Build"
pip3 install -r $REPOSITORY/$PROJECT_NAME/textFilter/requirements.txt --no-cache-dir
cp $REPOSITORY/$PROJECT_NAME/textFilter/Smilegate_Hate_Speech_Detector.py $REPOSITORY/$PROJECT_NAME/run/