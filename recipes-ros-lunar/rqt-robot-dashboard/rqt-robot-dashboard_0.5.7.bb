# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_robot_dashboard provides an infrastructure for building robot dashboard plug"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin diagnostic-msgs python-qt-binding qt-gui rospy rqt-console rqt-gui rqt-gui-py rqt-nav-view rqt-robot-monitor"
SRC_URI = "https://github.com/ros-gbp/rqt_robot_dashboard-release/archive/release/lunar/rqt_robot_dashboard/0.5.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6bf2b3a6d42babb183befac1bcad8398"
SRC_URI[sha256sum] = "bd5df61568d54f6ecd2b7826f6ef9f39bae40d53dc9d46c0984ee7eba2e7501f"
S = "${WORKDIR}/rqt_robot_dashboard-release-release-lunar-rqt_robot_dashboard-0.5.7-0"

inherit catkin
