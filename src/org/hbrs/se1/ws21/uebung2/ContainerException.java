package org.hbrs.se1.ws21.uebung2;

class ContainerException extends Exception{
    public ContainerException(Integer id){
        super("Das Member-Objekt mit der ID " + id + " ist bereits vorhanden");
    }
}
