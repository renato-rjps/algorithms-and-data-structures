package br.com.algorithms.caelum.ed;

public class Vector {

	private Object[] objects = new Object[100];
	private int totalObjects = 0;

	private void increaseSizeArray() {
		if (totalObjects == objects.length) {
			Object[] newObjectsArray = new Object[objects.length * 2];
			for (int i = 0; i < objects.length; i++) {
				newObjectsArray[i] = objects[i];
			}
			objects = newObjectsArray;
		}
	}

	public void add(Object object) {
		increaseSizeArray();
		objects[totalObjects] = object;
		totalObjects++;
	}

	public void add(int position, Object object) {
		increaseSizeArray();
		if (!this.validPosition(position)) {
			throw new IllegalArgumentException("Invalid Position!");
		}

		for (int i = this.totalObjects - 1; i >= position; i--) {
			this.objects[i + 1] = this.objects[i];
		}

		this.objects[position] = object;
		this.totalObjects++;
	}

	private boolean validPosition(int position) {
		return position >= 0 && position <= totalObjects;
	}

	public Object getObject(int position) {
		if (!this.occupiedPosition(position)) {
			throw new IllegalArgumentException("Invalid Position!");
		}
		return objects[position];
	}

	private boolean occupiedPosition(int position) {
		return position >= 0 && position < totalObjects;
	}

	public void remove(int position) {
		if (!this.occupiedPosition(position)) {
			throw new IllegalArgumentException("Invalid Position!");
		}

		for (int i = position; i < this.totalObjects - 1; i++) {
			this.objects[i] = this.objects[i + 1];
			this.objects[i + 1] = null;
		}

		this.totalObjects--;
	}

	public boolean contens(Object object) {
		for (int i = 0; i < totalObjects; i++) {
			if (object.equals(this.objects[i])) {
				return true;
			}
		}
		return false;
	}

	public int size() {
		return this.totalObjects;
	}

	@Override
	public String toString() {

		if (totalObjects == 0) {
			return "[]";
		}

		StringBuilder result = new StringBuilder("[");

		for (int i = 0; i < totalObjects - 1; i++) {
			result.append(objects[i]);
			result.append(", ");
		}
		result.append(objects[totalObjects - 1]);
		result.append("]");

		return result.toString();
	}

}
