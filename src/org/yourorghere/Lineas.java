
package org.yourorghere;

import com.sun.opengl.util.Animator;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author Noe Sosa
 */
public class Lineas extends JFrame{
    static GL gl;
    static GLU glu;
    
    public Lineas (){
        setTitle("Figura Proporcional");
        setSize(700, 700);
        //Instanciamos la clase Graphic
        GraphicListener listener = new GraphicListener();
        //Creamos el canvas
        GLCanvas canvas = new GLCanvas(new GLCapabilities());
        canvas.addGLEventListener(listener);
        getContentPane().add(canvas);
    } 
    
    public static void main (String args[]){
        Lineas frame = new Lineas();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
     public class GraphicListener implements GLEventListener{

        public void display(GLAutoDrawable arg0) {
           // Indicamos el tamaño en pixeles del grosor de la linea
           gl.glLineWidth(5);
           //Indicamos que vamos a iniciar a crear lineas
           gl.glBegin(GL.GL_LINES);
           
           int a=700;
            for(int i=-700; i<=0; i+=50){
                
                    //System.out.println(i);
                  gl.glColor3f(1,1,1);
                  gl.glVertex2d(i, a);      
                  gl.glVertex2d(0,a);
                  a=a-50;
               if(a==0){
                   a=700;
               }
                  
            }
            int b=700;
            for(int i=0; i<=700; i+=50){
                
                    //System.out.println(i);
                  gl.glColor3f(1,1,1);
                  gl.glVertex2d(0, b);      
                  gl.glVertex2d(b,b);
                  b=b-50;
               if(b==0){
                   b=700;
               }
                  
            }
            int c=0;
            for(int i=0; i<=700; i+=50){
                
                    //System.out.println(i);
                  gl.glColor3f(1,1,1);
                  gl.glVertex2d(0, c);      
                  gl.glVertex2d(c,c);
                  c=c-50;

                  
            }
            int d=700;
            for(int i=0; i<=700; i+=50){
                
                    //System.out.println(i);
                  gl.glColor3f(1,1,1);
                  gl.glVertex2d(0, -700+i);      
                  gl.glVertex2d(d,-700+i);
                  d=d-50;
               
                  
            }
            int e=-700;
            for(int i=0; i<=700; i+=50){
                
                    //System.out.println(i);
                  gl.glColor3f(1,1,1);
                  gl.glVertex2d(e, e);      
                  gl.glVertex2d(e,0);
                  e=e+50;
               if(e==-700){
                   e=0;
               }
                  
            }
            for(int i=0; i<=700; i+=50){
                
                    //System.out.println(i);
                  gl.glColor3f(1,1,1);
                  gl.glVertex2d(-700+i, 0);      
                  gl.glVertex2d(-700+i,700-i);     
                  
            }
            for(int i=0; i<=700; i+=50){
                
                    //System.out.println(i);
                  gl.glColor3f(1,1,1);
                  gl.glVertex2d(700-i, 0);      
                  gl.glVertex2d(700-i,700-i);     
                  
            }
            for(int i=0; i<=700; i+=50){
                
                    //System.out.println(i);
                  gl.glColor3f(1,1,1);
                  gl.glVertex2d(700-i, 0);      
                  gl.glVertex2d(700-i,-700+i);     
                  
            }
          
            //Deshabilitamos la creacion de lineas (de la maquina de estados )
           gl.glEnd();

           gl.glFlush();

        }

        public void init(GLAutoDrawable arg0) {
            glu = new GLU();
            gl = arg0.getGL();
            gl.glClearColor(0, 0, 0, 0);
            //Establecer los parametros para la proyeccion
            gl.glMatrixMode(gl.GL_PROJECTION);
            glu.gluOrtho2D(-700, 700, -700, 700);
        }

        public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {

        }

        public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {

        }

    }
}
