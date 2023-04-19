package com.example.wordlegame;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Keyboard {
    private Button a;
    private Button b;
    private Button c;
    private Button d;
    private Button e;
    private Button f;
    private Button g;
    private Button h;
    private Button i;
    private Button j;
    private Button k;
    private Button l;
    private Button m;
    private Button n;
    private Button o;
    private Button p;
    private Button q;
    private Button r;
    private Button s;
    private Button t;
    private Button u;
    private Button v;
    private Button w;
    private Button x;
    private Button y;
    private Button z;
    private Button enter;
    private Button backSpace;
    private HBox rowOne;
    private HBox rowTwo;
    private HBox rowThree;
    private VBox collection;

    public Keyboard() {
        a = new Button("A");
        a.setFocusTraversable(false);
        b = new Button("B");
        b.setFocusTraversable(false);
        c = new Button("C");
        c.setFocusTraversable(false);
        d = new Button("D");
        d.setFocusTraversable(false);
        e = new Button("E");
        e.setFocusTraversable(false);
        f = new Button("F");
        f.setFocusTraversable(false);
        g = new Button("G");
        g.setFocusTraversable(false);
        h = new Button("H");
        h.setFocusTraversable(false);
        i = new Button("I");
        i.setFocusTraversable(false);
        j = new Button("J");
        j.setFocusTraversable(false);
        k = new Button("K");
        k.setFocusTraversable(false);
        l = new Button("L");
        l.setFocusTraversable(false);
        m = new Button("M");
        m.setFocusTraversable(false);
        n = new Button("N");
        n.setFocusTraversable(false);
        o = new Button("O");
        o.setFocusTraversable(false);
        p = new Button("P");
        p.setFocusTraversable(false);
        q = new Button("Q");
        q.setFocusTraversable(false);
        r = new Button("R");
        r.setFocusTraversable(false);
        s = new Button("S");
        s.setFocusTraversable(false);
        t = new Button("T");
        t.setFocusTraversable(false);
        u = new Button("U");
        u.setFocusTraversable(false);
        v = new Button("V");
        v.setFocusTraversable(false);
        w = new Button("W");
        w.setFocusTraversable(false);
        x = new Button("X");
        x.setFocusTraversable(false);
        y = new Button("Y");
        y.setFocusTraversable(false);
        z = new Button("Z");
        z.setFocusTraversable(false);
        enter = new Button("Enter");
        enter.setFocusTraversable(false);
        enter.setStyle("-fx-focus-color: transparent");
        backSpace = new Button("Delete");
        backSpace.setFocusTraversable(false);
        rowOne = new HBox(10, q, w, e, r, t, y, u, i, o, p);
        rowOne.setAlignment(Pos.CENTER);
        rowTwo = new HBox(10, a, s, d, f, g, h, j, k, l);
        rowTwo.setAlignment(Pos.CENTER);
        rowThree = new HBox(10, enter, z, x, c, v,b ,n, m, backSpace);
        rowThree.setAlignment(Pos.CENTER);
        collection = new VBox(10, rowOne, rowTwo, rowThree);
        collection.setAlignment(Pos.CENTER);
    }

    public VBox getCollection() {
        return collection;
    }

    public Button getA() {
        return a;
    }
    public Button getB() { return b; }
    public Button getC() { return c; }
    public Button getD() { return d; }
    public Button getE() { return e; }
    public Button getF() { return f; }
    public Button getG() { return g; }
    public Button getH() { return h; }
    public Button getI() { return i; }
    public Button getJ() { return j; }
    public Button getK() { return k; }
    public Button getL() { return l; }
    public Button getM() { return m; }
    public Button getN() { return n; }
    public Button getO() { return o; }
    public Button getP() { return p; }
    public Button getQ() { return q; }
    public Button getR() { return r; }
    public Button getS() { return s; }
    public Button getT() { return t; }
    public Button getU() { return u; }
    public Button getV() { return v; }
    public Button getW() { return w; }
    public Button getX() { return x; }
    public Button getY() { return y; }
    public Button getZ() { return z; }
    public Button getEnter() { return enter; }
    public Button getBackSpace() { return backSpace; }
}
