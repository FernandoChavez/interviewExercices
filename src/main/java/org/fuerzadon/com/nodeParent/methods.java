package org.fuerzadon.com.nodeParent;

import org.w3c.dom.Node;

public class methods {

    private static boolean hasSameNameParentChild(Node node){
        /*
            if(node == null){
                return false;
            }
            for(Node child : node.children){
                if(child.name.equals(node.name)){
                    return true;
                }
                if(hasSameNameParentChild(child)){
                    return true;
                }
            }
        */
        return false;
    }
}
