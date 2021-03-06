@if "%DEBUG%" == "" @echo off
@rem ##########################################################################
@rem
@rem  triathlon-app startup script for Windows
@rem
@rem ##########################################################################

@rem Set local scope for the variables with windows NT shell
if "%OS%"=="Windows_NT" setlocal

set DIRNAME=%~dp0
if "%DIRNAME%" == "" set DIRNAME=.
set APP_BASE_NAME=%~n0
set APP_HOME=%DIRNAME%..

@rem Add default JVM options here. You can also use JAVA_OPTS and TRIATHLON_APP_OPTS to pass JVM options to this script.
set DEFAULT_JVM_OPTS=

@rem Find java.exe
if defined JAVA_HOME goto findJavaFromJavaHome

set JAVA_EXE=java.exe
%JAVA_EXE% -version >NUL 2>&1
if "%ERRORLEVEL%" == "0" goto init

echo.
echo ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH.
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:findJavaFromJavaHome
set JAVA_HOME=%JAVA_HOME:"=%
set JAVA_EXE=%JAVA_HOME%/bin/java.exe

if exist "%JAVA_EXE%" goto init

echo.
echo ERROR: JAVA_HOME is set to an invalid directory: %JAVA_HOME%
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:init
@rem Get command-line arguments, handling Windows variants

if not "%OS%" == "Windows_NT" goto win9xME_args

:win9xME_args
@rem Slurp the command line arguments.
set CMD_LINE_ARGS=
set _SKIP=2

:win9xME_args_slurp
if "x%~1" == "x" goto execute

set CMD_LINE_ARGS=%*

:execute
@rem Setup the command line

set CLASSPATH=%APP_HOME%\lib\triathlon-app-1.0-SNAPSHOT.jar;%APP_HOME%\lib\postgresql-42.2.10.jre7.jar;%APP_HOME%\lib\spring-data-jpa-2.2.4.RELEASE.jar;%APP_HOME%\lib\spring-context-5.2.3.RELEASE.jar;%APP_HOME%\lib\hibernate-core-5.4.12.Final.jar;%APP_HOME%\lib\log4j-core-2.13.0.jar;%APP_HOME%\lib\log4j-api-2.13.0.jar;%APP_HOME%\lib\spring-aspects-4.3.26.RELEASE.jar;%APP_HOME%\lib\aspectjweaver-1.9.5.jar;%APP_HOME%\lib\aspectjrt-1.9.5.jar;%APP_HOME%\lib\spring-aop-5.2.3.RELEASE.jar;%APP_HOME%\lib\spring-data-commons-2.2.4.RELEASE.jar;%APP_HOME%\lib\spring-orm-5.2.3.RELEASE.jar;%APP_HOME%\lib\spring-jdbc-5.2.3.RELEASE.jar;%APP_HOME%\lib\spring-tx-5.2.3.RELEASE.jar;%APP_HOME%\lib\spring-beans-5.2.3.RELEASE.jar;%APP_HOME%\lib\spring-expression-5.2.3.RELEASE.jar;%APP_HOME%\lib\spring-core-5.2.3.RELEASE.jar;%APP_HOME%\lib\slf4j-api-1.7.26.jar;%APP_HOME%\lib\hibernate-commons-annotations-5.1.0.Final.jar;%APP_HOME%\lib\jboss-logging-3.3.2.Final.jar;%APP_HOME%\lib\javax.persistence-api-2.2.jar;%APP_HOME%\lib\javassist-3.24.0-GA.jar;%APP_HOME%\lib\byte-buddy-1.10.7.jar;%APP_HOME%\lib\antlr-2.7.7.jar;%APP_HOME%\lib\jboss-transaction-api_1.2_spec-1.1.1.Final.jar;%APP_HOME%\lib\jandex-2.1.1.Final.jar;%APP_HOME%\lib\classmate-1.5.1.jar;%APP_HOME%\lib\jaxb-runtime-2.3.1.jar;%APP_HOME%\lib\jaxb-api-2.3.1.jar;%APP_HOME%\lib\javax.activation-api-1.2.0.jar;%APP_HOME%\lib\dom4j-2.1.1.jar;%APP_HOME%\lib\spring-jcl-5.2.3.RELEASE.jar;%APP_HOME%\lib\txw2-2.3.1.jar;%APP_HOME%\lib\istack-commons-runtime-3.0.7.jar;%APP_HOME%\lib\stax-ex-1.8.jar;%APP_HOME%\lib\FastInfoset-1.2.15.jar

@rem Execute triathlon-app
"%JAVA_EXE%" %DEFAULT_JVM_OPTS% %JAVA_OPTS% %TRIATHLON_APP_OPTS%  -classpath "%CLASSPATH%" com.silviucanton.App %CMD_LINE_ARGS%

:end
@rem End local scope for the variables with windows NT shell
if "%ERRORLEVEL%"=="0" goto mainEnd

:fail
rem Set variable TRIATHLON_APP_EXIT_CONSOLE if you need the _script_ return code instead of
rem the _cmd.exe /c_ return code!
if  not "" == "%TRIATHLON_APP_EXIT_CONSOLE%" exit 1
exit /b 1

:mainEnd
if "%OS%"=="Windows_NT" endlocal

:omega
