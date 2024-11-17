package sub02;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * 날짜 : 2024/07/17
 * 이름 : 하진희
 * 내용 : Stack Queue 실습하기
 */
public class StackQueueTest {
	public static void main(String[] args) {
		
		// stack => 후입선출
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		
		while(!stack.empty()) {
			System.out.print(stack.pop()+", ");
		}
		
		
		System.out.println();
		
		
		//큐  => 선입선출
		Queue<Integer> que = new LinkedList<>();
		
		que.offer(1);
		que.offer(2);
		que.offer(3);
		que.offer(4);
		que.offer(5);
		
		
		
		while (!que.isEmpty()) {
			System.out.print(que.poll()+", ");
		}
	}

}
