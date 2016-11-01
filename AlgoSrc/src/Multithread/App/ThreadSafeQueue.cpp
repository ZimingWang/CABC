class concurrent_queue
{
    private:
    std::queue<Data> the_queue;

    // 锁起来
    mutable boost::mutex the_mutex;


    boost::condition_variable the_condition_variable;



    public:
    void push(Data const& data)
    {
        // 锁
        boost::mutex::scoped_lock lock(the_mutex);
        the_queue.push(data);
        // 解锁
        lock.unlock();
        //通知
        the_condition_variable.notify_one();
    }

    bool empty() const
    {
        boost::mutex::scoped_lock lock(the_mutex);
        return the_queue.empty();
        // 结束之后自然释放?
    }

    bool try_pop(Data& popped_value)
    {
        boost::mutex::scoped_lock lock(the_mutex);
        if(the_queue.empty())
        {

            return false;
        }

        popped_value=the_queue.front();
        the_queue.pop();
        return true;
    }

    void wait_and_pop(Data& popped_value)
    {
        boost::mutex::scoped_lock lock(the_mutex);
        while(the_queue.empty())
        {
            // 读写同步
            the_condition_variable.wait(lock);
        }
        popped_value=the_queue.front();
        the_queue.pop();
    }

}