#include <stdio.h>
#include <stdlib.h>

int x;
struct node *list, *tptr, *nptr, *head, *end, *newnode;
struct node
{
    int data;
    struct node *next1;
    struct node *next;
    struct node *prev;
};
struct stack
{
    int data;
    struct stack *next;
} *Top = -1;
struct queue
{
    int data;
    struct queue *ptr;
} * front, *rear, *temp, *front1;
struct stackdl
{
    int data;
    struct stackdl *next;
    struct stackdl *PREV;
} *TOP = -1;

int main()
{
    system("color BD");
    printf("\t\t--------------WELCOME TO OUR PROJECT----------------------\n\n");
    printf("\t\t============================================\n");
    printf("\t\tLINK LIST IMPLEMENTATION PROJECT BY TEAM DATA PIRATES\n");
    printf("\t\t============================================\n");
    printf("\t\t SINGLY LINKED LIST (1-14)\n");
    printf("\t\t ---------------------------\n");
    printf("\t 1. Create a singly linked List\n");
    printf("\t 2. Display singly link linked list\n");
    printf("\t 3. Insert a node at the beg of SL\n");
    printf("\t 4. Insert a node at the end of SL\n");
    printf("\t 5. Insert a node at any position of SL\n");
    printf("\t 6. Delete a node at beg of SL\n");
    printf("\t 7. Delete a node at end of SL\n");
    printf("\t 8. Delete a node at any pos of SL\n");
    printf("\t 9. Reverse the singly linked list:\n");
    printf("\t 10. Search a node from the singly linked list:\n");
    printf("\t 11. Stack PUSH operation using singly linked list:\n");
    printf("\t 12. Stack POP operation using singly linked list:\n");
    printf("\t 13. Queue ENQUEUE operation using singly linked list:\n");
    printf("\t 14. Queue DEQUEUE operation using singly linked list:\n\n");
    printf("\t\tDOUBLY LINKED LIST (15-28):\n");
    printf("\t\t--------------------------:\n");
    printf("\t\t 15. Create a Doubly linked List\n");
    printf("\t\t 16. Display Doubly link linked list\n");
    printf("\t\t 17. Insert a node at the beg of DL\n");
    printf("\t\t 18. Insert a node at the end of DL\n");
    printf("\t\t 19. Insert a node at the any position of DL\n");
    printf("\t\t 20. Delete a node at the beg of DL\n");
    printf("\t\t 21. Delete a node at the end of DL\n");
    printf("\t\t 22. Delete a node from any position of DL\n");
    printf("\t\t 23. Reverse the doubly linked list:\n");
    printf("\t\t 24. Search a node from the doubly linked list:\n");
    printf("\t\t 0. Exit\n");
    printf("\t\t--------------------------------------------\n");
    int choise = 1;
    while (choise != 0)
    {

        printf("\t\t\tEnter your choice : ");
        scanf("%d", &choise);
        switch (choise)
        {
        case 1:
            creatSLL();
            break;
        case 2:
            displaySll();
            break;
        case 3:
            InsertatbegSLL();
            break;
        case 4:
            insertatendSLL();
            break;
        case 5:
            insertatanyposSLL();
            break;
        case 6:
            deletebegSLL();
            break;
        case 7:
            deleteendSLL();
            break;
        case 8:
            deleteposSLL();
            break;
        case 9:
            reverseSLL();
            break;
        case 10:
            scearchSLL();
            break;
        case 11:
            push(1);
            push(2);
            push(3);
            push(4);
            push(5);
            push(7);
            printf("After PUSH :\n");
            displayStack();
            break;
        case 12:
            pop(1);
            printf("After POP :\n");
            displayStack();
            pop(2);
            printf("After POP :\n");
            displayStack();
            break;
        case 13:
            enq(42);
            enq(43);
            enq(44);
            printf("After ENQUEUE the list is:\n");
            displayQueue();
            break;
        case 14:
            deq();
            printf("After DEQUEUE the list is:\n");
            displayQueue();
            break;
        case 15:
            creatDLL();
            break;
        case 16:

            displayDLL();
            break;
        case 17:
            insertatbeg();
            break;
        case 18:
            insertatend();
            break;
        case 19:
            insertatpos();
            break;
        case 20:
            deletefrombeg();
            break;
        case 21:
            deletefromend();
            break;
        case 22:
            deleteFpos();
            break;
        case 23:
            reverseDLL();
            break;
        case 24:
            search();
            break;
       
        case 0:
            break;

        default:
            printf("\nInvalid Input (e.g 1)\n");
        }
    }
}
void creatSLL()
{
    int item, n, i;

    list = NULL;
    printf("Input number of node:");
    scanf("%d", &n);

    for (i = 0; i < n; i++)
    {
        printf("input data for node:");
        scanf("%d", &item);
        nptr = (struct node *)malloc(sizeof(struct node));
        nptr->data = item;
        nptr->next1 = NULL;
        if (list == NULL)
        {
            list = nptr;
            tptr = nptr;
        }
        else
        {
            tptr->next1 = nptr;
            tptr = nptr;
        }
    }
}
void displaySll()
{
    tptr = list;
    while (tptr != NULL)
    {
        printf("%d\n", tptr->data);
        tptr = tptr->next1;
    }
}
void InsertatbegSLL()
{
    int temp;
    struct node *newnode;
    newnode = (struct node *)malloc(sizeof(struct node));
    printf("Enter a data Which will inserted at beginning:");
    scanf("%d", &temp);
    if (newnode == NULL)
    {
        printf("Unable to allocate memory.");
    }

    else
    {
        newnode->data = temp;
        newnode->next1 = list;
        list = newnode;
    }
}
void insertatendSLL()
{
    int Num;
    struct node *newnode, *Temp;
    newnode = (struct node *)malloc(sizeof(struct node));
    printf("Enter a data Which will inserted at end:");
    scanf("%d", &Num);
    if (newnode == NULL)
    {
        printf("Unable to allocate memory.");
    }

    else
    {
        newnode->data = Num;
        newnode->next1 = NULL;
        Temp = list;
        while (Temp != NULL && Temp->next1 != NULL)
            Temp = Temp->next1;

        Temp->next1 = newnode;
    }
}
void insertatanyposSLL()
{
    int number, position, i;
    struct node *newnode, *TEMP;
    newnode = (struct node *)malloc(sizeof(struct node));
    printf("Enter a position :");
    scanf("%d", &position);
    printf("Enter a data:");
    scanf("%d", &number);
    newnode->data = number;
    TEMP = list;
    if (position == 1)
    {
        newnode->next1 = TEMP;
        list = newnode;
    }
    for (i = 1; i < position - 1; i++)
    {
        TEMP = TEMP->next1;
    }

    newnode->next1 = TEMP->next1;
    TEMP->next1 = newnode;
}
void deletebegSLL()
{
    struct node *deleteitem;

    if (list == NULL)
    {
        printf("List is empty.");
    }
    else
    {
        deleteitem = list;
        list = list->next1;
        free(deleteitem);
    }
}
void deleteendSLL()
{
    struct node *deletenum, *node;

    if (list == NULL)
    {
        printf("List is empty.");
    }
    else
    {
        deletenum = list;
        node = list;
        while (deletenum->next1 != NULL)
        {
            node = deletenum;
            deletenum = deletenum->next1;
        }

        if (deletenum == list)
        {
            list = NULL;
        }
        else
        {
            node->next1 = NULL;
        }
        free(deletenum);
    }
}
void deleteposSLL()
{
    int i, position;
    printf("Enter a position:");
    scanf("%d", &position);
    struct node *deletenum, *prevnode;
    deletenum = (struct node *)malloc(sizeof(struct node));

    if (list == NULL)
    {
        printf("List is empty.");
    }
    else
    {
        deletenum = list;
        prevnode = list;

        for (i = 2; i <= position; i++)
        {
            prevnode = deletenum;
            deletenum = deletenum->next1;

            if (deletenum == NULL)
                break;
        }

        if (deletenum != NULL)
        {
            if (deletenum == list)
                list = list->next;

            prevnode->next1 = deletenum->next1;
            deletenum->next1 = NULL;
            free(deletenum);
        }
    }
}
void reverseSLL()
{
    struct node *prevNode, *curNode;
    if (list != NULL)
    {
        prevNode = list;
        curNode = list->next1;
        list = list->next1;
        prevNode->next1 = NULL;
        while (list != NULL)
        {
            list = list->next1;
            curNode->next1 = prevNode;
            prevNode = curNode;
            curNode = list;
        }

        list = prevNode;
    }
}
void scearchSLL()
{
    int item;
    printf("Enter a number to search:");
    scanf("%d", &item);
    tptr = list;
    while (tptr->data != item && tptr->next1 != NULL)
    {
        tptr = tptr->next1;
    }
    if (tptr->data == item)
    {
        printf("Found at the list:");
    }
    else
    {
        printf("NOT FOUND:");
    }
}
void push(int item)
{
    struct stack *newNode = (struct stack *)malloc(sizeof(struct stack));
    newNode->data = item;
    newNode->next = Top;
    Top = newNode;
    printf("%d pushed to stack  \n", newNode->data);
}

