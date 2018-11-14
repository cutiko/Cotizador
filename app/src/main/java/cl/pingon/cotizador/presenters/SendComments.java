package cl.pingon.cotizador.presenters;

import cl.pingon.cotizador.data.Nodes;

public class SendComments {

    public void fromUser(String key, String comments) {
        if (comments.replace(" ", "").length() == 0) return;
        new Nodes().comments(key).push().setValue(comments);
    }
}

