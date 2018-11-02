package requests.halt

import org.maestro.agent.base.AbstractHandler
import org.maestro.client.MaestroReceiverClient

class HaltHandler extends AbstractHandler {

    @Override
    Object handle() {
        MaestroReceiverClient receiverClient = (MaestroReceiverClient) this.getClient()
        receiverClient.replyOk(getNote())

        return null
    }
}