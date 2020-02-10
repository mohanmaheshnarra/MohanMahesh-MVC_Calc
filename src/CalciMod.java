  
public class CalciMod {
	private int oper1=0;
	private int oper2=0;
    private int res=0;
	public int getOper1() {
		return oper1;
	}
	public void setOper1(int oper1) {
		this.oper1 = oper1;
	}
	public int getOper2() {
		return oper2;
	}
	public void setOper2(int oper2) {
		this.oper2 = oper2;
	}
	public void add() {
		res=this.oper1+this.oper2;
	}
	public void sub() {
		res=this.oper1-this.oper2;
	}
	public void mul() {
		res=this.oper1*this.oper2;
	}
	public void div() {
		res=this.oper1/this.oper2;
	}
	public int getRes() {
		return res;
	}
	public void setRes(int res) {
		this.res=res;
	}
}