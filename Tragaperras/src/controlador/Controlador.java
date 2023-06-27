package controlador;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import vista.Vista;
import modelo.*;

public class Controlador implements ActionListener{
	
	Vista vista = new Vista();
	
	static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	static Usuario usuario = null;
	
	
	public Controlador(Vista vista){
		
		this.vista = vista;
		this.vista.btningresar.addActionListener(this);
		this.vista.btnRetirar.addActionListener(this);
		this.vista.cusuario.addActionListener(this);
		this.vista.btnIniciarSesion.addActionListener(this);
		this.vista.btntirar.addActionListener(this);
		this.vista.btncerrarsesion.addActionListener(this);
		this.vista.btnañadirtiradas.addActionListener(this);
		this.vista.rbtn1.addActionListener(this);
		this.vista.rbtn2.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == vista.rbtn1) {
			System.out.println("rbtn1 pulsado");
		}else if(e.getSource() == vista.rbtn2) {
			System.out.println("rbtn2 pulsado");
		}
			
		
		if(e.getSource() == vista.btningresar) {
			System.out.println("Boton ingresar");
			System.out.println("Saldo: " + usuario.getSaldo());
			System.out.println("saldo a añadir" + vista.textFieldañadir.getText());
			usuario.setSaldo(usuario.getSaldo()+Integer.parseInt(vista.textFieldañadir.getText()));
			
			
		}else if(e.getSource() == vista.btnRetirar) {
			System.out.println("Boton retirar");
			
			if(Integer.parseInt(this.vista.textFieldretirar.getText()) <= usuario.getSaldo()) {
				usuario.setSaldo(usuario.getSaldo()-Integer.parseInt(this.vista.textFieldretirar.getText()));
				System.out.println(usuario.toString());
			}else {
				System.out.println("No puedes retirar saldo");
			}
			
			
		}else if(e.getSource() == vista.cusuario) {
			System.out.println("Boton crear usuario");
			
			System.out.println(usuarios.isEmpty());
			//comprobar si esta vacia
			if(usuarios.isEmpty()) {
				System.out.println("La lista esta vacia, vamos a reyenarla");
				//creamos el usuario
				añadirUsuario();
			}else {
				System.out.println("La lista tiene usuarios registrados");
				boolean existe = false;
				//comprobar si existe el usuario
				for (int i = 0; i < usuarios.size(); i++) {
					
					if(usuarios.get(i).getNombre().equalsIgnoreCase(this.vista.textusuario.getText())) {
						
						System.out.println("El usuario"+this.vista.textusuario.getText()+" existe");
						this.vista.lblusuario.setText(this.vista.textusuario.getText()+" EXISTE");
						existe = true;
					}
	
				}
				
				if(!existe) {
					System.out.println("El usuario"+this.vista.textusuario.getText()+" No existe");
					//creamos el usuario
					añadirUsuario();
					existe = true;
				}
			}
		
		}else if(e.getSource() == vista.btnIniciarSesion) {
			boolean existe = false;
			if(usuarios.isEmpty()) {
				System.out.println("No hay ningun usuario registrado");
			}else {
				for (int i = 0; i < usuarios.size(); i++) {
					if(vista.textusuario.getText().equalsIgnoreCase(usuarios.get(i).getNombre()) && String.valueOf(this.vista.passwordField.getPassword()).equalsIgnoreCase(usuarios.get(i).getContraseña())) {
						System.out.println("Sesion iniciada, nombre de usuario y contraseña correctos");
						existe = true;
						
						//almacenamos el objeto usuario
						usuario = usuarios.get(i);
						this.vista.lblsaldo.setText("");
						this.vista.lblsaldo.setText(usuario.getSaldo()+"");
						this.vista.btningresar.setEnabled(true);
						this.vista.btncerrarsesion.setEnabled(true);
						this.vista.cusuario.setEnabled(false);
						this.vista.lbltiradas.setText(usuario.getTiradas()+"");
						if(usuarios.get(i).getSaldo() >= 1) {
							System.out.println("Puedes realizar una tirada");
							this.vista.textFieldañadir.setEnabled(true);
							this.vista.textFieldretirar.setEnabled(true);
							this.vista.btnRetirar.setEnabled(true);
							this.vista.spinner.setEnabled(true);
							this.vista.btnañadirtiradas.setEnabled(true);
						}else{
							System.out.println("No puedes comprar ninguna tiraada porque el saldo minimo es 1 euro");
							this.vista.btnRetirar.setEnabled(false);
							this.vista.textFieldretirar.setEnabled(false);
							this.vista.textFieldañadir.setEnabled(true);
							this.vista.btningresar.setEnabled(true);
							
						}
						
						if(usuario.getSaldo() > 0) {
							this.vista.btntirar.setEnabled(true);
						}else if(usuario.getSaldo() <= 0){
							this.vista.btntirar.setEnabled(false);
						}
					}
				}
				
				
				if(existe) {
					System.out.println("Existe");
				}else {
					System.out.println("No existe");
				}
				
			}
			
			
			
		}else if(e.getSource() == vista.btntirar) {
			
			ArrayList<String> objetos = new ArrayList<String>();
			objetos.add("limon");
			objetos.add("diamante");
			objetos.add("cereza");
			objetos.add("campana");
			objetos.add("corazon");
			
			
			int nlbl1 = 0, nlbl2 = 0, nlbl3= 0;
			String label1 = "", label2 = "",label3 = "";
			
			nlbl1 = (int)(Math.random()*objetos.size());
			nlbl2 = (int)(Math.random()*objetos.size());
			nlbl3 = (int)(Math.random()*objetos.size());

			label1 = objetos.get(nlbl1);
			label2 = objetos.get(nlbl2);
			label3 = objetos.get(nlbl3);

			
				this.vista.lbl1.setIcon(new ImageIcon(label1+".png"));
				this.vista.lbl2.setIcon(new ImageIcon(label2+".png"));
				this.vista.lbl3.setIcon(new ImageIcon(label3+".png"));
				
			System.out.println(label1 +"  "+ label2 +" "+ label3);
			
			if(label1.equalsIgnoreCase(label2) && label1.equalsIgnoreCase(label3) && label2.equalsIgnoreCase(label3)) {
				System.out.println("Has gandado el premio!!!!");
				if(label1.equalsIgnoreCase("limon")) {
					usuario.setSaldo(usuario.getSaldo()+2);
				}else if(label1.equalsIgnoreCase("diamante")) {
					usuario.setSaldo(usuario.getSaldo()+25);
				}else if(label1.equalsIgnoreCase("herradura")) {
					usuario.setSaldo(usuario.getSaldo()+10);
				}else if(label1.equalsIgnoreCase("trebol")) {
					usuario.setSaldo(usuario.getSaldo()+5);
				}else if(label1.equalsIgnoreCase("corazon")) {
					usuario.setSaldo(usuario.getSaldo()+50);
				}
			}
			
		}else if(e.getSource() == vista.btncerrarsesion) {
			
			this.vista.textFieldañadir.setEnabled(false);
			this.vista.textFieldretirar.setEnabled(false);
			this.vista.cusuario.setEnabled(true);
			this.vista.btncerrarsesion.setEnabled(false);
			usuario = null;
			
			for (int i = 0; i < usuarios.size(); i++) {
				System.out.println(usuarios.get(i));
			}
		}else if(e.getSource() == vista.btnañadirtiradas) {
			System.out.println("Boton añadir tiradas");
			
			int tiradas = (int) this.vista.spinner.getValue();
			System.out.println(tiradas);
			
			if(tiradas <= usuario.getSaldo()) {
				usuario.setTiradas(tiradas + usuario.getTiradas());
				usuario.setSaldo(usuario.getSaldo()-tiradas);
			}else {
				System.out.println("No puedes comprar esas tiradas porque superan su saldo");
			}
			
		}
			
	}

	private void añadirUsuario() {
		Usuario usuario = new Usuario();
		System.out.println(this.vista.textusuario.getText());
		System.out.println(this.vista.passwordField.getPassword());
		usuario.setContraseña(String.valueOf(this.vista.passwordField.getPassword()));
		usuario.setSaldo(Integer.parseInt(this.vista.textFieldsaldoinicial.getText()));
		usuario.setNombre(this.vista.textusuario.getText());
		usuarios.add(usuario);
		
		System.out.println("------------------------");
		System.out.println("recorremos todos los usuarios");
		for (int i = 0; i < usuarios.size(); i++) {
			System.out.println(usuarios.get(i).toString());
			
		}
		System.out.println("------------------------");
	}
}
