# comet
Comet: An Extensible Distributed Key-Value Store

## Environment Setup
- OS
  - Ubuntu 14.04 x64
- pkg
  - eclipse openjdk-7-jdk openjdk-7-jre mininet git
- prepare
  - import comet project to eclipse
  - modify ...
  - export jar file from eclipse
  - select activedht/expt, activedht/kahlua/src, activedht/comet, activedht/dht, activedht/vuze
  - output to activedht/dist/comet.jar

## Usage
```zsh
cd {into your comet directory}
./runclass.sh {path of class} [options]
```
### Local
```zsh
./runclass.sh edu.washington.cs.activedht.expt.LuaDBBenchmark [options]
./runclass.sh edu.washington.cs.activedht.expt.LuaMicrobenchmark [options]
./runclass.sh edu.washington.cs.activedht.expt.LuaNodeLatencyMicrobenchmark [options]
./runclass.sh edu.washington.cs.activedht.expt.LuaNodeMicrobenchmark [options]
./runclass.sh edu.washington.cs.activedht.expt.LuaNodeWorkload [options]
./runclass.sh edu.washington.cs.activedht.expt.LuaNodeWorkloadLatency [options]
```
### Remote
```zsh
./runclass.sh edu.washington.cs.activedht.expt.Node [options]
./runclass.sh edu.washington.cs.activedht.expt.StoreLua [options]
./runclass.sh edu.washington.cs.activedht.expt.LifetimeGet [options]
```

## ActiveDB Experiment
- Startup a network through mininet with 4 hosts
  - 10.0.0.1
    - ```zsh
    ./runclass.sh edu.washington.cs.activedht.expt.Node -h 10.0.0.1 -p 1234 -b 10.0.0.1:1234
    ```
  - 10.0.0.2
    - ```zsh
    ./runclass.sh edu.washington.cs.activedht.expt.Node -h 10.0.0.2 -p 1234 -b 10.0.0.1:1234
    ```
  - 10.0.0.3
    - ```zsh
    ./runclass.sh edu.washington.cs.activedht.expt.Node -h 10.0.0.3 -p 1234 -b 10.0.0.1:1234
    ```
  - 10.0.0.4
    - ```zsh
    ./runclass.sh edu.washington.cs.activedht.expt.remote.StoreLua 10.0.0.1:1234 apps/object/replication.lua
    ./runclass.sh edu.washington.cs.activedht.expt.remote.LifetimeGet 10.0.0.1:1234 /tmp/logfile [payload]
    ```
