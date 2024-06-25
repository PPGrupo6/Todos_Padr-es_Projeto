// Visitor que define os métodos para visitar cada tipo de item
public interface Visitor {
    void visitor(ItemNormal item);
    void visitor(ItemFragil item);
    void visitor(ItemPesado item);
}
