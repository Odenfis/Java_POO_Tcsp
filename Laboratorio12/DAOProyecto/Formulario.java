private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {                                             
        
        DaoProductosImpl producdao = new DaoProductosImpl();
        Productos produc = new Productos();
        
        int cod = Integer.parseInt(txtcodigo.getText());
        String nomb = txtnombre.getText();        
        int cant = (Integer) jspin1.getValue();
        double prec = Double.parseDouble(txtprecio.getText());
        
        produc.setCodigo(cod);
        produc.setNombre(nomb);
        produc.setCantidad(cant);
        produc.setPrecio(prec);
        
        try {
            producdao.registrar(produc);           
        } catch (Exception ex) {
            Logger.getLogger(Semana12App.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    } 
