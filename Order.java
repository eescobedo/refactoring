public class Order {

    /**
     * Lista de ordenes, contendrá todas las ordenes que se ingresen.
     */
    private List<OrderLine> _orderLines;

    /**
     * Devuelve todas las ordenes almacenadas
     */
    public IEnumerable<OrderLine> OrderLines
    {
        get { return _orderLines; }
    }


    /**
     * Agrega una orden a la lista de ordenes.
     * @param orderLine
     */
    public void AddOrderLine(OrderLine orderLine)
    {
        _orderTotal += orderLine.Total;
        _orderLines.Add(orderLine);
    }


    /**
     * Elimina la orden del listado
     * @param orderLine
     */
    public void RemoveOrderLine(OrderLine orderLine)
    {
        orderLine = _orderLines.Find(o = > o == orderLine);

        if (orderLine == null) return;

        _orderTotal -= orderLine.Total
        _orderLines.Remove(orderLine);
    }
}
