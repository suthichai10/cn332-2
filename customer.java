
import java.util.Enumeration;
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sutic
 */
public class customer {
static private Vector myObs;
    static{
        myObs = new Vector();
    }
    public static void attach(observer o){
        myObs.addElement(o);
    }
    public static void datach(observer o){
        myObs.remove(o);
    }
    public String getState(){
        return null;
    }
    public void notifyObs(){
        for(Enumeration e = myObs.elements();
            e.hasMoreElement();){
                ((observer)e).update(this);
            }
    }
    
    
}
