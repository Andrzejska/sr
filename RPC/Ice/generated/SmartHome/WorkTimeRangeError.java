//
// Copyright (c) ZeroC, Inc. All rights reserved.
//
//
// Ice version 3.7.7
//
// <auto-generated>
//
// Generated from file `smarthome.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package SmartHome;

public class WorkTimeRangeError extends com.zeroc.Ice.UserException
{
    public WorkTimeRangeError()
    {
        this.reason = "Work time value out of range.";
    }

    public WorkTimeRangeError(Throwable cause)
    {
        super(cause);
        this.reason = "Work time value out of range.";
    }

    public WorkTimeRangeError(String reason)
    {
        this.reason = reason;
    }

    public WorkTimeRangeError(String reason, Throwable cause)
    {
        super(cause);
        this.reason = reason;
    }

    public String ice_id()
    {
        return "::SmartHome::WorkTimeRangeError";
    }

    public String reason;

    /** @hidden */
    @Override
    protected void _writeImpl(com.zeroc.Ice.OutputStream ostr_)
    {
        ostr_.startSlice("::SmartHome::WorkTimeRangeError", -1, true);
        ostr_.writeString(reason);
        ostr_.endSlice();
    }

    /** @hidden */
    @Override
    protected void _readImpl(com.zeroc.Ice.InputStream istr_)
    {
        istr_.startSlice();
        reason = istr_.readString();
        istr_.endSlice();
    }

    /** @hidden */
    public static final long serialVersionUID = -2036625299L;
}
