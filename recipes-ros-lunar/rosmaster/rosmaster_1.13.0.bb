# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS  implementation."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=;endline=;md5="

DEPENDS = "catkin python-defusedxml rosgraph"
SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/lunar/rosmaster/1.13.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "98153d122c144768fb79c1ec665874da"
SRC_URI[sha256sum] = "3c8e7f3897824f9bd31035ef8b7d9eb9ee6f840c345a6a26b8dd0b066a815f2c"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
