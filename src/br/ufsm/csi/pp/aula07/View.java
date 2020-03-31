package br.ufsm.csi.pp.aula07;

public class View {

    public static void main(String[] args) {

        Sabor baconEQueijo = new Sabor.Builder()
                .nome("Bacon e Queijo")
                .ingrediente(Sabor.Ingrediente.BACON)
                .ingrediente(Sabor.Ingrediente.QUEIJO_PARMESAO)
                .build();

        Sabor tresQueijos = new Sabor.Builder()
                .nome("Três Queijos")
                .ingrediente(Sabor.Ingrediente.QUEIJO_CHEDDAR)
                .ingrediente(Sabor.Ingrediente.QUEIJO_PARMESAO)
                .ingrediente(Sabor.Ingrediente.QUEIJO_PROVOLONE)
                .build();

        Pizza pizza = new Pizza.Builder()
                .tamanho(Pizza.Tamanho.MEDIA)
                .sabor(tresQueijos)
                .sabor(baconEQueijo)
                .build();

        Calzone calzone = new Calzone.Builder()
                .sabor(baconEQueijo)
                .build();

        imprimiPizza(pizza);
        imprimiCalzone(calzone);

    }

    public static void imprimiPizza(Pizza pizza) {
        System.out.println("\n=== Pizza ===");
        System.out.println("Tamanho: " + pizza.getTamanho().getNome());
        System.out.println("Sabores: ");
        for (Sabor sabor : pizza.getSabores()) {
            System.out.print("  + " + sabor.getNome() + ": ");
            for (Sabor.Ingrediente ingrediente : sabor.getIngredientes()) {
                System.out.print(ingrediente.getNome() + ", ");
            }
            System.out.println();
        }
    }

    public static void imprimiCalzone(Calzone calzone) {
        System.out.println("\n=== Calzone ===");
        System.out.print("Sabor: " + calzone.getSabor().getNome());
    }

}
