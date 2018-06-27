#!/bin/bash
#to run tests, passing in cmd-line argument as test-name


java -cp .:classes:lib/junit-4.11.jar:test org.junit.runner.JUnitCore com.twu.biblioteca.$1