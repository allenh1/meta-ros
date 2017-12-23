# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The diagnostic_analysis package can convert a log of diagnostics data     into a"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native diagnostic-msgs rosbag roslib rostest"
SRC_URI = "https://github.com/ros-gbp/diagnostics-release/archive/release/kinetic/diagnostic_analysis/1.9.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "71df36392ace62e302f8f7fc47b887d8"
SRC_URI[sha256sum] = "e3dc20919b4dbdacf8fea49e0193dd384b1186deed41bf3c352885f85d69739d"
S = "${WORKDIR}/diagnostics-release-release-kinetic-diagnostic_analysis-1.9.2-0"

inherit catkin
