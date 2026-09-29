@echo off

echo Subindo a aplicacao...
echo.

docker pull loesterbotelho/debugging:1.0.0
docker run --rm -it loesterbotelho/debugging:1.0.0

# REM Não funciona direito em apps console
# REM docker compose up

echo.
echo Processo concluido!
pause