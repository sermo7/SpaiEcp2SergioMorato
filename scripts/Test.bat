@echo off
set workspace=C:\Users\SErMO\Desktop\workspace\SpaiEcp2SergioMorato
set PATH=%PATH%C:\Program Files\Java\jdk1.8.0_60\bin;C:\Users\SErMO\Desktop\workspace\apache-maven-3.3.3-bin\apache-maven-3.3.3\bin
set JAVA_HOME=C:\Program Files\Java\jdk1.8.0_60
set M2_HOME=C:\Users\SErMO\Desktop\workspace\apache-maven-3.3.3-bin\apache-maven-3.3.3
echo -----------------------------------------
echo .(C) MIW
echo -----------------------------------------
echo .
echo Workspace --- %workspace%
echo .
cd %workspace%
echo ============ mvn clean test (profile: develop) =======================================================
echo .
call mvn clean test
pause