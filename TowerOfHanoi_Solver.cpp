#include <iostream>
void function(int disc, char t1, char t2, char t3)
{
    if (disc == 0)
    {
        return;
    }
    else
    {
        function(disc - 1,t1,t3,t2);
        std::cout << "Transfer disc from " << t1 << "to " << t2<<"\n";
        function(disc-1,t2,t1,t3);
    }
}
int main()
{
    int disc = 0;
    std::cout
        << "INPUT the number of discs=>";
    std::cin >> disc;
    function(disc, '1', '3', '2');
    return 0;
}