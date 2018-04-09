package com.kdx.pojo;

public class Kdx {
    private Integer timecardid;

    private String department;

    private Integer workattendance;

    private String workname;

    private Integer worktobe;

    private String workto;

    private Integer worklate;

    private Integer leaveearly;

    private Integer absenteeism;

    private Integer overtime;

    private Integer goout;

    private Integer workgoout;

    private Integer worktime;

    private Integer signnumber;

    private Integer sign;

    private Integer signout;

    private Integer notsign;

    private Integer notsignout;

    private Integer askforleave;

    private Integer getout;

    private Integer sickleave;

    private Integer compassionateleave;

    private Integer parentalleave;

    private String peacetime;

    private String weekend;

    private String festival;

    private String attendancetime;

    private String overtimework;

    private String weekendovertime;

    private String holidayovertime;

    public Integer getTimecardid() {
        return timecardid;
    }

    public void setTimecardid(Integer timecardid) {
        this.timecardid = timecardid;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public Integer getWorkattendance() {
        return workattendance;
    }

    public void setWorkattendance(Integer workattendance) {
        this.workattendance = workattendance;
    }

    public String getWorkname() {
        return workname;
    }

    public void setWorkname(String workname) {
        this.workname = workname == null ? null : workname.trim();
    }

    public Integer getWorktobe() {
        return worktobe;
    }

    public void setWorktobe(Integer worktobe) {
        this.worktobe = worktobe;
    }

    public String getWorkto() {
        return workto;
    }

    public void setWorkto(String workto) {
        this.workto = workto;
    }

    public Integer getWorklate() {
        return worklate;
    }

    public void setWorklate(Integer worklate) {
        this.worklate = worklate;
    }

    public Integer getLeaveearly() {
        return leaveearly;
    }

    public void setLeaveearly(Integer leaveearly) {
        this.leaveearly = leaveearly;
    }

    public Integer getAbsenteeism() {
        return absenteeism;
    }

    public void setAbsenteeism(Integer absenteeism) {
        this.absenteeism = absenteeism;
    }

    public Integer getOvertime() {
        return overtime;
    }

    public void setOvertime(Integer overtime) {
        this.overtime = overtime;
    }

    public Integer getGoout() {
        return goout;
    }

    public void setGoout(Integer goout) {
        this.goout = goout;
    }

    public Integer getWorkgoout() {
        return workgoout;
    }

    public void setWorkgoout(Integer workgoout) {
        this.workgoout = workgoout;
    }

    public Integer getWorktime() {
        return worktime;
    }

    public void setWorktime(Integer worktime) {
        this.worktime = worktime;
    }

    public Integer getSignnumber() {
        return signnumber;
    }

    public void setSignnumber(Integer signnumber) {
        this.signnumber = signnumber;
    }

    public Integer getSign() {
        return sign;
    }

    public void setSign(Integer sign) {
        this.sign = sign;
    }

    public Integer getSignout() {
        return signout;
    }

    public void setSignout(Integer signout) {
        this.signout = signout;
    }

    public Integer getNotsign() {
        return notsign;
    }

    public void setNotsign(Integer notsign) {
        this.notsign = notsign;
    }

    public Integer getNotsignout() {
        return notsignout;
    }

    public void setNotsignout(Integer notsignout) {
        this.notsignout = notsignout;
    }

    public Integer getAskforleave() {
        return askforleave;
    }

    public void setAskforleave(Integer askforleave) {
        this.askforleave = askforleave;
    }

    public Integer getGetout() {
        return getout;
    }

    public void setGetout(Integer getout) {
        this.getout = getout;
    }

    public Integer getSickleave() {
        return sickleave;
    }

    public void setSickleave(Integer sickleave) {
        this.sickleave = sickleave;
    }

    public Integer getCompassionateleave() {
        return compassionateleave;
    }

    public void setCompassionateleave(Integer compassionateleave) {
        this.compassionateleave = compassionateleave;
    }

    public Integer getParentalleave() {
        return parentalleave;
    }

    public void setParentalleave(Integer parentalleave) {
        this.parentalleave = parentalleave;
    }

	public String getPeacetime() {
		return peacetime;
	}

	public void setPeacetime(String peacetime) {
		this.peacetime = peacetime;
	}

	public String getWeekend() {
		return weekend;
	}

	public void setWeekend(String weekend) {
		this.weekend = weekend;
	}

	public String getFestival() {
		return festival;
	}

	public void setFestival(String festival) {
		this.festival = festival;
	}

	public String getAttendancetime() {
		return attendancetime;
	}

	public void setAttendancetime(String attendancetime) {
		this.attendancetime = attendancetime;
	}

	public String getOvertimework() {
		return overtimework;
	}

	public void setOvertimework(String overtimework) {
		this.overtimework = overtimework;
	}

	public String getWeekendovertime() {
		return weekendovertime;
	}

	public void setWeekendovertime(String weekendovertime) {
		this.weekendovertime = weekendovertime;
	}

	public String getHolidayovertime() {
		return holidayovertime;
	}

	public void setHolidayovertime(String holidayovertime) {
		this.holidayovertime = holidayovertime;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Kdx [timecardid=" + timecardid + ", department=" + department + ", workattendance=" + workattendance
				+ ", workname=" + workname + ", worktobe=" + worktobe + ", workto=" + workto + ", worklate=" + worklate
				+ ", leaveearly=" + leaveearly + ", absenteeism=" + absenteeism + ", overtime=" + overtime + ", goout="
				+ goout + ", workgoout=" + workgoout + ", worktime=" + worktime + ", signnumber=" + signnumber
				+ ", sign=" + sign + ", signout=" + signout + ", notsign=" + notsign + ", notsignout=" + notsignout
				+ ", askforleave=" + askforleave + ", getout=" + getout + ", sickleave=" + sickleave
				+ ", compassionateleave=" + compassionateleave + ", parentalleave=" + parentalleave + ", peacetime="
				+ peacetime + ", weekend=" + weekend + ", festival=" + festival + ", attendancetime=" + attendancetime
				+ ", overtimework=" + overtimework + ", weekendovertime=" + weekendovertime + ", holidayovertime="
				+ holidayovertime + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((absenteeism == null) ? 0 : absenteeism.hashCode());
		result = prime * result + ((askforleave == null) ? 0 : askforleave.hashCode());
		result = prime * result + ((attendancetime == null) ? 0 : attendancetime.hashCode());
		result = prime * result + ((compassionateleave == null) ? 0 : compassionateleave.hashCode());
		result = prime * result + ((department == null) ? 0 : department.hashCode());
		result = prime * result + ((festival == null) ? 0 : festival.hashCode());
		result = prime * result + ((getout == null) ? 0 : getout.hashCode());
		result = prime * result + ((goout == null) ? 0 : goout.hashCode());
		result = prime * result + ((holidayovertime == null) ? 0 : holidayovertime.hashCode());
		result = prime * result + ((leaveearly == null) ? 0 : leaveearly.hashCode());
		result = prime * result + ((notsign == null) ? 0 : notsign.hashCode());
		result = prime * result + ((notsignout == null) ? 0 : notsignout.hashCode());
		result = prime * result + ((overtime == null) ? 0 : overtime.hashCode());
		result = prime * result + ((overtimework == null) ? 0 : overtimework.hashCode());
		result = prime * result + ((parentalleave == null) ? 0 : parentalleave.hashCode());
		result = prime * result + ((peacetime == null) ? 0 : peacetime.hashCode());
		result = prime * result + ((sickleave == null) ? 0 : sickleave.hashCode());
		result = prime * result + ((sign == null) ? 0 : sign.hashCode());
		result = prime * result + ((signnumber == null) ? 0 : signnumber.hashCode());
		result = prime * result + ((signout == null) ? 0 : signout.hashCode());
		result = prime * result + ((timecardid == null) ? 0 : timecardid.hashCode());
		result = prime * result + ((weekend == null) ? 0 : weekend.hashCode());
		result = prime * result + ((weekendovertime == null) ? 0 : weekendovertime.hashCode());
		result = prime * result + ((workattendance == null) ? 0 : workattendance.hashCode());
		result = prime * result + ((workgoout == null) ? 0 : workgoout.hashCode());
		result = prime * result + ((worklate == null) ? 0 : worklate.hashCode());
		result = prime * result + ((workname == null) ? 0 : workname.hashCode());
		result = prime * result + ((worktime == null) ? 0 : worktime.hashCode());
		result = prime * result + ((workto == null) ? 0 : workto.hashCode());
		result = prime * result + ((worktobe == null) ? 0 : worktobe.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Kdx other = (Kdx) obj;
		if (absenteeism == null) {
			if (other.absenteeism != null)
				return false;
		} else if (!absenteeism.equals(other.absenteeism))
			return false;
		if (askforleave == null) {
			if (other.askforleave != null)
				return false;
		} else if (!askforleave.equals(other.askforleave))
			return false;
		if (attendancetime == null) {
			if (other.attendancetime != null)
				return false;
		} else if (!attendancetime.equals(other.attendancetime))
			return false;
		if (compassionateleave == null) {
			if (other.compassionateleave != null)
				return false;
		} else if (!compassionateleave.equals(other.compassionateleave))
			return false;
		if (department == null) {
			if (other.department != null)
				return false;
		} else if (!department.equals(other.department))
			return false;
		if (festival == null) {
			if (other.festival != null)
				return false;
		} else if (!festival.equals(other.festival))
			return false;
		if (getout == null) {
			if (other.getout != null)
				return false;
		} else if (!getout.equals(other.getout))
			return false;
		if (goout == null) {
			if (other.goout != null)
				return false;
		} else if (!goout.equals(other.goout))
			return false;
		if (holidayovertime == null) {
			if (other.holidayovertime != null)
				return false;
		} else if (!holidayovertime.equals(other.holidayovertime))
			return false;
		if (leaveearly == null) {
			if (other.leaveearly != null)
				return false;
		} else if (!leaveearly.equals(other.leaveearly))
			return false;
		if (notsign == null) {
			if (other.notsign != null)
				return false;
		} else if (!notsign.equals(other.notsign))
			return false;
		if (notsignout == null) {
			if (other.notsignout != null)
				return false;
		} else if (!notsignout.equals(other.notsignout))
			return false;
		if (overtime == null) {
			if (other.overtime != null)
				return false;
		} else if (!overtime.equals(other.overtime))
			return false;
		if (overtimework == null) {
			if (other.overtimework != null)
				return false;
		} else if (!overtimework.equals(other.overtimework))
			return false;
		if (parentalleave == null) {
			if (other.parentalleave != null)
				return false;
		} else if (!parentalleave.equals(other.parentalleave))
			return false;
		if (peacetime == null) {
			if (other.peacetime != null)
				return false;
		} else if (!peacetime.equals(other.peacetime))
			return false;
		if (sickleave == null) {
			if (other.sickleave != null)
				return false;
		} else if (!sickleave.equals(other.sickleave))
			return false;
		if (sign == null) {
			if (other.sign != null)
				return false;
		} else if (!sign.equals(other.sign))
			return false;
		if (signnumber == null) {
			if (other.signnumber != null)
				return false;
		} else if (!signnumber.equals(other.signnumber))
			return false;
		if (signout == null) {
			if (other.signout != null)
				return false;
		} else if (!signout.equals(other.signout))
			return false;
		if (timecardid == null) {
			if (other.timecardid != null)
				return false;
		} else if (!timecardid.equals(other.timecardid))
			return false;
		if (weekend == null) {
			if (other.weekend != null)
				return false;
		} else if (!weekend.equals(other.weekend))
			return false;
		if (weekendovertime == null) {
			if (other.weekendovertime != null)
				return false;
		} else if (!weekendovertime.equals(other.weekendovertime))
			return false;
		if (workattendance == null) {
			if (other.workattendance != null)
				return false;
		} else if (!workattendance.equals(other.workattendance))
			return false;
		if (workgoout == null) {
			if (other.workgoout != null)
				return false;
		} else if (!workgoout.equals(other.workgoout))
			return false;
		if (worklate == null) {
			if (other.worklate != null)
				return false;
		} else if (!worklate.equals(other.worklate))
			return false;
		if (workname == null) {
			if (other.workname != null)
				return false;
		} else if (!workname.equals(other.workname))
			return false;
		if (worktime == null) {
			if (other.worktime != null)
				return false;
		} else if (!worktime.equals(other.worktime))
			return false;
		if (workto == null) {
			if (other.workto != null)
				return false;
		} else if (!workto.equals(other.workto))
			return false;
		if (worktobe == null) {
			if (other.worktobe != null)
				return false;
		} else if (!worktobe.equals(other.worktobe))
			return false;
		return true;
	}


}