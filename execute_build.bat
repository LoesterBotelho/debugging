@echo off
setlocal

call "./env.bat"

echo.
echo ==========================================
echo Building Docker image
echo Image: %IMAGE%
echo ==========================================
echo.

docker build -t %IMAGE% .

if %ERRORLEVEL% NEQ 0 (
    echo.
    echo ==========================================
    echo Docker build failed!
    echo ==========================================
    pause
    exit /b 1
)

echo.
echo Docker build completed successfully!
echo Image: %IMAGE%

pause
endlocal