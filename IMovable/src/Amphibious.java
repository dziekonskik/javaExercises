public class Amphibious implements IAuto, IBoat {
    @Override
    public void Move() {
        IAuto.super.Move();
        IBoat.super.Move();
    }
}
