public void usarPato (String habitat) {
    if (habitat.equals("nieve")) {
        PatoMallard pato = new PatoMallard();
        pato.quack();
    }
    else if (habitat.equals("pantano")) {
        PatoCollar pato = new PatoCollar();
        pato.quack();
    } 
    else if (habitat.equals("lago")) {
        PatoDomestico pato = new PatoDomestico();
        pato.quack();
    }
    else if (habitat.equals("bañera")) {
        PatoGomapato = new PatoGoma();
        pato.quack();
    }
}

public void usarPato (String habitat) {
    Pato pato = crearPato();

    pato.quack();
}

public Pato crearPato () {
    if (habitat.equals("nieve")) {
        PatoMallard pato = new PatoMallard();
    }
    else if (habitat.equals("pantano")) {
        PatoCollar pato = new PatoCollar();
    } 
    else if (habitat.equals("lago")) {
        PatoDomestico pato = new PatoDomestico();
    }
    else if (habitat.equals("bañera")) {
        PatoGomapato = new PatoGoma();

}

