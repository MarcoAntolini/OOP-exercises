namespace Exceptions
{
    // TODO understand the functioning of this class
    public class FixedSizeQueue : IFixedSizeQueue
    {
        private object[] _items;
        private int _firstIndex = 0;
        private int _lastIndex = 0;
        
        public FixedSizeQueue(uint capacity)
        {
            Capacity = capacity;
            _items = new object[capacity];
        }
        
        public uint Capacity { get; }

        public uint Count => (uint) (_lastIndex - _firstIndex);

        public object GetFirst()
        {
            // TODO ensure objects can only be retrieve if the item is queue is not empty
            var first = _items[_firstIndex % Capacity];
            _firstIndex++;
            return first;
        }
        
        public void AddLast(object item)
        {
            // TODO ensure objects can only be inserted if the item is queue is not full
            _items[_lastIndex % Capacity] = item;
            _lastIndex++;
        }
    }
}