# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=9;endline=9;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin diagnostic_msgs rospy"
SRC_URI = "https://github.com/ros-gbp/diagnostics-release/archive/release/lunar/rosdiagnostic/1.9.0-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "524e5a95f98233174e292451a5ee4acd"
SRC_URI[sha256sum] = "a1948cefa56512507ead781a789a5286112f89fd12f0fb88fc84ab215dba1d0b"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
