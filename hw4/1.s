/* Data section */
	.section .data

	.type a, %object
a:
	.word 0

	.type b, %object
b:
	.word 0

	.type c, %object
c:
	.word 0



/* Text section */
	.section .text
	.globl main
	.type main,%function
main:
	mov ip, sp
	stmfd sp!, {r4-r10, fp, ip, lr, pc}
	sub fp, ip, #4

	ldr r0,=b
	str r1,[r0]
	ldr r2,=c
	str r3,[r2]
	add r0,r2,r0
	ldr r2,=a
	str r0,[r2]
	ldr r0,=b
	str r2,[r0]
	ldr r4,=a
	str r5,[r4]
	sub r0,r0,r4
	ldr r4,=c
	str r0,[r4]

	ldmea fp, {r4-r10, fp, sp, pc}
