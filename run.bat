@echo off
cd src
set /p filename=Enter file name: 

:: Remove .java if user added it
set filename=%filename:.java=%

javac -d ..\out %filename%.java
cd ..
java -cp out %filename%
pause