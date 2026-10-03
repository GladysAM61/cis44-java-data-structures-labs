/**
 *
 * @author gladysarias
 */
public class printer {
    
    private queue jobQueue;

    public printer() {
        // TODO: Initialize the jobQueue with a LinkedQueue
        
        //initializing the jobQueue with a linkedQueue 
        jobQueue = new linkedQueue<>();
    }

    /**
     * Adds a new print job to the rear of the queue.
     * @param job The print job to add.
     */
    public void addJob(printJob job) {
        System.out.println("Adding to queue: " + job);
        // TODO: Enqueue the job
        jobQueue.enqueue(job);
    }

    /**
     * Processes the job at the front of the queue.
     */
    public void processNextJob() {
        // TODO: Check if the queue is empty. If so, print a message.
        
        // first checking it its empty
        if (jobQueue.isEmpty()) {
            System.out.println("The printer queue is empty. No jobs to process.");
        } else {
            // If not empty, then print out "proccessing" and making a new variable called printJob
            //passing an object 
            printJob job = (printJob) jobQueue.dequeue();
            
            System.out.println("Processing: " + job);
        }  
       
    }

    public static void main(String[] args) {
        printer officePrinter = new printer();

        officePrinter.addJob(new printJob("Annual_Report.pdf", 25));
        officePrinter.addJob(new printJob("Meeting_Agenda.docx", 2));
        officePrinter.addJob(new printJob("Presentation_Slides.pptx", 30));

        System.out.println("\n--- Starting to Print ---");
        officePrinter.processNextJob(); // Should print Annual_Report.pdf
        officePrinter.processNextJob(); // Should print Meeting_Agenda.docx

        System.out.println("\nNew high-priority job arrives...");
        officePrinter.addJob(new printJob("Urgent_Memo.pdf", 1));

        officePrinter.processNextJob(); // Should print Presentation_Slides.pptx
        officePrinter.processNextJob(); // Should print Urgent_Memo.pdf
        officePrinter.processNextJob(); // Should say the queue is empty
    }
    
}
