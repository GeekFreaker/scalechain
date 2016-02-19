package io.scalechain.blockchain.api.command.wallet.p1

import io.scalechain.blockchain.api.command.RpcCommand
import io.scalechain.blockchain.api.domain.{RpcRequest, RpcResult}

/*
  Json-RPC request :

  Json-RPC response :

*/

/** ImportWallet: imports private keys from a file in wallet dump file format (see the dumpwallet RPC).
  * These keys will be added to the keys currently in the wallet.
  * This call may need to rescan all or parts of the block chain for transactions affecting the newly-added keys,
  * which may take several minutes.
  *
  * https://bitcoin.org/en/developer-reference#importwallet
  */
object ImportWallet extends RpcCommand {
  def invoke(request : RpcRequest ) : RpcResult = {
    // TODO : Implement
    assert(false)
    null
  }
}

