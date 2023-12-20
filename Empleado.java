public class Empleado {
    public String Nombre;
    private double SalarioBase;

    public double GetSalarioBase() {
        return SalarioBase;
    }

    public void SetSalarioBase(double SalarioBase) {
        this.SalarioBase = SalarioBase;
    }

    public Empleado(String Nombre, double SalarioBase) {
        this.Nombre = Nombre;
        this.SalarioBase = SalarioBase;
    }

    public void CalcularSalario() {
        System.out.println("El salario base de los empleados es de: $" + SalarioBase);
    }

    public class Gerente extends Empleado {
        private double bono;

        public double GetBono() {
            return bono;
        }

        public void SetBono(double bono) {
            this.bono = bono;
        }

        public Gerente(String Nombre, double SalarioBase, double bono) {
            super(Nombre, SalarioBase);
            this.bono = bono;
        }

        @Override
        public void CalcularSalario() {
            System.out.println("El salario total del Gerente es de: $" + (GetSalarioBase() + bono));
        }
    }

    public class Desarrollador extends Empleado {
        private int horasExtras;

        public int GetHorasExtras() {
            return horasExtras;
        }

        public void SetHorasExtras(int horasExtras) {
            this.horasExtras = horasExtras;
        }

        public Desarrollador(String Nombre, double SalarioBase, int horasExtras) {
            super(Nombre, SalarioBase);
            this.horasExtras = horasExtras;
        }

        @Override
        public void CalcularSalario() {
            System.out.println("El salario total del Desarrollador es de: $" + ((20 * horasExtras) + GetSalarioBase()));
        }
    }

    public static void main(String[] args) {
        Empleado empleado = new Empleado("Empleado", 1000);
        Empleado.Gerente gerente = empleado.new Gerente("David", 1000, 500);
        Empleado.Desarrollador desarrollador = empleado.new Desarrollador("Mateo", 1000, 10);

        System.out.println("\t\t\tEmpresa EPN");
        empleado.CalcularSalario();
        gerente.CalcularSalario();
        desarrollador.CalcularSalario();
    }
}
