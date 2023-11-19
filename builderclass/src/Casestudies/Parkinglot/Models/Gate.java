package Casestudies.Parkinglot.Models;

import java.util.List;

public class Gate extends BaseModel {
    private int gateNumber;
    private GateStatus gateStatus;
    private GateType gateType;
    private List<Operators> operator;

    public int getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(int gateNumber) {
        this.gateNumber = gateNumber;
    }

    public GateStatus getGateStatus() {
        return gateStatus;
    }

    public void setGateStatus(GateStatus gateStatus) {
        this.gateStatus = gateStatus;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    public List<Operators> getOperator() {
        return operator;
    }

    public void setOperator(List<Operators> operator) {
        this.operator = operator;
    }
}
