pushd .
cd ../..
sbt "project scalechain-cli" "run-main io.scalechain.blockchain.cli.ScaleChainServer"
popd
