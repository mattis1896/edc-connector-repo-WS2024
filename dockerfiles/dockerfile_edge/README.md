# Dockerfile for EDC in a Docker Image

This document explains how to build and run a Docker container that encapsulates an EDC.

## Build Command

```bash
docker build -t <username>/edc:edge .
```

## Run command
```bash
docker run --dns=8.8.8.8 --net=host --name edge -w /workspace -it <edge>/edc:edge
```
