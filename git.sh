#!/usr/bin/env bash
echo "Start to publish..." $1 $2
git add .

if [ $2 ]
    then
    git commit -am $2
fi
git commit -am '1'

if [ $1 == 'push' ]
    then
    git pull origin master
    git push origin master
    else
    git pull origin master
fi
echo "Success";