void pop(int item)
{

    struct stack *temp;
    temp = Top;
    item = Top->data;
    Top = Top->next;
    free(temp);
    printf("%d poped out of stack  \n", item);
}
void displayStack()
{
    struct stack *temp;
    temp = Top;
    if (Top == -1)
    {
        printf("Stack is empty.\n");
    }
    else
    {
        while (temp != -1)
        {
            printf("%d\n", temp->data);
            temp = temp->next;
        }
    }
}
void enq(int x)
{
    if (rear == NULL)
    {
        rear = (struct queue *)malloc(1 * sizeof(struct queue));
        rear->ptr = NULL;
        rear->data = x;
        front = rear;
    }
    else
    {
        temp = (struct queue *)malloc(1 * sizeof(struct queue));
        rear->ptr = temp;
        temp->data = x;
        temp->ptr = NULL;

        rear = temp;
    }
}
void displayQueue()
{
    front1 = front;

    if ((front1 == NULL) && (rear == NULL))
    {
        printf("Queue is empty");
        return;
    }
    while (front1 != rear)
    {
        printf("%d\n ", front1->data);
        front1 = front1->ptr;
    }
    if (front1 == rear)
        printf("%d\n", front1->data);
}

void deq()
{
    front1 = front;

    if (front1 == NULL)
    {
        printf("\n empty queue");
    }
    else if (front1->ptr != NULL)
    {
        front1 = front1->ptr;
        printf("\n Dequed value is: %d\n", front->data);
        free(front);
        front = front1;
    }
    else
    {
        printf("\n Dequed value is : %d\n", front->data);
        free(front);
        front = NULL;
        rear = NULL;
    }
}
void creatDLL()
{
    head = NULL;
    end = NULL;
    int i, n, item;

    printf("Enter number of  node: ");
    scanf("%d", &n);
    for (i = 0; i < n; i++)
    {
        printf("Enter data:");
        scanf("%d", &item);
        newnode = (struct node *)malloc(sizeof(struct node));
        newnode->prev = NULL;
        newnode->data = item;
        newnode->next = NULL;

        if (head == NULL)
        {
            head = end = newnode;
        }
        else
        {
            end->next = newnode;
            newnode->prev = end;
            end = newnode;
        }
    }
}
void displayDLL()
{
    struct node *temp;
    temp = head;
    printf("\t\tthe list is:\n");
    while (temp != NULL)
    {
        printf(" %d\n", temp->data);
        temp = temp->next;
    }
}
void insertatbeg()
{
    int item;
    struct node *newnode;
    newnode = (struct node *)malloc(sizeof(struct node));
    printf("Enter a data to insert:");
    scanf("%d", &item);
    newnode->next = NULL;
    newnode->prev = NULL;
    newnode->data = item;
    head->prev = newnode;
    newnode->next = head;
    head = newnode;
}
void insertatend()
{
    int item;
    struct node *newnode;
    newnode = (struct node *)malloc(sizeof(struct node));
    printf("Enter a data to insert:");
    scanf("%d", &item);
    newnode->next = NULL;
    newnode->prev = NULL;
    newnode->data = item;
    end->next = newnode;
    newnode->prev = end;
    end = newnode;
}
void insertatpos()
{
    int pos, item, i = 1;
    printf("Enter position:");
    scanf("%d", &pos);
    if (pos == 1)
    {
        insertatbeg();
    }
    else
    {
        struct node *newnode, *temp;
        temp = head;
        newnode = (struct node *)malloc(sizeof(struct node));
        printf("Enter a data to insert:");
        scanf("%d", &item);
        newnode->data = item;
        while (i < pos - 1)
        {
            temp = temp->next;
            i++;
        }
        newnode->prev = temp;
        newnode->next = temp->next;
        temp->next = newnode;
        newnode->next->prev = newnode;
    }
}
void deletefrombeg()
{
    struct node *temp;
    if (head == NULL)
    {
        printf("The list is empty:");
    }
    else
    {
        temp = head;
        head = head->next;
        head->prev = NULL;
        free(temp);
    }
}
void deletefromend()
{
    struct node *temp;
    if (end == NULL)
    {
        printf("The list is empty:");
    }
    else
    {
        temp = end;
        end->prev->next = NULL;
        end = end->prev;
        free(temp);
    }
}
void deleteFpos()
{
    int pos, i = 1;
    struct node *temp;
    temp = head;
    printf("Enter a position:");
    scanf("%d", &pos);
    while (i < pos)
    {
        temp = temp->next;
        i++;
    }
    temp->prev->next = temp->next;
    temp->next->prev = temp->prev;
    free(temp);
}
void reverseDLL()
{
    struct node *current, *nextnode;
    current = head;
    while (current != NULL)
    {
        nextnode = current->next;
        current->next = current->prev;
        current->prev = nextnode;
        current = nextnode;
    }
    current = head;
    head = end;
    end = head;
}
void search()
{
    int pos = 0, item;
    struct node *current = NULL;
    printf("Enter an num to find:");
    scanf("%d", &item);

    if (head == NULL)
    {
        printf("Linked List is empty");
    }

    current = head;
    while (current != NULL)
    {
        pos++;
        if (current->data == item)
        {
            printf("%d found at position %d\n", item, pos);
            return;
        }

        if (current->next != NULL)
            current = current->next;
        else
            break;
    }

    printf("%d does not exist in the list\n", item);
}

void pushdl(int item)
{
    struct stackdl *newnode = (struct stackdl *)malloc(sizeof(struct stackdl));
    newnode->data = item;
    newnode->PREV = TOP;
    newnode->next = NULL;
    TOP = newnode;
    printf("%d pushed to stack  \n", newnode->data);
}
void popdl(int item)
{
    struct stackdl *temp1;
    temp1->next = NULL;
    temp1->data = TOP->PREV->data;
    temp1->PREV = TOP->PREV->PREV;
    free(TOP);
    TOP = temp;
    printf("%d poped out of stack  \n", item);
}
void displaySdll()
{
    struct stackdl *temp;
    printf("%d\n", temp->data);
    while (temp != -1)
    {
        printf("%d\n", temp->PREV->data);
        temp = temp->PREV;
    }
}