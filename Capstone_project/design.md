Option B: Hospital Emergency Room Triage (Priority Queues)

Real-World Context: Emergency Room Patient Management.
The Problem: Patients arrive with varying severity levels (e.g., 1 = Critical, 5 = Mild). Treating patients purely on a first-come, first-served basis endangers critical patients.
Core Challenge: Ensure critical patients are treated first, while handling ties and tracking wait times.

UML Class Design:

+---------------------------+
|          Patient          |
+---------------------------+
| - name: String            |
| - severity: int           |
| - arrivalTime: long       |
+---------------------------+
| + getName(): String       |
| + getSeverity(): int      |
| + getArrivalTime(): long  |
+---------------------------+
              |
              |
              |
+----------------------------------+
|           EmergencyRoom          |
+----------------------------------+
| - patientQueue: PriorityQueue    |
| - patientList: ArrayList         |
+----------------------------------+
| + addPatient(): void             |
| + processNextPatient(): Patient  |
| + updatePriority(): void         |
+----------------------------------+


Data Structure Selection:
I chose a Priority Queue because it is the key that determines the insertion and removal. This would make it easier for me to move the patients around depending on their key or severity level.

I chose an array list because it will make it easy to go through the list of patients. It also helps keep it organized. 

Big-O Expectations:

ArrayList--> O(n)
PriorityQueue--> O(log n) and O(n log n)
