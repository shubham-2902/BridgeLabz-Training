package linkedlist.circularlinkedlist.roundrobinschedulingalgo;

public class RoundRobinScheduler {

    private ProcessNode head = null;
    private ProcessNode tail = null;

    /* Add Process at End */
    public void addProcess(int pid, int burstTime, int priority) {
        ProcessNode newNode = new ProcessNode(pid, burstTime, priority);

        if (head == null) {
            head = tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            newNode.next = head;
            tail = newNode;
        }
    }

    //Remove Process by ID */
    private void removeProcess(ProcessNode prev, ProcessNode current) {

        if (current == head && current == tail) {
            head = tail = null;
        } else if (current == head) {
            head = head.next;
            tail.next = head;
        } else if (current == tail) {
            tail = prev;
            tail.next = head;
        } else {
            prev.next = current.next;
        }
    }

    /*  Display Processes */
    public void displayProcesses() {
        if (head == null) {
            System.out.println("No processes in queue.");
            return;
        }

        ProcessNode temp = head;
        do {
            System.out.println("P" + temp.processId +
                    " | Burst: " + temp.burstTime +
                    " | Priority: " + temp.priority);
            temp = temp.next;
        } while (temp != head);
    }

    /*  Round Robin Simulation */
    public void simulate(int timeQuantum) {

        if (head == null) {
            System.out.println("No processes to schedule.");
            return;
        }

        int currentTime = 0;
        int completed = 0;
        int totalWaiting = 0;
        int totalTurnaround = 0;

        ProcessNode current = head;
        ProcessNode prev = tail;

        System.out.println("\n--- Round Robin Scheduling ---");

        while (head != null) {

            System.out.println("\nExecuting Process P" + current.processId);

            if (current.burstTime > timeQuantum) {
                current.burstTime -= timeQuantum;
                currentTime += timeQuantum;
            } else {
                currentTime += current.burstTime;
                current.burstTime = 0;

                current.turnaroundTime = currentTime;
                current.waitingTime =
                        current.turnaroundTime - (current.waitingTime + timeQuantum);

                totalWaiting += current.waitingTime;
                totalTurnaround += current.turnaroundTime;
                completed++;

                System.out.println("Process P" + current.processId + " completed.");

                removeProcess(prev, current);
                current = prev.next;
                continue;
            }

            prev = current;
            current = current.next;

            System.out.println("Queue after this round:");
            displayProcesses();
        }

        System.out.println("\n--- Scheduling Completed ---");
        System.out.println("Average Waiting Time: " +
                (double) totalWaiting / completed);
        System.out.println("Average Turnaround Time: " +
                (double) totalTurnaround / completed);
    }
}