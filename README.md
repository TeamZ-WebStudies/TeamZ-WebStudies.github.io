# TeamZ-WebStudies.github.io

Dieses Projekt ist nur für ein Hochschul Übungs Projekt der HTW-Berlin für Web-Entwicklung.

# Meilensteine

## Meilenstein 2

Link: https://teamz-webstudies.github.io/Meilenstein_2/index.html

# Videos konvertieren

Video Datei in den gängigen 3 Formaten für HTML zu konvertieren zu
können muss https://www.libav.org auf dem Gerät installiert sein.

```bash
$ avconv -i TeamZ_intro.mov -c:v libvpx -crf 10 -b:v 1M -c:a libvorbis -qscale:a 7 teamZ_intro.webm
$ avconv -i TeamZ_intro.mov -c:v libx264 -crf 28 -c:a aac -b:a 256k -strict experimental teamZ_intro.mp4
$ avconv -i TeamZ_intro.mov -c:v libtheora -qscale:v 7 -c:a libvorbis -qscale:a 7 TeamZ_intro.ogv
```
